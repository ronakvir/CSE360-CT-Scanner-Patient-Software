package cse_360_group_project.Controllers;

import cse_360_group_project.Lib.UserMockDB;
import cse_360_group_project.StartApplication;
import cse_360_group_project.Objects.Patient;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import static cse_360_group_project.Lib.Constants.*;

import java.io.IOException;

public class PatientIntakeController {

    @FXML
    private Label welcomeText;
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private TextField email;
    @FXML
    private TextField telephone;
    @FXML
    private TextField healthHistory;
    @FXML
    private TextField insuranceID;




    public void initStartScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(StartApplication.class.getResource("start-view.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, Y_AXIS, X_AXIS);
        stage.setScene(scene);
        stage.show();
    }


    public void createPatient(ActionEvent event) throws IOException {
        Patient p1 = new Patient(username.getText(), password.getText());
        p1.setEmail(email.getText());
        p1.setTelephone(telephone.getText());
        p1.setHealthHistory(healthHistory.getText());
        p1.setInsuranceId(insuranceID.getText());
        UserMockDB.writePatient(p1);
        System.out.println(p1.getUsername());
        System.out.println(p1.getPassword());
        System.out.println(p1.getEmail());
        System.out.println(p1.getTelephone());
        System.out.println(p1.getHealthHistory());
        System.out.println(p1.getInsuranceId());
        PatientPortalController portal = new PatientPortalController();
        portal.setPatient(p1, event);
    }

}