package cse_360_hw_4.Controllers;

import cse_360_hw_4.Lib.UserMockDB;
import cse_360_hw_4.Objects.CTScan;
import cse_360_hw_4.StartApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import static cse_360_hw_4.Lib.Constants.X_AXIS;
import static cse_360_hw_4.Lib.Constants.Y_AXIS;

public class PatientInputIDController {

    @FXML
    private TextField patientID;


    public void loadCTResults(ActionEvent event) throws IOException {
        CTScan ctScan = UserMockDB.readCTScanByUserID(patientID.getText());
        System.out.println(ctScan.getTotalAgatston());
        System.out.println(ctScan.getPatientUserID());

        FXMLLoader loader = new FXMLLoader(StartApplication.class.getResource("patient-results-view.fxml"));
        Parent root = loader.load();

        // Get the controller instance from the FXMLLoader
        PatientResultsController patientResultsController = loader.getController();
        patientResultsController.initView(ctScan);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, Y_AXIS, X_AXIS);
        stage.setScene(scene);
        stage.show();

    }

}
