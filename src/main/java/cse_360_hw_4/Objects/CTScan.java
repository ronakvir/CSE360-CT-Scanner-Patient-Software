package cse_360_hw_4.Objects;

import java.io.Serializable;

public class CTScan implements Serializable {

    private final String associatedPatientUserId;
    private String totalAgatston;
    private String LM;
    private String LAD;
    private String LCX;
    private String RCA;
    private String PDA;

    public CTScan(String patientUserID) {
        this.associatedPatientUserId = patientUserID;
    }

    // Getters and Setters for the fields
    public String getPatientUserID() {
        return associatedPatientUserId;
    }

    public String getTotalAgatston() {
        return totalAgatston;
    }

    public void setTotalAgatston(String totalAgatston) {
        this.totalAgatston = totalAgatston;
    }

    public String getLM() {
        return LM;
    }

    public void setLM(String LM) {
        this.LM = LM;
    }

    public String getLAD() {
        return LAD;
    }

    public void setLAD(String LAD) {
        this.LAD = LAD;
    }

    public String getLCX() {
        return LCX;
    }

    public void setLCX(String LCX) {
        this.LCX = LCX;
    }

    public String getRCA() {
        return RCA;
    }

    public void setRCA(String RCA) {
        this.RCA = RCA;
    }

    public String getPDA() {
        return PDA;
    }

    public void setPDA(String PDA) {
        this.PDA = PDA;
    }


    public String getDBFileName() {
        return this.associatedPatientUserId + "CTResults.txt";
    }
}