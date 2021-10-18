package com.himmash.alex;


import com.himmash.model.Employee;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

/*
Класс описывающий оборудование: наименование, тип оборудования, серийный номер, инв. номер и прочее
 */
public class Equipment {
    private LongProperty id;
    private ObjectProperty<EquipmentType> type;
    private StringProperty manufacturer;
    private StringProperty specifications;
    private StringProperty serialNumber;
    private StringProperty inventoryNumber;
    private StringProperty cardNumber;
    private StringProperty comment;
    private BooleanProperty disable;
    private ObjectProperty documentSupply;
    private ObjectProperty documentWriteOff;
    private ObjectProperty<Employee> employee;

}
