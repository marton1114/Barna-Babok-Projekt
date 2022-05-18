package hu.unideb.inf;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLMainMenuScene.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setTitle("Göter");
        stage.setScene(scene);
        stage.show();

        stage.setOnCloseRequest(event -> {
            event.consume();
            logout(stage);
        });
    }

    public static void logout(Stage stage) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Kilépés");
        alert.setContentText("Biztos ki szeretnél lépni az alkalmazásból?");

        if (alert.showAndWait().get() == ButtonType.OK) {
            stage.close();
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
