import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;

public class ComboBoxFormController {

    public ComboBox<String> cmbLanguages;
    public TextField txtAnswer;
    public ComboBox<String> cmbAge;
    public TextField ageAnswer;

    public void initialize(){
        cmbLanguages.getItems().addAll(
                "Java",
                "C#",
                "C++",
                "Swift",
                "Java Script"
        );
        cmbAge.getItems().addAll(
                "25",
                "30",
                "40",
                "50"
                );
        cmbLanguages.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(oldValue);
            System.out.println(newValue);
            txtAnswer.setText(newValue);
        });
        cmbAge.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
           System.out.println(oldValue);
           System.out.println(newValue);
            ageAnswer.setText(newValue);
        });

    }
}
