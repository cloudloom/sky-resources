package com.leanthoughts.sky.resources.order;

import com.leanthoughts.sky.resources.BaseResource;

import java.util.Set;

public class PrebookingResource extends BaseResource {
    private FlightSectorResource flightSector;
    private Set<PrebookingCategoryResource> category;
    private int totalCount;
    private int totalPax;

    public PrebookingResource() {
    }

    public FlightSectorResource getFlightSector() {
        return this.flightSector;
    }

    public Set<PrebookingCategoryResource> getCategory() {
        return this.category;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public int getTotalPax() {
        return this.totalPax;
    }

    public void setFlightSector(FlightSectorResource flightSector) {
        this.flightSector = flightSector;
    }

    public void setCategory(Set<PrebookingCategoryResource> category) {
        this.category = category;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public void setTotalPax(int totalPax) {
        this.totalPax = totalPax;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof PrebookingResource)) return false;
        final PrebookingResource other = (PrebookingResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$flightSector = this.flightSector;
        final Object other$flightSector = other.flightSector;
        if (this$flightSector == null ? other$flightSector != null : !this$flightSector.equals(other$flightSector))
            return false;
        final Object this$category = this.category;
        final Object other$category = other.category;
        if (this$category == null ? other$category != null : !this$category.equals(other$category)) return false;
        if (this.totalCount != other.totalCount) return false;
        if (this.totalPax != other.totalPax) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $flightSector = this.flightSector;
        result = result * PRIME + ($flightSector == null ? 0 : $flightSector.hashCode());
        final Object $category = this.category;
        result = result * PRIME + ($category == null ? 0 : $category.hashCode());
        result = result * PRIME + this.totalCount;
        result = result * PRIME + this.totalPax;
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof PrebookingResource;
    }
}
