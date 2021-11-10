package com.himmash.model;

import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class EquipmentType {
    /*
    Класс описывающий тип техники {Монитор, системный блок и т.п.}
    Содержит следующие поля:
    -id
    -наименование (name)
     */
    private LongProperty id;
    private StringProperty name;

    public EquipmentType() {
        this.id = new SimpleLongProperty( -1L);
        this.name = new SimpleStringProperty( "");
    }

    public long getId() {
        return id.get();
    }

    public LongProperty idProperty() {
        return id;
    }

    public void setId(long id) {
        this.id.set(id);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }
}

