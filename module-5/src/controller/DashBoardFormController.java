package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class DashBoardFormController {
    public AnchorPane context;

    public void openWindowOne(ActionEvent actionEvent) throws IOException {
       loadUi("Window A");
    }

    public void openWindowTwo(ActionEvent actionEvent) throws IOException {
        loadUi("WindowB");
    }
    void loadUi(String name) throws IOException {
        URL resource = getClass().getResource("../view/"+name+".fxml");
        Parent load = FXMLLoader.load(resource);
        context.getChildren().clear();
        context.getChildren().add(load);
    }
}
