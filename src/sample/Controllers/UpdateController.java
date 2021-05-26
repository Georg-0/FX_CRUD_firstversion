package sample.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import sample.DatabaseHandler;
import sample.Student;

public class UpdateController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button updateStudentButton;

    @FXML
    private TextField signUpFirstnameField;

    @FXML
    private TextField signUpSpecialtyField;

    @FXML
    private TextField signUpIdField;

    @FXML
    private TextField signUpLastnameField;

    @FXML
    private CheckBox SignUpCheckBoxMale;

    @FXML
    private CheckBox SignUpCheckBoxFemale;

    @FXML
    void initialize() {
        updateStudentButton.setOnAction(event -> {
            updateStudent();
        });
    }

    private void updateStudent() {


    }
}


