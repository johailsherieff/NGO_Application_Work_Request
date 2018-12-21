/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.VolunteerEventRole;
import java.util.ArrayList;

/**
 *
 * @author rajsharavan
 */
public class VolunteerEventOrganization extends Organization {

    public VolunteerEventOrganization() {
        super(Organization.OrganizationType.VolunteerEvent.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VolunteerEventRole());
        return roles;
    }

}
