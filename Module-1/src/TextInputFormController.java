import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class TextInputFormController {
    public TextField txtName;

    public void print(ActionEvent actionEvent) {
        System.out.println(txtName.getText());
    }
}
