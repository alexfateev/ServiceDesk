package com.himmash.service;

import com.himmash.dao.CompanyDbDAO;

public class CompanyController {
    private final CompanyDbDAO dao;

    public CompanyController() {
        dao = new CompanyDbDAO();
    }
}
