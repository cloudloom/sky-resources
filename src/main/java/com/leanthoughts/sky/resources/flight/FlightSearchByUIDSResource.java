package com.leanthoughts.sky.resources.flight;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.leanthoughts.sky.resources.pagination.PageableResource;

import java.util.List;
import java.util.Set;

/**
 * Created by sadath on 01-Apr-2016.
 */
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightSearchByUIDSResource {
    private Set<String> flightUIDS;
    private String upliftStation;
    private String unloadStation;
    private PageableResource pageableResource;

    public Set<String> getFlightUIDS() {
        return flightUIDS;
    }

    public void setFlightUIDS(Set<String> flightUIDS) {
        this.flightUIDS = flightUIDS;
    }

    public PageableResource getPageableResource() {
        return pageableResource;
    }

    public void setPageableResource(PageableResource pageableResource) {
        this.pageableResource = pageableResource;
    }

    public String getUpliftStation() {
        return upliftStation;
    }

    public void setUpliftStation(String upliftStation) {
        this.upliftStation = upliftStation;
    }

    public String getUnloadStation() {
        return unloadStation;
    }

    public void setUnloadStation(String unloadStation) {
        this.unloadStation = unloadStation;
    }
}