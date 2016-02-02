package com.leanthoughts.sky.resources;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by sadath on 16-Dec-2015.
 */
public class MealPlanResource extends BaseResource {
    private TenantResource tenant;
    private String description;
    private boolean addAllFlights;
    private Set<String> flights = new HashSet<String>(0);
    private Map<String, FlightResource> flightMetaData = new HashMap<String, FlightResource>(0);
    private Set<MealPlanPlanningCriteriaResource> mealPlanPlanningCriterias = new HashSet<MealPlanPlanningCriteriaResource>(0);
    private Set<MealPlanLineItemResource> mealPlanLineItems = new HashSet<MealPlanLineItemResource>(0);

    public MealPlanResource() {
    }

    public TenantResource getTenant() {
        return this.tenant;
    }

    public String getDescription() {
        return this.description;
    }

    public Set<String> getFlights() {
        return this.flights;
    }

    public Map<String, FlightResource> getFlightMetaData() {
        return this.flightMetaData;
    }

    public Set<MealPlanPlanningCriteriaResource> getMealPlanPlanningCriterias() {
        return this.mealPlanPlanningCriterias;
    }

    public boolean isAddAllFlights() {
        return addAllFlights;
    }

    public void setAddAllFlights(boolean addAllFlights) {
        this.addAllFlights = addAllFlights;
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

    public void setFlights(Set<String> flights) {
        this.flights = flights;
    }

    public void setFlightMetaData(Map<String, FlightResource> flightMetaData) {
        this.flightMetaData = flightMetaData;
    }

    public void setMealPlanPlanningCriterias(Set<MealPlanPlanningCriteriaResource> mealPlanPlanningCriterias) {
        this.mealPlanPlanningCriterias = mealPlanPlanningCriterias;
    }

    public void setMealPlanLineItems(Set<MealPlanLineItemResource> mealPlanLineItems) {
        this.mealPlanLineItems = mealPlanLineItems;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof MealPlanResource)) return false;
        final MealPlanResource other = (MealPlanResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$tenant = this.getTenant();
        final Object other$tenant = other.getTenant();
        if (this$tenant == null ? other$tenant != null : !this$tenant.equals(other$tenant)) return false;
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        final Object this$flights = this.getFlights();
        final Object other$flights = other.getFlights();
        if (this$flights == null ? other$flights != null : !this$flights.equals(other$flights)) return false;
        final Object this$mealPlanPlanningCriterias = this.getMealPlanPlanningCriterias();
        final Object other$mealPlanPlanningCriterias = other.getMealPlanPlanningCriterias();
        if (this$mealPlanPlanningCriterias == null ? other$mealPlanPlanningCriterias != null : !this$mealPlanPlanningCriterias.equals(other$mealPlanPlanningCriterias))
            return false;
        final Object this$mealPlanLineItems = this.getMealPlanLineItems();
        final Object other$mealPlanLineItems = other.getMealPlanLineItems();
        if (this$mealPlanLineItems == null ? other$mealPlanLineItems != null : !this$mealPlanLineItems.equals(other$mealPlanLineItems))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $tenant = this.getTenant();
        result = result * PRIME + ($tenant == null ? 0 : $tenant.hashCode());
        final Object $description = this.getDescription();
        result = result * PRIME + ($description == null ? 0 : $description.hashCode());
        final Object $flights = this.getFlights();
        result = result * PRIME + ($flights == null ? 0 : $flights.hashCode());
        final Object $mealPlanPlanningCriterias = this.getMealPlanPlanningCriterias();
        result = result * PRIME + ($mealPlanPlanningCriterias == null ? 0 : $mealPlanPlanningCriterias.hashCode());
        final Object $mealPlanLineItems = this.getMealPlanLineItems();
        result = result * PRIME + ($mealPlanLineItems == null ? 0 : $mealPlanLineItems.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof MealPlanResource;
    }
}