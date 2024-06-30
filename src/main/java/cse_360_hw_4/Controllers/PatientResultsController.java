package cse_360_hw_4.Controllers;

import cse_360_hw_4.Objects.CTScan;
import cse_360_hw_4.StartApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import static cse_360_hw_4.Lib.Constants.X_AXIS;
import static cse_360_hw_4.Lib.Constants.Y_AXIS;

public class PatientResultsController {
    @FXML
    private Label patientHello;
    @FXML
    private TextField totalAgatston;
    @FXML
    private TextField LM;
    @FXML
    private TextField LAD;
    @FXML
    private TextField LCX;
    @FXML
    private TextField RCA;
    @FXML
    private TextField PDA;

    public void initView(CTScan ctScan, String firstName, String lastName) {
        patientHello.setText("Hello " + firstName + " " + lastName);
        totalAgatston.setText(ctScan.getTotalAgatston());
        LM.setText(ctScan.getLM());
        LAD.setText(ctScan.getLAD());
        LCX.setText(ctScan.getLCX());
        RCA.setText(ctScan.getRCA());
        PDA.setText(ctScan.getPDA());
    }

    public void initStartScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(StartApplication.class.getResource("patient-input-user.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, Y_AXIS, X_AXIS);
        stage.setScene(scene);
        stage.show();
    }
}
