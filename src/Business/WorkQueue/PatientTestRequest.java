/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;

/**
 *
 * @author rajsharavan
 */
public class PatientTestRequest extends WorkRequest {

    private String patientResult;

    public String getPatientResult() {
        return patientResult;
    }

    public void setTestResult(String testResult) {
        this.patientResult = testResult;
    }

    public void setCampName(Enterprise enterprise) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
