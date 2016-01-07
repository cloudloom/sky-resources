package com.leanthoughts.sky.resources;

import java.util.Date;

/**
 * Created by sadath on 01-Jan-2016.
 */
public class FlightResource extends BaseResource {
    private String id;
    private String connId;
    private Date flightDate;
    private Date eta;
    private Date etd;
    private AirportResource fromAirport;
    private AirportResource toAirport;
    private AirlineResource operator;
    private Date sta;
    private Date std;
    private String period;
    private PlaneResource plane;
    private ScheduleResource schedule;
}