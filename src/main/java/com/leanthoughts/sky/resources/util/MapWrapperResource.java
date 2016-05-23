package com.leanthoughts.sky.resources.util;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sadath on 23-May-2016.
 */
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MapWrapperResource {
    public final Map<String, String> map = new HashMap<String, String>();

    public Map<String, String> getMap() {
        return map;
    }
}
