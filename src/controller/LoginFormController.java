package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public AnchorPane loginFormContext;

    public void btnLogin(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) loginFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader
                .load(getClass().getResource("../view/MainForm.fxml"))));
    }

    public void exit(ActionEvent actionEvent) {
        System.exit(0);
    }
}
