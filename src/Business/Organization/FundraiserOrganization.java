/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CorporateRole;
import Business.Role.GeneralRole;
import Business.Role.Role;
import Business.Role.StudentRole;
import java.util.ArrayList;

/**
 *
 * @author rajsharavan
 */
public class FundraiserOrganization extends Organization {

    public FundraiserOrganization() {
        super(Organization.OrganizationType.Fundrasier.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CorporateRole());
        roles.add(new GeneralRole());
        roles.add(new StudentRole());
        return roles;
    }

}
