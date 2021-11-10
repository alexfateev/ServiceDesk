package com.himmash.controller;

import com.himmash.MainApp;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import java.io.IOException;

public class MainController {

    @FXML
    private BorderPane borderPane;

    @FXML
    private ImageView image01;

    @FXML
    private Label btnDashboard;

    @FXML
    private Label btnHandbook;

    @FXML
    private Label btnTechnic;

    @FXML
    private HBox toolbarMain;

//    private Node handbookView;

    @FXML
    void initialize() {
//        btnHandbook.setOnMouseClicked(e->{
//            try {
//                setBtnHandbook();
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        });

    }

    @FXML
    private void setBtnHandbook() throws IOException {
        Node handbookView = FXMLLoader.load(MainApp.class.getResource("view/Handbook.fxml"));
        borderPane.setCenter(handbookView);
    }

    @FXML
    private void setBtnDashboard(){

    }

    @FXML
    private void  setBtnTechnic(){

    }
}
