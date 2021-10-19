package com.himmash.controller;

import com.himmash.dao.DivisionDAO;
import com.himmash.dao.DivisionDbDAO;
import com.himmash.model.Division;

import java.util.ArrayList;

public class DivisionController {

    private final DivisionDAO dao;

    public DivisionController() {
        this.dao = new DivisionDbDAO();
    }

    public Long add(Division division) {
        long result = -1L;
        try {
            result = dao.addDivision(division);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return result;
        }
    }

    public void update(Division division) {
        try {
            dao.updateDivision(division);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(Division division) {
        try {
            dao.deleteDivision(division.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Division> find() {
        ArrayList<Division> list = new ArrayList<>();
        try {
            list = dao.findDivision();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return list;
        }
    }
}
