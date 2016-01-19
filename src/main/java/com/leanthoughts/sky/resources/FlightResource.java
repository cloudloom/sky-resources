package com.leanthoughts.sky.resources;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Created by sadath on 01-Jan-2016.
 */
public class FlightResource extends BaseResource {
    private String flightUid;
    private String connId;
    private Date flightDate;
    @JsonFormat(pattern = "HH:mm:ss")
    private Date eta;
    @JsonFormat(pattern = "HH:mm:ss")
    private Date etd;
    private AirportResource fromAirport;
    private AirportResource toAirport;
    private AirlineResource operator;
    @JsonFormat(pattern = "HH:mm:ss")
    private Date sta;
    @JsonFormat(pattern = "HH:mm:ss")
    private Date std;
    private String period;
    private PlaneResource plane;
    private ScheduleResource schedule;

    public FlightResource() {
    }

    public String getFlightUid() {
        return this.flightUid;
    }

    public String getConnId() {
        return this.connId;
    }

    public Date getFlightDate() {
        return this.flightDate;
    }

    public Date getEta() {
        return this.eta;
    }

    public Date getEtd() {
        return this.etd;
    }

    public AirportResource getFromAirport() {
        return this.fromAirport;
    }

    public AirportResource getToAirport() {
        return this.toAirport;
    }

    public AirlineResource getOperator() {
        return this.operator;
    }

    public Date getSta() {
        return this.sta;
    }

    public Date getStd() {
        return this.std;
    }

    public String getPeriod() {
        return this.period;
    }

    public PlaneResource getPlane() {
        return this.plane;
    }

    public ScheduleResource getSchedule() {
        return this.schedule;
    }

    public void setFlightUid(String id) {
        this.flightUid = id;
    }

    public void setConnId(String connId) {
        this.connId = connId;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }

    public void setEta(Date eta) {
        this.eta = eta;
    }

    public void setEtd(Date etd) {
        this.etd = etd;
    }

    public void setFromAirport(AirportResource fromAirport) {
        this.fromAirport = fromAirport;
    }

    public void setToAirport(AirportResource toAirport) {
        this.toAirport = toAirport;
    }

    public void setOperator(AirlineResource operator) {
        this.operator = operator;
    }

    public void setSta(Date sta) {
        this.sta = sta;
    }

    public void setStd(Date std) {
        this.std = std;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public void setPlane(PlaneResource plane) {
        this.plane = plane;
    }

    public void setSchedule(ScheduleResource schedule) {
        this.schedule = schedule;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof FlightResource)) return false;
        final FlightResource other = (FlightResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.flightUid;
        final Object other$id = other.flightUid;
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$connId = this.connId;
        final Object other$connId = other.connId;
        if (this$connId == null ? other$connId != null : !this$connId.equals(other$connId)) return false;
        final Object this$flightDate = this.flightDate;
        final Object other$flightDate = other.flightDate;
        if (this$flightDate == null ? other$flightDate != null : !this$flightDate.equals(other$flightDate))
            return false;
        final Object this$eta = this.eta;
        final Object other$eta = other.eta;
        if (this$eta == null ? other$eta != null : !this$eta.equals(other$eta)) return false;
        final Object this$etd = this.etd;
        final Object other$etd = other.etd;
        if (this$etd == null ? other$etd != null : !this$etd.equals(other$etd)) return false;
        final Object this$fromAirport = this.fromAirport;
        final Object other$fromAirport = other.fromAirport;
        if (this$fromAirport == null ? other$fromAirport != null : !this$fromAirport.equals(other$fromAirport))
            return false;
        final Object this$toAirport = this.toAirport;
        final Object other$toAirport = other.toAirport;
        if (this$toAirport == null ? other$toAirport != null : !this$toAirport.equals(other$toAirport)) return false;
        final Object this$operator = this.operator;
        final Object other$operator = other.operator;
        if (this$operator == null ? other$operator != null : !this$operator.equals(other$operator)) return false;
        final Object this$sta = this.sta;
        final Object other$sta = other.sta;
        if (this$sta == null ? other$sta != null : !this$sta.equals(other$sta)) return false;
        final Object this$std = this.std;
        final Object other$std = other.std;
        if (this$std == null ? other$std != null : !this$std.equals(other$std)) return false;
        final Object this$period = this.period;
        final Object other$period = other.period;
        if (this$period == null ? other$period != null : !this$period.equals(other$period)) return false;
        final Object this$plane = this.plane;
        final Object other$plane = other.plane;
        if (this$plane == null ? other$plane != null : !this$plane.equals(other$plane)) return false;
        final Object this$schedule = this.schedule;
        final Object other$schedule = other.schedule;
        if (this$schedule == null ? other$schedule != null : !this$schedule.equals(other$schedule)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.flightUid;
        result = result * PRIME + ($id == null ? 0 : $id.hashCode());
        final Object $connId = this.connId;
        result = result * PRIME + ($connId == null ? 0 : $connId.hashCode());
        final Object $flightDate = this.flightDate;
        result = result * PRIME + ($flightDate == null ? 0 : $flightDate.hashCode());
        final Object $eta = this.eta;
        result = result * PRIME + ($eta == null ? 0 : $eta.hashCode());
        final Object $etd = this.etd;
        result = result * PRIME + ($etd == null ? 0 : $etd.hashCode());
        final Object $fromAirport = this.fromAirport;
        result = result * PRIME + ($fromAirport == null ? 0 : $fromAirport.hashCode());
        final Object $toAirport = this.toAirport;
        result = result * PRIME + ($toAirport == null ? 0 : $toAirport.hashCode());
        final Object $operator = this.operator;
        result = result * PRIME + ($operator == null ? 0 : $operator.hashCode());
        final Object $sta = this.sta;
        result = result * PRIME + ($sta == null ? 0 : $sta.hashCode());
        final Object $std = this.std;
        result = result * PRIME + ($std == null ? 0 : $std.hashCode());
        final Object $period = this.period;
        result = result * PRIME + ($period == null ? 0 : $period.hashCode());
        final Object $plane = this.plane;
        result = result * PRIME + ($plane == null ? 0 : $plane.hashCode());
        final Object $schedule = this.schedule;
        result = result * PRIME + ($schedule == null ? 0 : $schedule.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof FlightResource;
    }
}