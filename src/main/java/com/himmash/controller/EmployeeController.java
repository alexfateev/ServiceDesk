package com.himmash.controller;

import com.himmash.dao.EmployeeDbDAO;
import com.himmash.model.Employee;

import java.util.ArrayList;

public class EmployeeController {

    private final EmployeeDbDAO dao;

    public EmployeeController() {
        dao = new EmployeeDbDAO();
    }

    public Long add(Employee employee) {
        long result = -1L;
        try {
            result = dao.addEmployee(employee);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return result;
        }
    }

    public void update(Employee employee) {
        try {
            dao.updateEmployee(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(Employee employee) {
        try {
            dao.deleteEmployee(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Employee> find(Employee employee) {
        ArrayList<Employee> list = new ArrayList<>();
        try {
            list = dao.findEmployee();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return list;
        }
    }
}
