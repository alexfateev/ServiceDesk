package com.himmash.alex;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.StringProperty;

/*
Класс описывающий поставщика техники или услуг
 */

public class Vendor {
    private LongProperty id;
    private StringProperty name;
    private StringProperty contactDetails;
    private StringProperty comment;
    private StringProperty address;
    private BooleanProperty disable;
}
