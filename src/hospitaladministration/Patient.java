/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitaladministration;

/**
 *
 * @author volkan
 */
public class Patient {
    
    private String name;
    private String birthDate;
    private String bloodType;
    private int patientID;
    
    private static int currentID = 1;

    public Patient(String name, String birthDate, String bloodType) {
        this.name = name;
        this.birthDate = birthDate;
        this.bloodType = bloodType;
        this.patientID = currentID;
        currentID++;
        
    }

    public static int getCurrentID() {
        return currentID;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getBloodType() {
        return bloodType;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
}
