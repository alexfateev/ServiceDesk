package com.himmash.dao;

import com.himmash.model.Employee;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDbDAO implements EmployeeDAO {

    private static final String SELECT = "";
    private static final String SELECT_ONE = "";
    private static final String INSERT = "";
    private static final String UPDATE = "";
    private static final String DELETE = "";

    private ConnectionBuilder builder = new SimpleConnectionBuilder();

    private Connection getConnection() throws SQLException {
        return builder.getConnection();
    }

    @Override
    public Long addEmployee(Employee employee) {
        return null;
    }

    @Override
    public void updateEmployee(Employee employee) {

    }

    @Override
    public void deleteEmployee(Long employeeId) {

    }

    @Override
    public Employee getEmployee(Long employeeId) {
        return null;
    }

    @Override
    public List<Employee> findEmployee() {
        return null;
    }
}
