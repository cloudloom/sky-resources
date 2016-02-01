package com.leanthoughts.sky.resources;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Created by fahad on 01-02-2016.
 */
public class FlightSearchResource {

    private String connId;
    private String fromAirport;
    private String toAirport;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date fromDate;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date toDate;
    @JsonFormat(pattern = "HH:mm")
    private Date sta;
    @JsonFormat(pattern = "HH:mm")
    private Date std;

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
}
