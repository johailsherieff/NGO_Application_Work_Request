/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.OrganizationType;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(OrganizationType type) {
        Organization organization = null;
        if (type.getValue().equals(OrganizationType.Doctor.getValue())) {
            organization = new DoctorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(OrganizationType.Lab.getValue())) {
            organization = new LabOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(OrganizationType.Nurse.getValue())) {
            organization = new NurseOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(OrganizationType.Fundrasier.getValue())) {
            organization = new FundraiserOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(OrganizationType.VolunteerCamp.getValue())) {
            organization = new VolunteerCampOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(OrganizationType.VolunteerEvent.getValue())) {
            organization = new VolunteerEventOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(OrganizationType.Receptionist.getValue())) {
            organization = new ReceptionistOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}
