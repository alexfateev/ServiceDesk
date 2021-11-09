package com.himmash.model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

public class DocSupply {
    /*
    Класс описывающий документ поступления
    Содержит следущие поля
    -id
    -Поставщик (vendor)
    -Дата документа (date)
    -Наименование (name)
    -Комментарий (comment)
    -Сохранен (saved)
     */
    private StringProperty vendor;
    private StringProperty name;
    private StringProperty commet;
    private LongProperty id;
    private LongProperty pid;
    private BooleanProperty saved;
    private ObjectProperty<LocalDate> date;

    public String getVendor() {
        return vendor.get();
    }

    public StringProperty vendorProperty() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor.set(vendor);
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

    public String getCommet() {
        return commet.get();
    }

    public StringProperty commetProperty() {
        return commet;
    }

    public void setCommet(String commet) {
        this.commet.set(commet);
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

    public long getPid() {
        return pid.get();
    }

    public LongProperty pidProperty() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid.set(pid);
    }

    public boolean isSaved() {
        return saved.get();
    }

    public BooleanProperty savedProperty() {
        return saved;
    }

    public void setSaved(boolean saved) {
        this.saved.set(saved);
    }

    public LocalDate getDate() {
        return date.get();
    }

    public ObjectProperty<LocalDate> dateProperty() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date.set(date);
    }
}

