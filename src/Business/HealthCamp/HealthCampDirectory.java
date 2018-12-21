/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HealthCamp;

import java.util.ArrayList;

/**
 *
 * @author rajsharavan
 */
public class HealthCampDirectory {

    private ArrayList<HealthCamp> healthCampList;

    public HealthCampDirectory() {
        healthCampList = new ArrayList<HealthCamp>();
    }

    public ArrayList<HealthCamp> gethealthCampList() {
        return healthCampList;
    }

    public HealthCamp addHealthCamp() {
        HealthCamp health = new HealthCamp();
        healthCampList.add(health);
        return health;
    }
}
