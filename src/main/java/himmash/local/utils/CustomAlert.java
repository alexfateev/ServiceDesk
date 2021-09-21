package himmash.local.utils;

import himmash.local.database.Const;
import javafx.scene.control.Alert;

public class CustomAlert {

    public static  void showAlert(Alert.AlertType type, String header, String message){
        showAlert(type, header, message, false);
    }
    public static void showAlert(Alert.AlertType type, String header, String message, boolean writeToLog) {
        if(writeToLog){
            Log.writeToLog(message);
        }
        Alert alert = new Alert(type);
        alert.setTitle(Const.titleApp);
        alert.setHeaderText(header);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
