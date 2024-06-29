package cse_360_group_project.Controllers;

import cse_360_group_project.Lib.UserMockDB;
import cse_360_group_project.Objects.CTScan;
import cse_360_group_project.StartApplication;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import static cse_360_group_project.Lib.Constants.*;

import java.io.IOException;

public class CreateAccountController {

    @FXML
    private TextField patientID;
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



    public void initStartScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(StartApplication.class.getResource("start-view.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, Y_AXIS, X_AXIS);
        stage.setScene(scene);
        stage.show();
    }

    public void generateCTScan(ActionEvent event) throws IOException {
        CTScan ctScan = new CTScan(patientID.getText());
        ctScan.setTotalAgatston(totalAgatston.getText());
        ctScan.setLM(LM.getText());
        ctScan.setLAD(LAD.getText());
        ctScan.setLCX(LCX.getText());
        ctScan.setRCA(RCA.getText());
        ctScan.setPDA(PDA.getText());
        UserMockDB.writeCTScan(ctScan);
        System.out.println(ctScan.getPatientUserID());
        System.out.println(ctScan.getTotalAgatston());
        System.out.println(ctScan.getLM());
        System.out.println(ctScan.getLAD());
        System.out.println(ctScan.getLCX());
        System.out.println(ctScan.getRCA());
    }
}