package com.himmash.model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

public class Employee {
    private StringProperty fistName;
    private StringProperty lastName;
    private StringProperty middleName;
    //дата рождения
    private StringProperty position;
    private StringProperty phoneMobile;
    private StringProperty phoneLocal;
    private StringProperty phoneCity;
    private StringProperty email;
    private ObjectProperty<Division> division;
    private StringProperty comment;
    private LongProperty id;
    private BooleanProperty disable;



}
