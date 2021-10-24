package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class OrderFormController {

    public AnchorPane orderFormContext;

    public void backToHome(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) orderFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader
                .load(getClass().getResource("../view/MainForm.fxml"))));
    }
}
