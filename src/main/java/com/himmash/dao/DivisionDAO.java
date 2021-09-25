package com.himmash.dao;

import com.himmash.model.Division;

import java.util.ArrayList;

public interface DivisionDAO {
    //Добавление подразделение. Возвращает ID добавленного подразделения
    public Long addDivision(Division division);

    //Редактирование подразделение
    public void updateDivision(Division division);

    //Удаление подразделения
    public void deleteDivision(Long divisionId);

    //Получение подразделения
    public Division getDivision(Long divisionId);

    //Получение списка подразделений
    public ArrayList<Division> findDivision();

}
