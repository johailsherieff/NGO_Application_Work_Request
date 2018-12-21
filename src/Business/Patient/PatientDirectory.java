/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;

/**
 *
 * @author rajsharavan
 */
public class PatientDirectory {

    private ArrayList<Patient> patientList;

    public PatientDirectory() {
        patientList = new ArrayList();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public Patient createPatient(String fullname, String lastname, int age, int height, int weight, String gender, String image) {
        Patient patient = new Patient();
        patient.setFullname(fullname);
        patient.setLastname(lastname);
        patient.setAge(age);
        patient.setHeight(height);
        patient.setWeight(weight);
        patient.setGender(gender);
        patient.setImage(image);
        patientList.add(patient);
        return patient;
    }

}
