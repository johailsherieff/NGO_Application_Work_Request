/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.VolunteerCampOrganization;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rajsharavan
 */
public class CampEnterprise extends Enterprise {

    private String street;
    private String city;
    private String state;
    private String zipcode;
    private String peopleAffected;
    private String percentChild;
    private String percentElder;
    private int campId;
    private Date eventDate;
    private String campHospital;
    
    

    public CampEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Camp);
    }

    public CampEnterprise(String name, String street, String city, String state, String zipcode, String peopleAffected, String percentChild, String percentElder, int campId, Date eventDate,String campHospital) {
        super(name, Enterprise.EnterpriseType.Camp);
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.peopleAffected = peopleAffected;
        this.percentChild = percentChild;
        this.percentElder = percentElder;
        this.campId = campId;
        this.eventDate = eventDate;
        this.campHospital = campHospital;
     
    }

    public String getCampHospital() {
        return campHospital;
    }

    public void setCampHospital(String campHospital) {
        this.campHospital = campHospital;
    }
    
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPeopleAffected() {
        return peopleAffected;
    }

    public void setPeopleAffected(String peopleAffected) {
        this.peopleAffected = peopleAffected;
    }

    public String getPercentChild() {
        return percentChild;
    }

    public void setPercentChild(String percentChild) {
        this.percentChild = percentChild;
    }

    public String getPercentElder() {
        return percentElder;
    }

    public void setPercentElder(String percentElder) {
        this.percentElder = percentElder;
    }

    public int getCampId() {
        return campId;
    }

    public void setCampId(int campId) {
        this.campId = campId;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    @Override
    public String toString() {
            return this.getName();
        }
    
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public ArrayList<Organization> getSupportedType() {
        ArrayList<Organization> organ = new ArrayList();
        organ.add(new VolunteerCampOrganization());
        return organ;
    }
    
}
