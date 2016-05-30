package com.leanthoughts.sky.resources.flight;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.leanthoughts.sky.resources.dictionary.FlightSearchType;
import com.leanthoughts.sky.resources.pagination.PageableResource;

import java.util.Date;

/**
 * Created by fahad on 01-02-2016.
 */
public class FlightSearchResource {

    private String connId;
    private String fromAirport;
    private String toAirport;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date fromDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date toDate;
    @JsonFormat(pattern = "HH:mm")
    private Date sta;
    @JsonFormat(pattern = "HH:mm")
    private Date std;
    private String upliftStation;
    private String unloadStation;
    private String tailNumber;
    private FlightSearchType flightSearchType;

    private PageableResource pageableResource;

    public String getConnId() {
        return connId;
    }

    public void setConnId(String connId) {
        this.connId = connId;
    }

    public String getFromAirport() {
        return fromAirport;
    }

    public void setFromAirport(String fromAirport) {
        this.fromAirport = fromAirport;
    }

    public String getToAirport() {
        return toAirport;
    }

    public void setToAirport(String toAirport) {
        this.toAirport = toAirport;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Date getSta() {
        return sta;
    }

    public void setSta(Date sta) {
        this.sta = sta;
    }

    public Date getStd() {
        return std;
    }

    public void setStd(Date std) {
        this.std = std;
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

    public String getTailNumber() {
        return tailNumber;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    public FlightSearchType getFlightSearchType() {
        return flightSearchType;
    }

    public void setFlightSearchType(FlightSearchType flightSearchType) {
        this.flightSearchType = flightSearchType;
    }
}
