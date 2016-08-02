package com.leanthoughts.sky.resources.partner;

import com.leanthoughts.sky.resources.dictionary.jpa.impl.BaseEntity;

import java.util.HashSet;
import java.util.Set;

/**
 * @author fahad
 * @since 02-08-2016.
 */
public class VendorResource extends BaseEntity{

    private Long vendorID;
    protected String name;
    private Set<PhoneResource> phone = new HashSet<PhoneResource>(0);
    private Set<EmailResource> email = new HashSet<EmailResource>(0);
    private boolean user;//Is Vendor a user
    private String userName;
    private String vendorAddress;
    private String vendorCity;
    private String vendorSalesPerson;

    VendorResource(){}

    public VendorResource(Long vendorID, String name, Set<PhoneResource> phone, Set<EmailResource> email, boolean user, String userName, String vendorAddress, String vendorCity, String vendorSalesPerson) {
        this.vendorID = vendorID;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.user = user;
        this.userName = userName;
        this.vendorAddress = vendorAddress;
        this.vendorCity = vendorCity;
        this.vendorSalesPerson = vendorSalesPerson;
    }

    public Long getVendorID() {
        return vendorID;
    }

    public void setVendorID(Long vendorID) {
        this.vendorID = vendorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<PhoneResource> getPhone() {
        return phone;
    }

    public void setPhone(Set<PhoneResource> phone) {
        this.phone = phone;
    }

    public Set<EmailResource> getEmail() {
        return email;
    }

    public void setEmail(Set<EmailResource> email) {
        this.email = email;
    }

    public boolean isUser() {
        return user;
    }

    public void setUser(boolean user) {
        this.user = user;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorCity() {
        return vendorCity;
    }

    public void setVendorCity(String vendorCity) {
        this.vendorCity = vendorCity;
    }

    public String getVendorSalesPerson() {
        return vendorSalesPerson;
    }

    public void setVendorSalesPerson(String vendorSalesPerson) {
        this.vendorSalesPerson = vendorSalesPerson;
    }
}
