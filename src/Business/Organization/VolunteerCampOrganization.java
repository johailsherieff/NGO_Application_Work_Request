/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.VolunteerCampRole;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class VolunteerCampOrganization extends Organization {

    public VolunteerCampOrganization() {
        super(Organization.OrganizationType.VolunteerCamp.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VolunteerCampRole());
        return roles;
    }

}
