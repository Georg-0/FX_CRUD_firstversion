package sample.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import sample.DatabaseHandler;
import sample.Student;

public class CreateController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button createStudentButton;

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

        createStudentButton.setOnAction(event -> {
            signUpNewStudent();
        });
    }

    private void signUpNewStudent() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String firstName = signUpFirstnameField.getText();
        String lastName = signUpLastnameField.getText();
        String idStudent = signUpIdField.getText();
        String studentSpecialty = signUpSpecialtyField.getText();
        String gender = "";
        if (SignUpCheckBoxMale.isSelected())
            gender = "Male";
        else
            gender = "Female";

        Student student = new Student(firstName, lastName, idStudent, studentSpecialty, gender);

        dbHandler.signUpUser(student);
    }
}


