package com.leanthoughts.sky.resources.root;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import com.leanthoughts.sky.resources.wrapper.FlightResourceWrapper;

/**
 * Created by sadath on 07-Jan-2016.
 */
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightResourceRoot {
    private FlightResourceWrapper _embedded;
}