import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;

/**
 * @author Tobias Mitterwallner
 * @version 1.0
 * @date 11.03.2021
 * @class Main.java
 */

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //creates a file if it doesn't already exist
        File file = new File("src\\files\\Phonebook.csv");
        file.createNewFile();

        Parent root = FXMLLoader.load(getClass().getResource("viewcontroller/view.fxml"));
        primaryStage.setTitle("Phonebook");
        primaryStage.setResizable(false);
	    primaryStage.getIcons().add(new Image("/res/icon.png"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
