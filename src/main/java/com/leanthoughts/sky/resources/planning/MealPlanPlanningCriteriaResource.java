package com.leanthoughts.sky.resources.planning;

import com.leanthoughts.sky.resources.BaseResource;

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
        final Object this$planningCriteria = this.getPlanningCriteria();
        final Object other$planningCriteria = other.getPlanningCriteria();
        if (this$planningCriteria == null ? other$planningCriteria != null : !this$planningCriteria.equals(other$planningCriteria))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $planningCriteria = this.getPlanningCriteria();
        result = result * PRIME + ($planningCriteria == null ? 0 : $planningCriteria.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof MealPlanPlanningCriteriaResource;
    }
}