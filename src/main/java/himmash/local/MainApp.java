package himmash.local;

import himmash.local.database.DBHandler;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import static himmash.local.database.Const.*;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {

        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();

        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + "." + "" +
                "\nComputerName: " + SystemInfo.getComputerName() + ", User: " + SystemInfo.getFullUserName());
        var scene = new Scene(new StackPane(label), 640, 480);

        stage.getIcons().add(new Image("file:resources/haski.png"));
        stage.setTitle(titleApp);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}