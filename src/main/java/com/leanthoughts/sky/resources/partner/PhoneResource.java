package com.leanthoughts.sky.resources.partner;

import com.leanthoughts.sky.resources.dictionary.jpa.impl.BaseEntity;

/**
 * @author fahad
 * @since 02-08-2016.
 */
public class PhoneResource extends BaseEntity{

    private String number;
    private String extension;
    private String phoneType;
    private boolean defaultPhone;

    public PhoneResource(String number,String phoneType,boolean defaultPhone){
        this.number=number;
        this.phoneType=phoneType;
        this.defaultPhone=defaultPhone;
    }

    PhoneResource(){this(null,null,false);}

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public boolean isDefaultPhone() {
        return defaultPhone;
    }

    public void setDefaultPhone(boolean defaultPhone) {
        this.defaultPhone = defaultPhone;
    }
}
