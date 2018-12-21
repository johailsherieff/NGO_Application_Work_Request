/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author rajsharavan
 */
public abstract class WorkRequest {

//    Lab, Doctor and Nurse Process 
    private String typeOfRequest;
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private String nurseStatus;
    private String nurseMessage;
    private String labMessage;
    private Date requestDate;
    private Date resolveDate;

//    Volunteer Details
    private String volunteername;
    private String username;
    private String password;
    private String role;
    private String mailid;
    private long number;
    private long ssn;
    private String passport;
    private Date dob;
    private String address;

//    Health Camp Model 
    private String street;
    private String city;
    private String state;
    private String zipcode;
    private String peopleAffected;
    private String percentChild;
    private String percentElder;
    private int campId;
    private static int campCount = 100;
    private Date eventDate;
    private String hospital;

//    Patient Registration
    private String patientfirstname;
    private String patientlastname;
    private int patientid;
    private static int patientcount = 1000;
    private int page;
    private int pheight;
    private int pweight;
    private String pgender;
    private String pimage;
    private String pbloodgrp;
    private String pbloodpres;
    private float pgulcoselvl;
    private float pbodytemp;
    private String psymptoms;
    private String pdisease;
    private String pdiagnosis;
    private String ppriority;
    private String campName;
    private int approxPatientFee;
    private int HospitalFee = 0;

    public String getLabMessage() {
        return labMessage;
    }

    public void setLabMessage(String labMessage) {
        this.labMessage = labMessage;
    }

    public int getHospitalFee() {
        return HospitalFee;
    }

    public void setHospitalFee(int HospitalFee) {
        this.HospitalFee = this.HospitalFee + HospitalFee;
    }

    public String getNurseStatus() {
        return nurseStatus;
    }

    public void setNurseStatus(String nurseStatus) {
        this.nurseStatus = nurseStatus;
    }

    public String getNurseMessage() {
        return nurseMessage;
    }

    public void setNurseMessage(String nurseMessage) {
        this.nurseMessage = nurseMessage;
    }

    public void setPatientId() {
        patientid = patientcount++;
    }

    public String getCampName() {
        return campName;
    }

    public int getApproxPatientFee() {
        return approxPatientFee;
    }

    public void setApproxPatientFee(int approxPatientFee) {
        this.approxPatientFee = approxPatientFee;
    }

    public void setCampName(String campName) {
        this.campName = campName;
    }

    public int getPatientId() {
        return patientid;
    }

    public String getPatientFirstname() {
        return patientfirstname;
    }

    public void setPatientFirstname(String patientfirstname) {
        this.patientfirstname = patientfirstname;
    }

    public String getPatientLastname() {
        return patientlastname;
    }

    public void setPatientLastname(String lastname) {
        this.patientlastname = lastname;
    }

    public String getTypeOfRequest() {
        return typeOfRequest;
    }

    public void setTypeOfRequest(String typeOfRequest) {
        this.typeOfRequest = typeOfRequest;
    }

    public String getMailid() {
        return mailid;
    }

    public void setMailid(String mailid) {
        this.mailid = mailid;
    }

    public WorkRequest() {
        campId = campCount++;
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public String getVolunteerName() {
        return volunteername;
    }

    public void setName(String name) {
        this.volunteername = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setCampId() {
        this.campId = campCount++;
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

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public Date getDob() {
        return dob;
    }

    public String getVolunteername() {
        return volunteername;
    }

    public void setVolunteername(String volunteername) {
        this.volunteername = volunteername;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getPatientfullname() {
        return patientfirstname;
    }

    public void setPatientfullname(String patientfirstname) {
        this.patientfirstname = patientfirstname;
    }

    public int getPatientid() {
        return patientid;
    }

    public void setPatientid() {
        this.patientid = patientcount++;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPheight() {
        return pheight;
    }

    public void setPheight(int pheight) {
        this.pheight = pheight;
    }

    public int getPweight() {
        return pweight;
    }

    public void setPweight(int pweight) {
        this.pweight = pweight;
    }

    public String getPgender() {
        return pgender;
    }

    public void setPgender(String pgender) {
        this.pgender = pgender;
    }

    public String getPimage() {
        return pimage;
    }

    public void setPimage(String pimage) {
        this.pimage = pimage;
    }

    public String getPbloodgrp() {
        return pbloodgrp;
    }

    public void setPbloodgrp(String pbloodgrp) {
        this.pbloodgrp = pbloodgrp;
    }

    public String getPbloodpres() {
        return pbloodpres;
    }

    public void setPbloodpres(String pbloodpres) {
        this.pbloodpres = pbloodpres;
    }

    public float getPgulcoselvl() {
        return pgulcoselvl;
    }

    public void setPgulcoselvl(float pgulcoselvl) {
        this.pgulcoselvl = pgulcoselvl;
    }

    public float getPbodytemp() {
        return pbodytemp;
    }

    public void setPbodytemp(float pbodytemp) {
        this.pbodytemp = pbodytemp;
    }

    public String getPsymptoms() {
        return psymptoms;
    }

    public void setPsymptoms(String psymptoms) {
        this.psymptoms = psymptoms;
    }

    public String getPdisease() {
        return pdisease;
    }

    public void setPdisease(String pdisease) {
        this.pdisease = pdisease;
    }

    public String getPdiagnosis() {
        return pdiagnosis;
    }

    public void setPdiagnosis(String pdiagnosis) {
        this.pdiagnosis = pdiagnosis;
    }

    public String getPpriority() {
        return ppriority;
    }

    public void setPpriority(String ppriority) {
        this.ppriority = ppriority;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public static int getCampCount() {
        return campCount;
    }

    public static void setCampCount(int campCount) {
        WorkRequest.campCount = campCount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    @Override
    public String toString() {

        return this.typeOfRequest;
    }
}
