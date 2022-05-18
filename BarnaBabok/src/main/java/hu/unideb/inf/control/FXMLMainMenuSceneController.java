package hu.unideb.inf.control;

import hu.unideb.inf.MainApp;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FXMLMainMenuSceneController {
    Stage stage;

    @FXML
    private Pane mainMenuScenePane;

    @FXML
    void handleMakeAConfigButtonClicked(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/FXMLSearchPageScene.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleExitButtonClicked(MouseEvent event) {
        stage = (Stage) mainMenuScenePane.getScene().getWindow();
        MainApp.logout(stage);
    }


}
