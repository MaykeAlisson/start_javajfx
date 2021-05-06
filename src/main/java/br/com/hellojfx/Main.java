package br.com.hellojfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static br.com.hellojfx.util.UtilArquivo.getResource;

public class Main extends Application {

    @Override
    public void init() throws Exception {
        // algo a ser feito antes de carregar a aplicacao
    }


    @Override
    public void start(Stage stage) throws Exception {
        try{
            final FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getResource("/fxml/HelloJFxView.fxml"));
            stage.setTitle("Hello World");
            stage.setScene(new Scene(loader.load()));
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
