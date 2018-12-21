/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.FundraiserOrganization;
import Business.Organization.Organization;
import Business.Organization.VolunteerCampOrganization;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rajsharavan
 */
public class EventEnterprise extends Enterprise {
    private String street;
    private String city;
    private String state;
    private String zipcode;
    private Date eventDate;
    private int eventId;
    private int budgetCount;
    private static int count=0;
    private int fundsCollected=0;
    
    public EventEnterprise(String name){
        super(name, Enterprise.EnterpriseType.Event);
    }
    
    public EventEnterprise(String name, String street, String city, String state, String zipcode, Date eventDate, Enterprise.EnterpriseType type, int budgetCount) {
        super(name, Enterprise.EnterpriseType.Event);
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.eventDate = eventDate;
        this.budgetCount = budgetCount;
        this.eventId = count++;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public ArrayList<Organization> getSupportedType() {
        ArrayList<Organization> organ = new ArrayList();
        organ.add(new VolunteerCampOrganization());
        organ.add(new FundraiserOrganization());
        return organ;
    }
    public int getEventId(){
        return eventId;
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

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public int getBudgetCount() {
        return budgetCount;
    }

    public void setBudgetCount(int budgetCount) {
        this.budgetCount = budgetCount;
    }

    public int getFundsCollected() {
        return fundsCollected;
    }

    public void setFundsCollected(int fundsCollected) {
        this.fundsCollected = this.fundsCollected + fundsCollected;
    }
    
}
