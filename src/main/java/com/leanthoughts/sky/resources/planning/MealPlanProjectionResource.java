package com.leanthoughts.sky.resources.planning;

import com.leanthoughts.sky.resources.BaseResource;

import javax.persistence.ElementCollection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by sadath on 25-Jan-2016.
 */
public class MealPlanProjectionResource extends BaseResource {
    private String flightSector;
    private StationResource upliftStation;
    private StationResource unloadStation;
    private boolean applyGlp;
    private Set<MealPlanProjectionItemResource> items = new HashSet<MealPlanProjectionItemResource>();
    private Set<String> associatedSchedules = new HashSet<>(0);

    public MealPlanProjectionResource() {
    }

    public String getFlightSector() {
        return this.flightSector;
    }

    public StationResource getUpliftStation() {
        return this.upliftStation;
    }

    public StationResource getUnloadStation() {
        return this.unloadStation;
    }

    public Set<MealPlanProjectionItemResource> getItems() {
        return this.items;
    }

    public void setFlightSector(String flightSector) {
        this.flightSector = flightSector;
    }

    public void setUpliftStation(StationResource upliftStation) {
        this.upliftStation = upliftStation;
    }

    public void setUnloadStation(StationResource unloadStation) {
        this.unloadStation = unloadStation;
    }

    public void setItems(Set<MealPlanProjectionItemResource> items) {
        this.items = items;
    }

    public boolean isApplyGlp() {
        return applyGlp;
    }

    public void setApplyGlp(boolean applyGlp) {
        this.applyGlp = applyGlp;
    }

    public Set<String> getAssociatedSchedules() {
        return associatedSchedules;
    }

    public void setAssociatedSchedules(Set<String> associatedSchedules) {
        this.associatedSchedules = associatedSchedules;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof MealPlanProjectionResource)) return false;
        final MealPlanProjectionResource other = (MealPlanProjectionResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$flightSector = this.flightSector;
        final Object other$flightSector = other.flightSector;
        if (this$flightSector == null ? other$flightSector != null : !this$flightSector.equals(other$flightSector))
            return false;
        final Object this$upliftStation = this.upliftStation;
        final Object other$upliftStation = other.upliftStation;
        if (this$upliftStation == null ? other$upliftStation != null : !this$upliftStation.equals(other$upliftStation))
            return false;
        final Object this$unloadStation = this.unloadStation;
        final Object other$unloadStation = other.unloadStation;
        if (this$unloadStation == null ? other$unloadStation != null : !this$unloadStation.equals(other$unloadStation))
            return false;
        final Object this$items = this.items;
        final Object other$items = other.items;
        if (this$items == null ? other$items != null : !this$items.equals(other$items)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $flightSector = this.flightSector;
        result = result * PRIME + ($flightSector == null ? 0 : $flightSector.hashCode());
        final Object $upliftStation = this.upliftStation;
        result = result * PRIME + ($upliftStation == null ? 0 : $upliftStation.hashCode());
        final Object $unloadStation = this.unloadStation;
        result = result * PRIME + ($unloadStation == null ? 0 : $unloadStation.hashCode());
        final Object $items = this.items;
        result = result * PRIME + ($items == null ? 0 : $items.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof MealPlanProjectionResource;
    }
}