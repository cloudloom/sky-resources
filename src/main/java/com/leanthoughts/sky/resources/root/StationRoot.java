package com.leanthoughts.sky.resources.root;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.leanthoughts.sky.resources.StationResource;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fahad on 05-02-2016.
 */
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class StationRoot {

    private List<StationResource> stations=new ArrayList<>();

    public StationRoot() {
    }


    public List<StationResource> getStations() {
        return this.stations;
    }

    public void setStations(List<StationResource> stations) {
        this.stations = stations;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof StationRoot)) return false;
        final StationRoot other = (StationRoot) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$stations = this.stations;
        final Object other$stations = other.stations;
        if (this$stations == null ? other$stations != null : !this$stations.equals(other$stations)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $stations = this.stations;
        result = result * PRIME + ($stations == null ? 0 : $stations.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof StationRoot;
    }

}
