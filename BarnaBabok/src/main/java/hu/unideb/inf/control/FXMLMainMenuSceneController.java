package hu.unideb.inf.control;

import hu.unideb.inf.MainApp;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
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
    private Pane creditsPane;

    @FXML
    void handleMakeAConfigButtonClicked(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/FXMLSearchPageScene.fxml"));
            Parent root = loader.load();

            FXMLSearchPageSceneController scene2Controller = loader.getController();
            scene2Controller.setSelectedTabPaneTab(0);

            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleCreditsButtonClicked() {
        creditsPane.setVisible(true);
    }

    @FXML
    void handleCreditsBackButtonPressed(MouseEvent event) {
        creditsPane.setVisible(false);
    }

    @FXML
    void handleConfigsButtonClicked(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/FXMLSearchPageScene.fxml"));
            Parent root = loader.load();

            FXMLSearchPageSceneController scene2Controller = loader.getController();
            scene2Controller.setSelectedTabPaneTab(2);

            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
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
