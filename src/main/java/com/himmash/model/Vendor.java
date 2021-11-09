package com.himmash.model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.StringProperty;

public class Vendor {
    /*
    Класс описывающий поставщика товаров, услуг
    Содержит следующие поля:
    -id
    -наименование (name)
    -контакты (contact)
    -адрес (address)
    -комментарий (comment)
    -доступность(включен/отключен) (disable)
     */

    private StringProperty name;
    private StringProperty contact;
    private StringProperty adress;
    private StringProperty comment;
    private BooleanProperty disable;

    public Vendor() {
        this.name = name;
        this.contact = contact;
        this.adress = adress;
        this.comment = comment;
        this.disable = disable;
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

    public String getContact() {
        return contact.get();
    }

    public StringProperty contactProperty() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact.set(contact);
    }

    public String getAdress() {
        return adress.get();
    }

    public StringProperty adressProperty() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress.set(adress);
    }

    public String getComment() {
        return comment.get();
    }

    public StringProperty commentProperty() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment.set(comment);
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
