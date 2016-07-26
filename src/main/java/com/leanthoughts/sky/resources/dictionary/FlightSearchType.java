package com.leanthoughts.sky.resources.dictionary;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Created by sadath on 20-May-2016.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum FlightSearchType {
    ALL_FLIGHTS("All Flights", "ALL_FLIGHTS"),
    FLIGHTS_WITH_ONLY_CATERING_ORDERS("Flights With Catering Orders", "FLIGHTS_WITH_ONLY_CATERING_ORDERS"),
    FLIGHTS_WITH_NO_CATERING_ORDERS("Flights Without Catering Orders", "FLIGHTS_WITH_NO_CATERING_ORDERS");

    private final String flightSearchType;
    private final String abbreviation;

    FlightSearchType(String flightSearchType, String abbreviation) {
        this.flightSearchType = flightSearchType;
        this.abbreviation = abbreviation;
    }

    public String getFlightSearchType() {
        return flightSearchType;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}