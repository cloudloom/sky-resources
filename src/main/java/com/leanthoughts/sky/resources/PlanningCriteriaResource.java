package com.leanthoughts.sky.resources;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by fahad on 15-12-2015.
 */

public class PlanningCriteriaResource extends BaseResource {
    private String description;
    private boolean active;
    private Set<PlanningCriteriaGroupResource> planningCriteriaGroup = new HashSet<PlanningCriteriaGroupResource>();
    private Set<PlanningCriteriaAttributeResource> planningCriteriaAttributes = new HashSet<PlanningCriteriaAttributeResource>();

    public PlanningCriteriaResource() {
    }

    public String getDescription() {
        return this.description;
    }

    public boolean isActive() {
        return this.active;
    }

    public Set<PlanningCriteriaGroupResource> getPlanningCriteriaGroup() {
        return this.planningCriteriaGroup;
    }

    public Set<PlanningCriteriaAttributeResource> getPlanningCriteriaAttributes() {
        return this.planningCriteriaAttributes;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setPlanningCriteriaGroup(Set<PlanningCriteriaGroupResource> planningCriteriaGroup) {
        this.planningCriteriaGroup = planningCriteriaGroup;
    }

    public void setPlanningCriteriaAttributes(Set<PlanningCriteriaAttributeResource> planningCriteriaAttributes) {
        this.planningCriteriaAttributes = planningCriteriaAttributes;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof PlanningCriteriaResource)) return false;
        final PlanningCriteriaResource other = (PlanningCriteriaResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$description = this.description;
        final Object other$description = other.description;
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        if (this.active != other.active) return false;
        final Object this$planningCriteriaGroup = this.planningCriteriaGroup;
        final Object other$planningCriteriaGroup = other.planningCriteriaGroup;
        if (this$planningCriteriaGroup == null ? other$planningCriteriaGroup != null : !this$planningCriteriaGroup.equals(other$planningCriteriaGroup))
            return false;
        final Object this$planningCriteriaAttributes = this.planningCriteriaAttributes;
        final Object other$planningCriteriaAttributes = other.planningCriteriaAttributes;
        if (this$planningCriteriaAttributes == null ? other$planningCriteriaAttributes != null : !this$planningCriteriaAttributes.equals(other$planningCriteriaAttributes))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $description = this.description;
        result = result * PRIME + ($description == null ? 0 : $description.hashCode());
        result = result * PRIME + (this.active ? 79 : 97);
        final Object $planningCriteriaGroup = this.planningCriteriaGroup;
        result = result * PRIME + ($planningCriteriaGroup == null ? 0 : $planningCriteriaGroup.hashCode());
        final Object $planningCriteriaAttributes = this.planningCriteriaAttributes;
        result = result * PRIME + ($planningCriteriaAttributes == null ? 0 : $planningCriteriaAttributes.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof PlanningCriteriaResource;
    }

    public String toString() {
        return "com.leanthoughts.sky.api.gateway.resources.PlanningCriteriaResource(description=" + this.description + ", active=" + this.active + ", planningCriteriaGroup=" + this.planningCriteriaGroup + ", planningCriteriaAttributes=" + this.planningCriteriaAttributes + ")";
    }
}