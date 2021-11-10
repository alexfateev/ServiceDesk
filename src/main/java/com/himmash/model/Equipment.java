package com.himmash.model;

import javafx.beans.property.*;

import java.time.LocalDate;

public class Equipment {
    /*
    Класс описывающий единицу техники
    Содержит следующие поля:

     */
    private ObjectProperty<EquipmentType> equipmentType;
    private StringProperty description; //описание
    private StringProperty serialnumber;
    private StringProperty inventorynumber;
    private StringProperty cardnumber;
    private StringProperty comment;
    private LongProperty id;
    private BooleanProperty disable;

    public Equipment() {
        this.equipmentType = new SimpleObjectProperty<EquipmentType>(new EquipmentType());
        this.description = new SimpleStringProperty("");
        this.serialnumber = new SimpleStringProperty( "");
        this.inventorynumber = new SimpleStringProperty("");
        this.cardnumber = new SimpleStringProperty("");
        this.comment = new SimpleStringProperty("");
        this.id = new SimpleLongProperty(-1L);
        this.disable = new SimpleBooleanProperty(false);
    }

    public EquipmentType getEquipmentType() {
        return equipmentType.get();
    }

    public ObjectProperty<EquipmentType> equipmentTypeProperty() {
        return equipmentType;
    }

    public void setEquipmentType(EquipmentType equipmentType) {
        this.equipmentType.set(equipmentType);
    }

    public String getDescription() {
        return description.get();
    }

    public StringProperty descriptionProperty() {
        return description;
    }

    public void setDescription(String description) {
        this.description.set(description);
    }

    public String getSerialnumber() {
        return serialnumber.get();
    }

    public StringProperty serialnumberProperty() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber.set(serialnumber);
    }

    public String getInventorynumber() {
        return inventorynumber.get();
    }

    public StringProperty inventorynumberProperty() {
        return inventorynumber;
    }

    public void setInventorynumber(String inventorynumber) {
        this.inventorynumber.set(inventorynumber);
    }

    public String getCardnumber() {
        return cardnumber.get();
    }

    public StringProperty cardnumberProperty() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber.set(cardnumber);
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


}
