package com.himmash.dao;

import com.himmash.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    //Добавление сотрудника - возвращает ID добавленного сотрудника
    public Long addEmployee(Employee employee);

    //Редактирование сотрудника
    public void updateEmployee(Employee employee);

    //Удаление сотрудника по его ID
    public void deleteEmployee(Long employeeId);

    //Получение сотрудника
    public Employee getEmployee(Long employeeId);

    //Получение списка сотрудников
    public List<Employee> findEmployee();
}
