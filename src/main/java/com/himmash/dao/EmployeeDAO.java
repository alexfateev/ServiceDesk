package com.himmash.dao;

import com.himmash.model.Employee;

import java.util.ArrayList;

public interface EmployeeDAO {
    //Добавление сотрудника - возвращает ID добавленного сотрудника
    public Long addEmployee(Employee employee);

    //Редактирование сотрудника
    public void updateEmployee(Employee employee);

    //Удаление сотрудника по его ID
    public void deleteEmployee(Employee employeeId);

    //Получение сотрудника
    public Employee getEmployee(Employee employeeId);

    //Получение списка сотрудников
    public ArrayList<Employee> findEmployee();
}
