package com.leanthoughts.sky.resources;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sadath on 28-Dec-2015.
 */
public class MealPlanPlanningCriteriaResource extends BaseResource {
    private PlanningCriteriaResource planningCriteria;
    private Set<PlanningCriteriaAttributeResource> planningCriteriaAttributes = new HashSet<PlanningCriteriaAttributeResource>(0);

    public MealPlanPlanningCriteriaResource() {
    }

    public PlanningCriteriaResource getPlanningCriteria() {
        return this.planningCriteria;
    }

    public Set<PlanningCriteriaAttributeResource> getPlanningCriteriaAttributes() {
        return this.planningCriteriaAttributes;
    }

    public void setPlanningCriteria(PlanningCriteriaResource planningCriteria) {
        this.planningCriteria = planningCriteria;
    }

    public void setPlanningCriteriaAttributes(Set<PlanningCriteriaAttributeResource> planningCriteriaAttributes) {
        this.planningCriteriaAttributes = planningCriteriaAttributes;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof MealPlanPlanningCriteriaResource)) return false;
        final MealPlanPlanningCriteriaResource other = (MealPlanPlanningCriteriaResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$planningCriteria = this.planningCriteria;
        final Object other$planningCriteria = other.planningCriteria;
        if (this$planningCriteria == null ? other$planningCriteria != null : !this$planningCriteria.equals(other$planningCriteria))
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
        final Object $planningCriteria = this.planningCriteria;
        result = result * PRIME + ($planningCriteria == null ? 0 : $planningCriteria.hashCode());
        final Object $planningCriteriaAttributes = this.planningCriteriaAttributes;
        result = result * PRIME + ($planningCriteriaAttributes == null ? 0 : $planningCriteriaAttributes.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof MealPlanPlanningCriteriaResource;
    }

    public String toString() {
        return "com.leanthoughts.sky.api.gateway.resources.MealPlanPlanningCriteriaResource(planningCriteria=" + this.planningCriteria + ", planningCriteriaAttributes=" + this.planningCriteriaAttributes + ")";
    }
}