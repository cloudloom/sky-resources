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
    protected EntityIdResource entityId;

    @JsonIgnore
    protected boolean passive;

    public BaseResource() {
    }

    public EntityIdResource getEntityId() {
        return this.entityId;
    }

    public boolean isPassive() {
        return this.passive;
    }

    public void setEntityId(EntityIdResource entityId) {
        this.entityId = entityId;
    }

    public void setPassive(boolean passive) {
        this.passive = passive;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof BaseResource)) return false;
        final BaseResource other = (BaseResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$entityId = this.entityId;
        final Object other$entityId = other.entityId;
        if (this$entityId == null ? other$entityId != null : !this$entityId.equals(other$entityId)) return false;
        if (this.passive != other.passive) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $entityId = this.entityId;
        result = result * PRIME + ($entityId == null ? 0 : $entityId.hashCode());
        result = result * PRIME + (this.passive ? 79 : 97);
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof BaseResource;
    }

    public String toString() {
        return "com.leanthoughts.sky.api.gateway.resources.BaseResource(entityId=" + this.entityId + ", passive=" + this.passive + ")";
    }
}