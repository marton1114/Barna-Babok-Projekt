package hu.unideb.inf;

import hu.unideb.inf.control.FXMLUISceneController;
import hu.unideb.inf.model.Model;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FMLUIScene.fxml"));
        Scene scene = new Scene(loader.load());
        ((FXMLUISceneController)loader.getController()).setModel(new Model());
        stage.setTitle("Students Register");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
