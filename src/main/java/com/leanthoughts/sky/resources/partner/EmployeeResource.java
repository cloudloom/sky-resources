package com.leanthoughts.sky.resources.partner;

import com.leanthoughts.sky.resources.dictionary.Gender;
import com.leanthoughts.sky.resources.dictionary.Salutation;
import com.leanthoughts.sky.resources.dictionary.jpa.impl.BaseEntity;

import java.time.LocalDate;
import java.util.List;

/**
 * @author fahad
 * @since 02-08-2016.
 */
public class EmployeeResource extends BaseEntity {
    private Salutation salutation;
    private String firstName;
    private String middleName;
    private String lastName;
    private EmailResource email;
    private List<PhoneResource> phones;
    private LocalDate dateOfBirth;
    private Gender gender;
    private boolean isVerified;
    private String employeeId;
    private String orgUnit;
    private String department;
    private boolean isUser;
    private String username;
    private String status;

    EmployeeResource(){}

    public EmployeeResource(Salutation salutation, String firstName, String middleName, String lastName, EmailResource email, List<PhoneResource> phones, LocalDate dateOfBirth, Gender gender, boolean isVerified, String employeeId, String orgUnit, String department, boolean isUser, String username) {
        this.salutation = salutation;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.phones = phones;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.isVerified = isVerified;
        this.employeeId = employeeId;
        this.orgUnit = orgUnit;
        this.department = department;
        this.isUser = isUser;
        this.username = username;
    }

    public EmployeeResource(String uid, Salutation salutation, String firstName, String middleName, String lastName, EmailResource email, List<PhoneResource> phones, LocalDate dateOfBirth, Gender gender, boolean isVerified, String employeeId, String orgUnit, String department, boolean isUser, String username) {
        super(uid);
        this.salutation = salutation;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.phones = phones;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.isVerified = isVerified;
        this.employeeId = employeeId;
        this.orgUnit = orgUnit;
        this.department = department;
        this.isUser = isUser;
        this.username = username;
    }

    public Salutation getSalutation() {
        return salutation;
    }

    public void setSalutation(Salutation salutation) {
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public EmailResource getEmail() {
        return email;
    }

    public void setEmail(EmailResource email) {
        this.email = email;
    }

    public List<PhoneResource> getPhones() {
        return phones;
    }

    public void setPhones(List<PhoneResource> phones) {
        this.phones = phones;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getOrgUnit() {
        return orgUnit;
    }

    public void setOrgUnit(String orgUnit) {
        this.orgUnit = orgUnit;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isUser() {
        return isUser;
    }

    public void setUser(boolean user) {
        isUser = user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
