package com.himmash.model;


import javafx.beans.property.*;

public class Company {
    private LongProperty id;
    private StringProperty name;
    private BooleanProperty disable;

    public Company() {
        id = new SimpleLongProperty(-1L);
        name = new SimpleStringProperty("");
        disable = new SimpleBooleanProperty(false);
    }

    public Company(long id, String name, boolean disable) {
        this.id = new SimpleLongProperty(id);
        this.name = new SimpleStringProperty(name);
        this.disable = new SimpleBooleanProperty(disable);
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

    public boolean isDisable() {
        return disable.get();
    }

    public BooleanProperty disableProperty() {
        return disable;
    }

    public void setDisable(boolean disable) {
        this.disable.set(disable);
    }
}
