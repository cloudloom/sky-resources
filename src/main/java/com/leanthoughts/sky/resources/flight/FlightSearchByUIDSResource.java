package com.leanthoughts.sky.resources.flight;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sadath on 01-Apr-2016.
 */
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightSearchByUIDSResource {
    private List<String> flightUIDS;
    private int size;
    private int page;
    private Map<String, String> sort = new HashMap<String, String>();

    public FlightSearchByUIDSResource() {
    }

    public List<String> getFlightUIDS() {
        return this.flightUIDS;
    }

    public int getSize() {
        return this.size;
    }

    public int getPage() {
        return this.page;
    }

    public Map<String, String> getSort() {
        return this.sort;
    }

    public void setFlightUIDS(List<String> flightUIDS) {
        this.flightUIDS = flightUIDS;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setSort(Map<String, String> sort) {
        this.sort = sort;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof FlightSearchByUIDSResource)) return false;
        final FlightSearchByUIDSResource other = (FlightSearchByUIDSResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$flightUIDS = this.flightUIDS;
        final Object other$flightUIDS = other.flightUIDS;
        if (this$flightUIDS == null ? other$flightUIDS != null : !this$flightUIDS.equals(other$flightUIDS))
            return false;
        if (this.size != other.size) return false;
        if (this.page != other.page) return false;
        final Object this$sort = this.sort;
        final Object other$sort = other.sort;
        if (this$sort == null ? other$sort != null : !this$sort.equals(other$sort)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $flightUIDS = this.flightUIDS;
        result = result * PRIME + ($flightUIDS == null ? 0 : $flightUIDS.hashCode());
        result = result * PRIME + this.size;
        result = result * PRIME + this.page;
        final Object $sort = this.sort;
        result = result * PRIME + ($sort == null ? 0 : $sort.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof FlightSearchByUIDSResource;
    }
}