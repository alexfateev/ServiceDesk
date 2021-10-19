package com.himmash.dao;

import com.himmash.model.Company;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class CompanyDbDAO implements CompanyDAO {
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
    public long insertCompany(Company company) {
        return 0;
    }

    @Override
    public void updateCompany(Company company) {

    }

    @Override
    public void deleteCompany(Company company) {

    }

    @Override
    public void getCompany(Company company) {

    }

    @Override
    public ArrayList<Company> findCompany() {
        return null;
    }
}
