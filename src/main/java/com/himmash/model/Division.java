package com.himmash.model;

import javafx.beans.property.*;

// подразделение t,fyf 
public class Division {
    private StringProperty name;
    private StringProperty comment;
    private LongProperty id;
    private LongProperty pid;
    private BooleanProperty disable;

    public Division() {
        this.name = new SimpleStringProperty("");
        this.comment = new SimpleStringProperty("");
        this.id = new SimpleLongProperty(0);
        this.pid = new SimpleLongProperty(0);
        this.disable = new SimpleBooleanProperty(false);
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
