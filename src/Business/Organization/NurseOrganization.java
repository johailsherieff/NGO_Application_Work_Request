/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

/**
 *
 * @author rajsharavan
 */
import Business.Role.NurseRole;
import Business.Role.Role;
import java.util.ArrayList;

public class NurseOrganization extends Organization {

    public NurseOrganization() {
        super(Organization.OrganizationType.Nurse.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NurseRole());
        return roles;
    }

}
