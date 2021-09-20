module ServiceDesk {
    requires javafx.controls;
    requires javafx.base;

    opens himmash.local to javafx.fxml;
    exports himmash.local;
}