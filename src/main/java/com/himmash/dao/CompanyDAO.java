package com.himmash.dao;

import com.himmash.model.Company;

import java.util.ArrayList;

public interface CompanyDAO {
    public long insertCompany(Company company);

    public void updateCompany(Company company);

    public void deleteCompany(Company company);

    public Company getCompany(Company company);

    public ArrayList<Company> findCompany();
}
