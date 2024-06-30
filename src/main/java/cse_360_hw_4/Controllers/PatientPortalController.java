package cse_360_hw_4.Controllers;

import cse_360_hw_4.StartApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import cse_360_hw_4.Objects.Patient;


import java.io.IOException;

import static cse_360_hw_4.Lib.Constants.X_AXIS;
import static cse_360_hw_4.Lib.Constants.Y_AXIS;

public class PatientPortalController {
    private Patient patient;

    public PatientPortalController() {
    }

    public void setPatient(Patient patient, ActionEvent event) throws IOException {
        this.patient = patient;

        Parent root = FXMLLoader.load(StartApplication.class.getResource("patient-input-user.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, Y_AXIS, X_AXIS);
        stage.setScene(scene);
        stage.show();

    }

    public void initStartScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(StartApplication.class.getResource("start-view.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, Y_AXIS, X_AXIS);
        stage.setScene(scene);
        stage.show();
    }
}
