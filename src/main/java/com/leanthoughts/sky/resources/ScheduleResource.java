package com.leanthoughts.sky.resources;

import java.util.Date;

/**
 * Created by sadath on 01-Jan-2016.
 */
public class ScheduleResource extends BaseResource {
    private AirlineResource operator;
    private String connId;
    private String country;
    private String cityFrom;
    private AirportResource airportFrom;
    private String cityTo;
    private AirportResource airportTo;
    private Date std;
    private Date sta;
    private int distance;
    private String unitDistance;
    private String flightType;
    private String period;

    public ScheduleResource() {
    }

    public AirlineResource getOperator() {
        return this.operator;
    }

    public String getConnId() {
        return this.connId;
    }

    public String getCountry() {
        return this.country;
    }

    public String getCityFrom() {
        return this.cityFrom;
    }

    public AirportResource getAirportFrom() {
        return this.airportFrom;
    }

    public String getCityTo() {
        return this.cityTo;
    }

    public AirportResource getAirportTo() {
        return this.airportTo;
    }

    public Date getStd() {
        return this.std;
    }

    public Date getSta() {
        return this.sta;
    }

    public int getDistance() {
        return this.distance;
    }

    public String getUnitDistance() {
        return this.unitDistance;
    }

    public String getFlightType() {
        return this.flightType;
    }

    public String getPeriod() {
        return this.period;
    }

    public void setOperator(AirlineResource operator) {
        this.operator = operator;
    }

    public void setConnId(String connId) {
        this.connId = connId;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCityFrom(String cityFrom) {
        this.cityFrom = cityFrom;
    }

    public void setAirportFrom(AirportResource airportFrom) {
        this.airportFrom = airportFrom;
    }

    public void setCityTo(String cityTo) {
        this.cityTo = cityTo;
    }

    public void setAirportTo(AirportResource airportTo) {
        this.airportTo = airportTo;
    }

    public void setStd(Date std) {
        this.std = std;
    }

    public void setSta(Date sta) {
        this.sta = sta;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setUnitDistance(String unitDistance) {
        this.unitDistance = unitDistance;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ScheduleResource)) return false;
        final ScheduleResource other = (ScheduleResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$operator = this.operator;
        final Object other$operator = other.operator;
        if (this$operator == null ? other$operator != null : !this$operator.equals(other$operator)) return false;
        final Object this$connId = this.connId;
        final Object other$connId = other.connId;
        if (this$connId == null ? other$connId != null : !this$connId.equals(other$connId)) return false;
        final Object this$country = this.country;
        final Object other$country = other.country;
        if (this$country == null ? other$country != null : !this$country.equals(other$country)) return false;
        final Object this$cityFrom = this.cityFrom;
        final Object other$cityFrom = other.cityFrom;
        if (this$cityFrom == null ? other$cityFrom != null : !this$cityFrom.equals(other$cityFrom)) return false;
        final Object this$airportFrom = this.airportFrom;
        final Object other$airportFrom = other.airportFrom;
        if (this$airportFrom == null ? other$airportFrom != null : !this$airportFrom.equals(other$airportFrom))
            return false;
        final Object this$cityTo = this.cityTo;
        final Object other$cityTo = other.cityTo;
        if (this$cityTo == null ? other$cityTo != null : !this$cityTo.equals(other$cityTo)) return false;
        final Object this$airportTo = this.airportTo;
        final Object other$airportTo = other.airportTo;
        if (this$airportTo == null ? other$airportTo != null : !this$airportTo.equals(other$airportTo)) return false;
        final Object this$std = this.std;
        final Object other$std = other.std;
        if (this$std == null ? other$std != null : !this$std.equals(other$std)) return false;
        final Object this$sta = this.sta;
        final Object other$sta = other.sta;
        if (this$sta == null ? other$sta != null : !this$sta.equals(other$sta)) return false;
        if (this.distance != other.distance) return false;
        final Object this$unitDistance = this.unitDistance;
        final Object other$unitDistance = other.unitDistance;
        if (this$unitDistance == null ? other$unitDistance != null : !this$unitDistance.equals(other$unitDistance))
            return false;
        final Object this$flightType = this.flightType;
        final Object other$flightType = other.flightType;
        if (this$flightType == null ? other$flightType != null : !this$flightType.equals(other$flightType))
            return false;
        final Object this$period = this.period;
        final Object other$period = other.period;
        if (this$period == null ? other$period != null : !this$period.equals(other$period)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $operator = this.operator;
        result = result * PRIME + ($operator == null ? 0 : $operator.hashCode());
        final Object $connId = this.connId;
        result = result * PRIME + ($connId == null ? 0 : $connId.hashCode());
        final Object $country = this.country;
        result = result * PRIME + ($country == null ? 0 : $country.hashCode());
        final Object $cityFrom = this.cityFrom;
        result = result * PRIME + ($cityFrom == null ? 0 : $cityFrom.hashCode());
        final Object $airportFrom = this.airportFrom;
        result = result * PRIME + ($airportFrom == null ? 0 : $airportFrom.hashCode());
        final Object $cityTo = this.cityTo;
        result = result * PRIME + ($cityTo == null ? 0 : $cityTo.hashCode());
        final Object $airportTo = this.airportTo;
        result = result * PRIME + ($airportTo == null ? 0 : $airportTo.hashCode());
        final Object $std = this.std;
        result = result * PRIME + ($std == null ? 0 : $std.hashCode());
        final Object $sta = this.sta;
        result = result * PRIME + ($sta == null ? 0 : $sta.hashCode());
        result = result * PRIME + this.distance;
        final Object $unitDistance = this.unitDistance;
        result = result * PRIME + ($unitDistance == null ? 0 : $unitDistance.hashCode());
        final Object $flightType = this.flightType;
        result = result * PRIME + ($flightType == null ? 0 : $flightType.hashCode());
        final Object $period = this.period;
        result = result * PRIME + ($period == null ? 0 : $period.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ScheduleResource;
    }

    public String toString() {
        return "com.leanthoughts.sky.resources.ScheduleResource(operator=" + this.operator + ", connId=" + this.connId + ", country=" + this.country + ", cityFrom=" + this.cityFrom + ", airportFrom=" + this.airportFrom + ", cityTo=" + this.cityTo + ", airportTo=" + this.airportTo + ", std=" + this.std + ", sta=" + this.sta + ", distance=" + this.distance + ", unitDistance=" + this.unitDistance + ", flightType=" + this.flightType + ", period=" + this.period + ")";
    }
}