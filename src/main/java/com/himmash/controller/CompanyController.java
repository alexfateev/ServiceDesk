package com.himmash.controller;

import com.himmash.dao.CompanyDAO;
import com.himmash.dao.CompanyDbDAO;

public class CompanyController {
    private final CompanyDbDAO dao;

    public CompanyController() {
        dao = new CompanyDbDAO();
    }
}
