package cse_360_group_project.Controllers;

import cse_360_group_project.Lib.UserMockDB;
import cse_360_group_project.Objects.CTScan;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PatientInputIDController {

    @FXML
    private TextField patientID;

    public void loadCTResults(ActionEvent event) {
        CTScan ctScan = UserMockDB.readCTScanByUserID(patientID.getText());
        System.out.println(ctScan.getTotalAgatston());
        System.out.println(ctScan.getPatientUserID());

    }

}
