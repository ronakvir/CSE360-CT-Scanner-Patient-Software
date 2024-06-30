package cse_360_hw_4.Controllers;

import cse_360_hw_4.Lib.UserMockDB;
import cse_360_hw_4.StartApplication;
import cse_360_hw_4.Objects.Patient;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import static cse_360_hw_4.Lib.Constants.*;

import java.io.IOException;

public class PatientIntakeController {

    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
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
        Patient p1 = new Patient(firstName.getText(), lastName.getText());
        p1.setEmail(email.getText());
        p1.setTelephone(telephone.getText());
        p1.setHealthHistory(healthHistory.getText());
        p1.setInsuranceId(insuranceID.getText());
        UserMockDB.writePatient(p1);
        System.out.println(p1.getEmail());
        System.out.println(p1.getTelephone());
        System.out.println(p1.getHealthHistory());
        System.out.println(p1.getInsuranceId());
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Succesfully Created");
        a.showAndWait();
        this.initStartScene(event);
    }

}