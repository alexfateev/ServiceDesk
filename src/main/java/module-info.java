module ServiceDesk {
    requires javafx.controls;
    requires javafx.base;

    opens org.example to javafx.fxml;
    exports org.example;
}