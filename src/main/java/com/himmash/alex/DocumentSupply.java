package com.himmash.alex;

import com.mysql.cj.conf.BooleanProperty;
import com.mysql.cj.conf.LongProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

public class DocumentSupply {
    private LongProperty id;
    //private ObjectProperty documentDate;
    private ObjectProperty<Vendor> vendor;
    private StringProperty name;
    private StringProperty comment;
    private BooleanProperty disable;

}
