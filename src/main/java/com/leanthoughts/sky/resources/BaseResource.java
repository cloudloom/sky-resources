package com.leanthoughts.sky.resources;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * User: ffl
 * Date: 8/11/13
 * Time: 2:50 PM
 */
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class BaseResource implements Serializable {
    private String uid;

    @JsonIgnore
    protected boolean passive;

    public BaseResource() {
    }

    public String getUid() {
        return this.uid;
    }

    public boolean isPassive() {
        return this.passive;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setPassive(boolean passive) {
        this.passive = passive;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof BaseResource)) return false;
        final BaseResource other = (BaseResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$uid = this.uid;
        final Object other$uid = other.uid;
        if (this$uid == null ? other$uid != null : !this$uid.equals(other$uid)) return false;
        if (this.passive != other.passive) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $uid = this.uid;
        result = result * PRIME + ($uid == null ? 0 : $uid.hashCode());
        result = result * PRIME + (this.passive ? 79 : 97);
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof BaseResource;
    }

    public String toString() {
        return "com.leanthoughts.sky.resources.BaseResource(uid=" + this.uid + ", passive=" + this.passive + ")";
    }
}