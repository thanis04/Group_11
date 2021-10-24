package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {

    public AnchorPane MainFormContext;

    public void btnOrderForm(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) MainFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader
                .load(getClass().getResource("../view/orderForm.fxml"))));
    }

    public void btnItemForm(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) MainFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader
                .load(getClass().getResource("../view/itemForm.fxml"))));
    }
}
