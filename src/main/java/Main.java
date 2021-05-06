import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void init() throws Exception {
        // algo a ser feito antes de carregar a aplicacao
    }


    @Override
    public void start(Stage stage) throws Exception {
        try{
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("view/HelloJFxView.fxml"));
            Parent parent = loader.load();
            stage.setTitle("Hello World");
            stage.setScene(new Scene(parent));
            stage.show();
        }catch (IOException e){
            e.printStackTrace();
        }
//        Parent parent = FXMLLoader.load(getClass().getResource("../view/HelloJFxView.fxml"));
//        StackPane stackPane = new StackPane(new Text("Hello World"));
//        stage.setTitle("Hello World");
////        stage.setScene(new Scene(parent));
//        stage.setScene(new Scene(stackPane, 300, 300));
//        stage.show();
    }

    @Override
    public void stop() {
        // algo a ser feito apos finalizar a aplicacao
    }
}
