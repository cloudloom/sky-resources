package com.leanthoughts.sky.resources.root;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.leanthoughts.sky.resources.FlightResource;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sadath on 07-Jan-2016.
 */
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightResourceRoot {
    private List<FlightResource> flights = new ArrayList<FlightResource>();

    public FlightResourceRoot() {
    }

    public List<FlightResource> getFlights() {
        return this.flights;
    }

    public void setFlights(List<FlightResource> flights) {
        this.flights = flights;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof FlightResourceRoot)) return false;
        final FlightResourceRoot other = (FlightResourceRoot) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$flights = this.flights;
        final Object other$flights = other.flights;
        if (this$flights == null ? other$flights != null : !this$flights.equals(other$flights)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $flights = this.flights;
        result = result * PRIME + ($flights == null ? 0 : $flights.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof FlightResourceRoot;
    }

    public String toString() {
        return "com.leanthoughts.sky.resources.root.FlightResourceRoot(flights=" + this.flights + ")";
    }
}
