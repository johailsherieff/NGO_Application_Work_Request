/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HealthCamp;

/**
 *
 * @author rajsharavan
 */
public class HealthCamp {

    private String street;
    private String city;
    private String state;
    private String zipcode;
    private String peopleAffected;
    private String percentChild;
    private String percentElder;
    private int id;
    private static int count = 1;

    public HealthCamp() {
        id = count;
        count++;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        HealthCamp.count = count;
    }

    @Override
    public String toString() {
        return street;
    }
}
