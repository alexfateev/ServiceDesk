package himmash.local;

import himmash.local.database.Const;
import javafx.scene.control.Alert;

public class CustomAlert {
    public static void showAlert(Alert.AlertType type, String header, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(Const.titleApp);
        alert.setHeaderText(header);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
