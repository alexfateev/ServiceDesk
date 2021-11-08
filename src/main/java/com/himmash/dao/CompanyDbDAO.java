package com.himmash.dao;

import com.himmash.model.Company;
import com.himmash.utils.Const;
import com.himmash.utils.Utils;

import java.sql.*;
import java.util.ArrayList;


public class CompanyDbDAO implements CompanyDAO {
    private static final String SELECT = "SELECT * FROM " + Const.TABLE_COMPANY;
    private static final String SELECT_ONE = "SELECT * FROM " + Const.TABLE_COMPANY +
            " WHERE " + Const.COMPANY_ID + "=?";
    private static final String INSERT = "INSERT INTO " + Const.TABLE_COMPANY +
            "(" + Const.COMPANY_NAME + ", " + Const.COMPANY_DISABLE + ") VALUES(?,?)";
    private static final String UPDATE = "UPDATE " + Const.TABLE_COMPANY +
            " SET " + Const.COMPANY_NAME + "=?, " + Const.COMPANY_DISABLE + "=?" +
            " WHERE " + Const.COMPANY_ID + "=?";
    private static final String DELETE = "DELETE FROM " + Const.TABLE_COMPANY +
            " WHERE " + Const.COMPANY_NAME + "=?";

    private ConnectionBuilder builder = new SimpleConnectionBuilder();

    private Connection getConnection() throws SQLException {
        return builder.getConnection();
    }

    public CompanyDbDAO(ConnectionBuilder builder) {
        this.builder = builder;
    }

    public CompanyDbDAO() {
        builder = new SimpleConnectionBuilder();
    }

    @Override
    public long insertCompany(Company company) {
        long result = -1L;
        try (PreparedStatement ps = getConnection().prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, company.getName());
            ps.setInt(2, Utils.boolToByte(company.isDisable()));
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                result = rs.getLong(1);
            }
            rs.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }

    @Override
    public void updateCompany(Company company) {
        try (PreparedStatement ps = getConnection().prepareStatement(UPDATE)) {
            ps.setString(1, company.getName());
            ps.setInt(2, Utils.boolToByte(company.isDisable()));
            ps.setLong(3, company.getId());
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void deleteCompany(Company company) {
        try (PreparedStatement ps = getConnection().prepareStatement(DELETE)) {
            ps.setLong(1, company.getId());
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Company getCompany(Company company) {
        Company company1 = new Company();
        try (PreparedStatement ps = getConnection().prepareStatement(SELECT_ONE)) {
            ps.setLong(1, company.getId());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                company1 = fillCompany(rs);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return company1;
    }

    @Override
    public ArrayList<Company> findCompany() {
        ArrayList<Company> list = new ArrayList<>();
        try (PreparedStatement ps = getConnection().prepareStatement(SELECT)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(fillCompany(rs));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    private Company fillCompany(ResultSet rs) throws SQLException {
        Company company = new Company();
        company.setId(rs.getLong(Const.COMPANY_ID));
        company.setName(rs.getString(Const.COMPANY_NAME));
        company.setDisable(Utils.bitToBool(rs.getInt(Const.COMPANY_DISABLE)));
        return company;
    }
}
