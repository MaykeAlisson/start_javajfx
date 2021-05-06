package br.com.hellojfx.util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AlertsView {

    public static void showAlert(
            String title,
            String header,
            String content,
            AlertType type
    ){
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.show();
    }

}
