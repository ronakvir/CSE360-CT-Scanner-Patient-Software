package cse_360_hw_4.Objects;

import cse_360_hw_4.Lib.UserMockDB;

import java.io.Serializable;

public class Patient implements Serializable {

    private String username;
    private String password;
    private String email;
    private String telephone;
    private String health_history;
    private String insurance_id;
    private final String userId;

    public Patient(String username, String password) {
        this.username = username;
        this.password = password;
        this.userId = UserMockDB.generateUserID(username);
    }

    // Getters and Setters for the fields
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getHealthHistory() {
        return health_history;
    }

    public void setHealthHistory(String health_history) {
        this.health_history = health_history;
    }

    public String getInsuranceId() {
        return insurance_id;
    }

    public void setInsuranceId(String insurance_id) {
        this.insurance_id = insurance_id;
    }


    public String getUserID() {
        return userId;
    }

    public String getDBFileName() {
        return getUserID() + "_PatientInfo.txt";
    }
}