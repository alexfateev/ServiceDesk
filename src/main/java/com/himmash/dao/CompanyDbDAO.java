package com.himmash.dao;

import com.himmash.model.Company;
import com.himmash.utils.Const;
import com.himmash.utils.Utils;

import java.sql.*;
import java.util.ArrayList;

public class CompanyDbDAO implements CompanyDAO {
    private static final String SELECT = "";
    private static final String SELECT_ONE = "";
    private static final String INSERT = "INSERT INTO " + Const.TABLE_COMPANY + " (" + Const.COMPANY_NAME + "," + Const.COMPANY_DISABLE + ") VALUES(?,?)";
    private static final String UPDATE = "";
    private static final String DELETE = "";

    private ConnectionBuilder builder = new SimpleConnectionBuilder();

    private Connection getConnection() throws SQLException {
        return builder.getConnection();
    }

    @Override
    public long insertCompany(Company company) {
        long result = -1L;
        try(PreparedStatement ps = getConnection().prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS)){
            ps.setString(1, company.getName());
            ps.setInt(2, Utils.boolToByte(company.isDisable()));
            ResultSet rs = ps.executeQuery();
            rs.next();
            result  = rs.getLong(1);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return result;
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
