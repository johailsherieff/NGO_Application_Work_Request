/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author MyPC1
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<Enterprise>();
    }

    //Create enterprise
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Hospital) {
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.Camp) {
            enterprise = new CampEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.Event) {
            enterprise = new EventEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }

    public Enterprise createAndAddCampEnterprise(String name, String street, String city, String state, String zipcode, String peopleAffected, String percentChild, String percentElder, int campId, Date eventDate, Enterprise.EnterpriseType type, String campHospital) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Hospital) {
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.Camp) {
            enterprise = new CampEnterprise(name, street, city, state, zipcode, peopleAffected, percentChild, percentElder, campId, eventDate, campHospital);
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
    public Enterprise createAndAddEventEnterprise(String name, String street, String city, String state, String zipcode, Date eventDate, Enterprise.EnterpriseType type, int budgetCount) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Event) {
            enterprise = new EventEnterprise(name,street,city,state,zipcode,eventDate,type, budgetCount);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }


}
