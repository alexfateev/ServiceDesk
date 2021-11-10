package com.himmash.model;

import javafx.beans.property.*;

import java.time.LocalDate;

public class Employee {
    private StringProperty fistName;
    private StringProperty lastName;
    private StringProperty middleName;
    private ObjectProperty<LocalDate> dob;
    private StringProperty position;
    private StringProperty phoneMobile;
    private StringProperty phoneLocal;

    public Employee() {
        this.fistName = new SimpleStringProperty("");
        this.lastName = new SimpleStringProperty("");
        this.middleName = new SimpleStringProperty("");
        this.dob = dob;
        this.position = position;
        this.phoneMobile = phoneMobile;
        this.phoneLocal = phoneLocal;
        this.phoneCity = phoneCity;
        this.email = email;
        this.division = division;
        this.comment = comment;
        this.id = id;
        this.disable = disable;
    }

    public String getFistName() {
        return fistName.get();
    }

    public StringProperty fistNameProperty() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName.set(fistName);
    }

    public String getLastName() {
        return lastName.get();
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public String getMiddleName() {
        return middleName.get();
    }

    public StringProperty middleNameProperty() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName.set(middleName);
    }

    public LocalDate getDob() {
        return dob.get();
    }

    public ObjectProperty<LocalDate> dobProperty() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob.set(dob);
    }

    public String getPosition() {
        return position.get();
    }

    public StringProperty positionProperty() {
        return position;
    }

    public void setPosition(String position) {
        this.position.set(position);
    }

    public String getPhoneMobile() {
        return phoneMobile.get();
    }

    public StringProperty phoneMobileProperty() {
        return phoneMobile;
    }

    public void setPhoneMobile(String phoneMobile) {
        this.phoneMobile.set(phoneMobile);
    }

    public String getPhoneLocal() {
        return phoneLocal.get();
    }

    public StringProperty phoneLocalProperty() {
        return phoneLocal;
    }

    public void setPhoneLocal(String phoneLocal) {
        this.phoneLocal.set(phoneLocal);
    }

    public String getPhoneCity() {
        return phoneCity.get();
    }

    public StringProperty phoneCityProperty() {
        return phoneCity;
    }

    public void setPhoneCity(String phoneCity) {
        this.phoneCity.set(phoneCity);
    }

    public String getEmail() {
        return email.get();
    }

    public StringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public Division getDivision() {
        return division.get();
    }

    public ObjectProperty<Division> divisionProperty() {
        return division;
    }

    public void setDivision(Division division) {
        this.division.set(division);
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

    public long getId() {
        return id.get();
    }

    public LongProperty idProperty() {
        return id;
    }

    public void setId(long id) {
        this.id.set(id);
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

    private StringProperty phoneCity;
    private StringProperty email;
    private ObjectProperty<Division> division;
    private StringProperty comment;
    private LongProperty id;
    private BooleanProperty disable;

}
