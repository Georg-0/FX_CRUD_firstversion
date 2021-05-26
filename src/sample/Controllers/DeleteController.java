package sample.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class DeleteController {

    @FXML
    private Button deleteStudent;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView ImageButtonHome;

    @FXML
    void initialize() {
        assert ImageButtonHome != null : "fx:id=\"ImageButtonHome\" was not injected: check your FXML file 'delete.fxml'.";

        deleteStudent.setOnAction(event -> {

            deleteStudent.getScene().getWindow().hide();
            FXMLLoader loader2 = new FXMLLoader();
            loader2.setLocation(getClass().getResource("/sample/view/delete.fxml"));
            System.out.println("Cтудент удален!");

            try {
                loader2.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root2 = loader2.getRoot();
            Stage stage2 = new Stage();
            stage2.setScene(new Scene(root2));
            stage2.showAndWait();
        });

    }
}


