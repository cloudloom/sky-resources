package com.leanthoughts.sky.resources.order;

import com.leanthoughts.sky.resources.BaseResource;

import java.util.Set;

public class PrebookingResource extends BaseResource {
    private FlightSectorResource flightSector;
    private Set<PrebookingCountResource> prebookings;
    private int totalCount;
    private int totalPax;

    public PrebookingResource() {
    }

    public FlightSectorResource getFlightSector() {
        return this.flightSector;
    }

    public Set<PrebookingCountResource> getPrebookings() {
        return this.prebookings;
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

    public void setPrebookings(Set<PrebookingCountResource> prebookings) {
        this.prebookings = prebookings;
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
        final Object this$prebookings = this.prebookings;
        final Object other$prebookings = other.prebookings;
        if (this$prebookings == null ? other$prebookings != null : !this$prebookings.equals(other$prebookings))
            return false;
        if (this.totalCount != other.totalCount) return false;
        if (this.totalPax != other.totalPax) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $flightSector = this.flightSector;
        result = result * PRIME + ($flightSector == null ? 0 : $flightSector.hashCode());
        final Object $prebookings = this.prebookings;
        result = result * PRIME + ($prebookings == null ? 0 : $prebookings.hashCode());
        result = result * PRIME + this.totalCount;
        result = result * PRIME + this.totalPax;
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof PrebookingResource;
    }

}