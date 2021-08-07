import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.net.URL;

public class WindowARunner extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        URL resource = getClass().getResource("view/WindowA.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene=new Scene(load);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Window A");
        primaryStage.show();
    }
}
