package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import util.view.Alerts;

import static javafx.scene.control.Alert.AlertType.INFORMATION;

public class HelloJFxController {

    @FXML
    private Button btTeste;

    @FXML
    public void onBtTesteAction(){
        Alerts.showAlert("Alert Title", null, "Hello", INFORMATION);
    }

}
