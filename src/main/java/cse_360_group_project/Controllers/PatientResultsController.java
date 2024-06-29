package cse_360_group_project.Controllers;

import cse_360_group_project.Objects.CTScan;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PatientResultsController {
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

    public void initView(CTScan ctScan) {
        totalAgatston.setText(ctScan.getTotalAgatston());
        LM.setText(ctScan.getLM());
        LAD.setText(ctScan.getLAD());
        LCX.setText(ctScan.getLCX());
        RCA.setText(ctScan.getRCA());
        PDA.setText(ctScan.getPDA());
    }
}
