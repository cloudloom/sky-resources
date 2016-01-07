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

    public FlightResourceRoot() {
    }

    public FlightResourceWrapper get_embedded() {
        return this._embedded;
    }

    public void set_embedded(FlightResourceWrapper _embedded) {
        this._embedded = _embedded;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof FlightResourceRoot)) return false;
        final FlightResourceRoot other = (FlightResourceRoot) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$_embedded = this._embedded;
        final Object other$_embedded = other._embedded;
        if (this$_embedded == null ? other$_embedded != null : !this$_embedded.equals(other$_embedded)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $_embedded = this._embedded;
        result = result * PRIME + ($_embedded == null ? 0 : $_embedded.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof FlightResourceRoot;
    }

    public String toString() {
        return "com.leanthoughts.sky.resources.root.FlightResourceRoot(_embedded=" + this._embedded + ")";
    }
}