package com.himmash.dao;

import com.himmash.model.Division;
import com.himmash.utils.Const;
import com.himmash.utils.Utils;

import java.sql.*;
import java.util.ArrayList;

public class DivisionDbDAO implements DivisionDAO {
    public static final String SELECT_ONE = "SELECT * FROM " + Const.TABLE_DIVISION +
            " WHERE " + Const.DIVISION_ID + "=?";
    public static final String SELECT_ALL = "SELECT * FROM " + Const.TABLE_DIVISION;
    public static final String INSERT = "INSERT INTO " + Const.TABLE_DIVISION +
            "(" + Const.DIVISION_PID + "," + Const.DIVISION_NAME + "," +
            Const.DIVISION_COMPANY_ID + "," + Const.DIVISION_DISABLE + ") VALUES(?,?,?,?)";
    public static final String UPDATE = "UPDATE " + Const.TABLE_DIVISION +
            " SET " + Const.DIVISION_PID + "=?, " + Const.DIVISION_NAME + "=?," +
            Const.DIVISION_COMPANY_ID + "=?," + Const.DIVISION_DISABLE + "=? WHERE " + Const.DIVISION_ID + "=?";
    public static final String DELETE = "DELETE FROM " + Const.TABLE_DIVISION +
            " WHERE " + Const.DIVISION_ID + "=?";

    private SimpleConnectionBuilder builder;

    public DivisionDbDAO() {
        builder = new SimpleConnectionBuilder();
    }

    public DivisionDbDAO(SimpleConnectionBuilder builder) {
        this.builder = builder;
    }

    private Connection getConnection() throws SQLException {
        return builder.getConnection();
    }

    @Override
    public Long addDivision(Division division) {
        long result = -1L;
        try (PreparedStatement ps = getConnection().prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS)) {
            ps.setLong(1, division.getPid());
            ps.setString(2, division.getName());
            ps.setLong(3, 0);
            ps.setInt(4, Utils.boolToByte(division.isDisable()));
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                result = rs.getLong(1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }

    @Override
    public void updateDivision(Division division) {

    }

    @Override
    public void deleteDivision(Long divisionId) {
        try(PreparedStatement ps = getConnection().prepareStatement(DELETE)){
            ps.setLong(1,divisionId);
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Division getDivision(Long divisionId) {
        return null;
    }

    @Override
    public ArrayList<Division> findDivision() {
        return null;
    }
}
