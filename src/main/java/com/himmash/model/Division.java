package com.himmash.model;

import javafx.beans.property.*;

// подразделение t,fyf 
public class Division {
    private StringProperty name;
    private StringProperty comment;
    private LongProperty id;
    private LongProperty pid;
    private BooleanProperty disable;
    private BooleanProperty sync1c;
    private StringProperty sync1cID;
    private  StringProperty sync1cPID;
    private StringProperty sync1cName;

    public Division() {
        this.name = new SimpleStringProperty("");
        this.comment = new SimpleStringProperty("");
        this.id = new SimpleLongProperty(0);
        this.pid = new SimpleLongProperty(0);
        this.disable = new SimpleBooleanProperty(false);
        this.sync1c = new SimpleBooleanProperty(false);
        this.sync1cID = new SimpleStringProperty("");
        this.sync1cPID = new SimpleStringProperty("");
        this.sync1cName = new SimpleStringProperty("");
    }

    public boolean isSync1c() {
        return sync1c.get();
    }

    public BooleanProperty sync1cProperty() {
        return sync1c;
    }

    public void setSync1c(boolean sync1c) {
        this.sync1c.set(sync1c);
    }

    public String getSync1cID() {
        return sync1cID.get();
    }

    public StringProperty sync1cIDProperty() {
        return sync1cID;
    }

    public void setSync1cID(String sync1cID) {
        this.sync1cID.set(sync1cID);
    }

    public String getSync1cPID() {
        return sync1cPID.get();
    }

    public StringProperty sync1cPIDProperty() {
        return sync1cPID;
    }

    public void setSync1cPID(String sync1cPID) {
        this.sync1cPID.set(sync1cPID);
    }

    public String getSync1cName() {
        return sync1cName.get();
    }

    public StringProperty sync1cNameProperty() {
        return sync1cName;
    }

    public void setSync1cName(String sync1cName) {
        this.sync1cName.set(sync1cName);
    }

    public Division(String name, String comment, long id, long pid, boolean disable) {
        this.name = new SimpleStringProperty(name);
        this.comment = new SimpleStringProperty(comment);
        this.id = new SimpleLongProperty(id);
        this.pid = new SimpleLongProperty(pid);
        this.disable = new SimpleBooleanProperty(disable);
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

    public long getPid() {
        return pid.get();
    }

    public LongProperty pidProperty() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid.set(pid);
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
