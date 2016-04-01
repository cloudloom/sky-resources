package com.leanthoughts.sky.resources.flight;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.leanthoughts.sky.resources.pagination.PageableResource;

import java.util.List;

/**
 * Created by sadath on 01-Apr-2016.
 */
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightSearchByUIDSResource {
    private List<String> flightUIDS;
    private PageableResource pageableResource;

    public List<String> getFlightUIDS() {
        return flightUIDS;
    }

    public void setFlightUIDS(List<String> flightUIDS) {
        this.flightUIDS = flightUIDS;
    }

    public PageableResource getPageableResource() {
        return pageableResource;
    }

    public void setPageableResource(PageableResource pageableResource) {
        this.pageableResource = pageableResource;
    }
}