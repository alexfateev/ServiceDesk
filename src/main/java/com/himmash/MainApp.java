package com.himmash;

import com.himmash.utils.SystemInfo;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import static com.himmash.utils.Const.titleApp;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {

//        CustomAlert.showAlert(Alert.AlertType.ERROR,null,"Text of error",true);

        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();

        Label label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + "." + "" +
                "\nComputerName: " + SystemInfo.getComputerName() + ", User: " + SystemInfo.getFullUserName());
        ImageView image = new ImageView("file:resources/cat_upsidedown.png");
        VBox vBox = new VBox();
        vBox.setAlignment(Pos.TOP_CENTER);
        vBox.setSpacing(10);
        vBox.getChildren().addAll(image, label);
        var scene = new Scene(new StackPane(vBox), 640, 480);

        stage.getIcons().add(new Image("file:resources/cat-laptop-icon.png"));
        stage.setTitle(titleApp);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}