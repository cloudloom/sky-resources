package com.leanthoughts.sky.resources;

/**
 * Created by fahad on 15-12-2015.
 */

/**
 * Planning Criteria Group :
 *      Non-perishable Food
 *      Perishable Food
 *      Crew Food
 *      Dry Store ( Other Consumables )
 */

public class PlanningCriteriaGroupResource extends BaseResource {
    private String name;

    public PlanningCriteriaGroupResource() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof PlanningCriteriaGroupResource)) return false;
        final PlanningCriteriaGroupResource other = (PlanningCriteriaGroupResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.name;
        final Object other$name = other.name;
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.name;
        result = result * PRIME + ($name == null ? 0 : $name.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof PlanningCriteriaGroupResource;
    }

    public String toString() {
        return "com.leanthoughts.sky.api.gateway.resources.PlanningCriteriaGroupResource(name=" + this.name + ")";
    }
}