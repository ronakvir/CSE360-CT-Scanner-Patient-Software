package cse_360_hw_4.Lib;

import cse_360_hw_4.Objects.CTScan;
import cse_360_hw_4.Objects.Patient;

import java.io.*;

import static cse_360_hw_4.Lib.Constants.*;

public class UserMockDB {


    public static boolean writePatient(Patient patient) {
        try {
            File file = new File(DB_PATH  + patient.getDBFileName());
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(patient);
            oos.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // eventually we should abstract these write functions into one

    public static boolean writeCTScan(CTScan ctScan) {
        try {
            File file = new File(DB_PATH  + ctScan.getDBFileName());
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(ctScan);
            oos.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static Patient readByUsername(String username) {
        try {
            File file = new File(getPatientDBPathFromUserName(username));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

            Patient patient = (Patient) ois.readObject();
            ois.close();
            return patient;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Patient readPatientByUserID(String userID) {
        try {
            File file = new File(getPatientDBPathFromUserID(userID));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

            Patient patient = (Patient) ois.readObject();
            ois.close();
            return patient;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static CTScan readCTScanByUserID(String userID) {
        try {
            File file = new File(getCTScanDBPathFromUserID(userID));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

            CTScan ctScan = (CTScan) ois.readObject();
            ois.close();
            return ctScan;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }




    public static String generateUserID(String username) {
        String lowercaseUsername = username.toLowerCase();
        int sum = 0;
        int maxLength = Math.min(lowercaseUsername.length(), 5);
        for (int i = 0; i < maxLength; i++) {
            sum += (int) lowercaseUsername.charAt(i);
        }
        return String.format("%05d", sum);
    }

    private static String getPatientDBPathFromUserName(String username) {
        return DB_PATH + generateUserID(username) + "_PatientInfo.txt";
    }

    private static String getPatientDBPathFromUserID(String userID) {
        return DB_PATH + userID + "_PatientInfo.txt";
    }

    private static String getCTScanDBPathFromUserID(String userID) {
        return DB_PATH + userID + "CTResults.txt";
    }


}
