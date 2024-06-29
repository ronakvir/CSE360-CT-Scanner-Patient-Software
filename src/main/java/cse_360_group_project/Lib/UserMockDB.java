package cse_360_group_project.Lib;

import cse_360_group_project.Users.Patient;

import java.io.*;

import static cse_360_group_project.Lib.Constants.*;

public class UserMockDB {


    public static boolean write(Patient patient) {
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

    public static Patient read(String username) {
        try {
            File file = new File(getDBPath(username));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

            Patient patient = (Patient) ois.readObject();
            ois.close();
            return patient;
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

    private static String getDBPath(String username) {
        return DB_PATH + generateUserID(username) + "_PatientInfo.txt";
    }
}
