/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.HealthCamp.HealthCampDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;


    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

   

    
    public enum EnterpriseType {
        Hospital("Hospital"),
        Camp("Health Camp"),
        Event("Fund Raiser");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract ArrayList<Role> getSupportedRole();
    public abstract ArrayList<Organization> getSupportedType();
    
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
        
       
        
    }
    
    @Override
        public String toString() {
            return this.getName();
        }
    
}
