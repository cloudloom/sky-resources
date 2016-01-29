package com.leanthoughts.sky.resources;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sadath on 25-Jan-2016.
 */
public class MealPlanProjectionItemResource extends BaseResource {
    private MealPlanLineItemResource mealPlanLineItem;
    private Set<MealPlanProductProjectionResource> projections = new HashSet<MealPlanProductProjectionResource>(0);

    public MealPlanProjectionItemResource() {
    }

    public MealPlanLineItemResource getMealPlanLineItem() {
        return this.mealPlanLineItem;
    }

    public Set<MealPlanProductProjectionResource> getProjections() {
        return this.projections;
    }

    public void setMealPlanLineItem(MealPlanLineItemResource mealPlanLineItem) {
        this.mealPlanLineItem = mealPlanLineItem;
    }

    public void setProjections(Set<MealPlanProductProjectionResource> projections) {
        this.projections = projections;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof MealPlanProjectionItemResource)) return false;
        final MealPlanProjectionItemResource other = (MealPlanProjectionItemResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$mealPlanLineItem = this.mealPlanLineItem;
        final Object other$mealPlanLineItem = other.mealPlanLineItem;
        if (this$mealPlanLineItem == null ? other$mealPlanLineItem != null : !this$mealPlanLineItem.equals(other$mealPlanLineItem))
            return false;
        final Object this$projections = this.projections;
        final Object other$projections = other.projections;
        if (this$projections == null ? other$projections != null : !this$projections.equals(other$projections))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $mealPlanLineItem = this.mealPlanLineItem;
        result = result * PRIME + ($mealPlanLineItem == null ? 0 : $mealPlanLineItem.hashCode());
        final Object $projections = this.projections;
        result = result * PRIME + ($projections == null ? 0 : $projections.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof MealPlanProjectionItemResource;
    }
}