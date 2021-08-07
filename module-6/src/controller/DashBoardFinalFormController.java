package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class DashBoardFinalFormController {
    public AnchorPane dashBoardContext;

    public void openWindowOne(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) dashBoardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/WindowAForm.fxml"))));

    }

    public void openWindowTwo(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) dashBoardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/WindowBForm.fxml"))));

    }
}
