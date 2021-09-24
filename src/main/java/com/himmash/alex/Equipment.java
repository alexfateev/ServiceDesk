package com.himmash.alex;


import javafx.beans.property.*;

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

}
