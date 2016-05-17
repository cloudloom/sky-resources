package com.leanthoughts.sky.resources.planning;

import com.leanthoughts.sky.resources.BaseResource;
import com.leanthoughts.sky.resources.TenantResource;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sadath on 16-Dec-2015.
 */
public class MealPlanResource extends BaseResource {
    private TenantResource tenant;
    private String description;
    private PlanningCriteriaResource planningCriteria;
    private PlanningCriteriaAttributeResource planningCriteriaAttribute;
    private Set<MealPlanLineItemResource> mealPlanLineItems = new HashSet<MealPlanLineItemResource>(0);

    public MealPlanResource() {
    }

    public TenantResource getTenant() {
        return this.tenant;
    }

    public String getDescription() {
        return this.description;
    }

    public PlanningCriteriaResource getPlanningCriteria() {
        return this.planningCriteria;
    }

    public PlanningCriteriaAttributeResource getPlanningCriteriaAttribute() {
        return this.planningCriteriaAttribute;
    }

    public Set<MealPlanLineItemResource> getMealPlanLineItems() {
        return this.mealPlanLineItems;
    }

    public void setTenant(TenantResource tenant) {
        this.tenant = tenant;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPlanningCriteria(PlanningCriteriaResource planningCriteria) {
        this.planningCriteria = planningCriteria;
    }

    public void setPlanningCriteriaAttribute(PlanningCriteriaAttributeResource planningCriteriaAttribute) {
        this.planningCriteriaAttribute = planningCriteriaAttribute;
    }

    public void setMealPlanLineItems(Set<MealPlanLineItemResource> mealPlanLineItems) {
        this.mealPlanLineItems = mealPlanLineItems;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof MealPlanResource)) return false;
        final MealPlanResource other = (MealPlanResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$tenant = this.tenant;
        final Object other$tenant = other.tenant;
        if (this$tenant == null ? other$tenant != null : !this$tenant.equals(other$tenant)) return false;
        final Object this$description = this.description;
        final Object other$description = other.description;
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        final Object this$planningCriteria = this.planningCriteria;
        final Object other$planningCriteria = other.planningCriteria;
        if (this$planningCriteria == null ? other$planningCriteria != null : !this$planningCriteria.equals(other$planningCriteria))
            return false;
        final Object this$planningCriteriaAttribute = this.planningCriteriaAttribute;
        final Object other$planningCriteriaAttribute = other.planningCriteriaAttribute;
        if (this$planningCriteriaAttribute == null ? other$planningCriteriaAttribute != null : !this$planningCriteriaAttribute.equals(other$planningCriteriaAttribute))
            return false;
        final Object this$mealPlanLineItems = this.mealPlanLineItems;
        final Object other$mealPlanLineItems = other.mealPlanLineItems;
        if (this$mealPlanLineItems == null ? other$mealPlanLineItems != null : !this$mealPlanLineItems.equals(other$mealPlanLineItems))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $tenant = this.tenant;
        result = result * PRIME + ($tenant == null ? 0 : $tenant.hashCode());
        final Object $description = this.description;
        result = result * PRIME + ($description == null ? 0 : $description.hashCode());
        final Object $planningCriteria = this.planningCriteria;
        result = result * PRIME + ($planningCriteria == null ? 0 : $planningCriteria.hashCode());
        final Object $planningCriteriaAttribute = this.planningCriteriaAttribute;
        result = result * PRIME + ($planningCriteriaAttribute == null ? 0 : $planningCriteriaAttribute.hashCode());
        final Object $mealPlanLineItems = this.mealPlanLineItems;
        result = result * PRIME + ($mealPlanLineItems == null ? 0 : $mealPlanLineItems.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof MealPlanResource;
    }
}