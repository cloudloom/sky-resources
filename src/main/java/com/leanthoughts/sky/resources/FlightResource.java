package com.leanthoughts.sky.resources;

import java.util.Date;

/**
 * Created by sadath on 01-Jan-2016.
 */
public class FlightResource extends BaseResource {
    private String connId;
    private Date flightDate;
    private Date eta;
    private Date etd;
    private PlaneResource plane;
    private ScheduleResource schedule;

    public FlightResource() {
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

    public PlaneResource getPlane() {
        return this.plane;
    }

    public ScheduleResource getSchedule() {
        return this.schedule;
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
        final Object $connId = this.connId;
        result = result * PRIME + ($connId == null ? 0 : $connId.hashCode());
        final Object $flightDate = this.flightDate;
        result = result * PRIME + ($flightDate == null ? 0 : $flightDate.hashCode());
        final Object $eta = this.eta;
        result = result * PRIME + ($eta == null ? 0 : $eta.hashCode());
        final Object $etd = this.etd;
        result = result * PRIME + ($etd == null ? 0 : $etd.hashCode());
        final Object $plane = this.plane;
        result = result * PRIME + ($plane == null ? 0 : $plane.hashCode());
        final Object $schedule = this.schedule;
        result = result * PRIME + ($schedule == null ? 0 : $schedule.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof FlightResource;
    }

    public String toString() {
        return "com.leanthoughts.sky.resources.FlightResource(connId=" + this.connId + ", flightDate=" + this.flightDate + ", eta=" + this.eta + ", etd=" + this.etd + ", plane=" + this.plane + ", schedule=" + this.schedule + ")";
    }
}