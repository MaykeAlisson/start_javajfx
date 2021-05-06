package br.com.hellojfx.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import br.com.hellojfx.util.AlertsView;

import static javafx.scene.control.Alert.AlertType.INFORMATION;

public class HelloJFxController {

    @FXML
    private Button btTeste;

    @FXML
    public void onBtTesteAction(){
        AlertsView.showAlert("Alert Title", null, "Hello", INFORMATION);
    }

}
