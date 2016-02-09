package com.leanthoughts.sky.resources.planning;

import com.leanthoughts.sky.resources.BaseResource;

/**
 * Created by fahad on 15-12-2015.
 */

public class PlanningCriteriaAttributeResource extends BaseResource {
    private String code;
    private String valueSource;

    public PlanningCriteriaAttributeResource() {
    }

    public String getCode() {
        return this.code;
    }

    public String getValueSource() {
        return this.valueSource;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setValueSource(String valueSource) {
        this.valueSource = valueSource;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof PlanningCriteriaAttributeResource)) return false;
        final PlanningCriteriaAttributeResource other = (PlanningCriteriaAttributeResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$code = this.code;
        final Object other$code = other.code;
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) return false;
        final Object this$valueSource = this.valueSource;
        final Object other$valueSource = other.valueSource;
        if (this$valueSource == null ? other$valueSource != null : !this$valueSource.equals(other$valueSource))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $code = this.code;
        result = result * PRIME + ($code == null ? 0 : $code.hashCode());
        final Object $valueSource = this.valueSource;
        result = result * PRIME + ($valueSource == null ? 0 : $valueSource.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof PlanningCriteriaAttributeResource;
    }

}