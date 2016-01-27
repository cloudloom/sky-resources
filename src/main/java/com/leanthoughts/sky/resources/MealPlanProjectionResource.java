package com.leanthoughts.sky.resources;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sadath on 25-Jan-2016.
 */
public class MealPlanProjectionResource extends BaseResource {
    private String flight;
    private StationResource upliftStation;
    private StationResource unloadStation;
    private MealPlanResource mealPlan;
    private Set<MealPlanProjectionItemResource> items = new HashSet<MealPlanProjectionItemResource>();

    public MealPlanProjectionResource() {
    }

    public String getFlight() {
        return this.flight;
    }

    public StationResource getUpliftStation() {
        return this.upliftStation;
    }

    public StationResource getUnloadStation() {
        return this.unloadStation;
    }

    public MealPlanResource getMealPlan() {
        return this.mealPlan;
    }

    public Set<MealPlanProjectionItemResource> getItems() {
        return this.items;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public void setUpliftStation(StationResource upliftStation) {
        this.upliftStation = upliftStation;
    }

    public void setUnloadStation(StationResource unloadStation) {
        this.unloadStation = unloadStation;
    }

    public void setMealPlan(MealPlanResource mealPlan) {
        this.mealPlan = mealPlan;
    }

    public void setItems(Set<MealPlanProjectionItemResource> items) {
        this.items = items;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof MealPlanProjectionResource)) return false;
        final MealPlanProjectionResource other = (MealPlanProjectionResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$flight = this.flight;
        final Object other$flight = other.flight;
        if (this$flight == null ? other$flight != null : !this$flight.equals(other$flight)) return false;
        final Object this$upliftStation = this.upliftStation;
        final Object other$upliftStation = other.upliftStation;
        if (this$upliftStation == null ? other$upliftStation != null : !this$upliftStation.equals(other$upliftStation))
            return false;
        final Object this$unloadStation = this.unloadStation;
        final Object other$unloadStation = other.unloadStation;
        if (this$unloadStation == null ? other$unloadStation != null : !this$unloadStation.equals(other$unloadStation))
            return false;
        final Object this$mealPlan = this.mealPlan;
        final Object other$mealPlan = other.mealPlan;
        if (this$mealPlan == null ? other$mealPlan != null : !this$mealPlan.equals(other$mealPlan)) return false;
        final Object this$items = this.items;
        final Object other$items = other.items;
        if (this$items == null ? other$items != null : !this$items.equals(other$items)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $flight = this.flight;
        result = result * PRIME + ($flight == null ? 0 : $flight.hashCode());
        final Object $upliftStation = this.upliftStation;
        result = result * PRIME + ($upliftStation == null ? 0 : $upliftStation.hashCode());
        final Object $unloadStation = this.unloadStation;
        result = result * PRIME + ($unloadStation == null ? 0 : $unloadStation.hashCode());
        final Object $mealPlan = this.mealPlan;
        result = result * PRIME + ($mealPlan == null ? 0 : $mealPlan.hashCode());
        final Object $items = this.items;
        result = result * PRIME + ($items == null ? 0 : $items.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof MealPlanProjectionResource;
    }
}