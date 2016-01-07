package com.leanthoughts.sky.resources.wrapper;

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
public class FlightResourceWrapper {
    private List<FlightResource> flights = new ArrayList<FlightResource>();
}
