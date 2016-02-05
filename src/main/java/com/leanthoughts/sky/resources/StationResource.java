package com.leanthoughts.sky.resources;

/**
 * Created by fahad on 25-01-2016.
 */

public class StationResource extends BaseResource {

    private String stationUid;
    private String code;
    private String name;
    private String airport;
    private AirportResource airportDetails;
    private String orgUnitID;

    public StationResource() {
    }

    public String getStationUid() {
        return stationUid;
    }

    public void setStationUid(String stationUid) {
        this.stationUid = stationUid;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public String getAirport() {
        return this.airport;
    }

    public AirportResource getAirportDetails() {
        return this.airportDetails;
    }

    public String getOrgUnitID() {
        return this.orgUnitID;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public void setAirportDetails(AirportResource airportDetails) {
        this.airportDetails = airportDetails;
    }

    public void setOrgUnitID(String orgUnitID) {
        this.orgUnitID = orgUnitID;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof StationResource)) return false;
        final StationResource other = (StationResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$code = this.code;
        final Object other$code = other.code;
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) return false;
        final Object this$name = this.name;
        final Object other$name = other.name;
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$airport = this.airport;
        final Object other$airport = other.airport;
        if (this$airport == null ? other$airport != null : !this$airport.equals(other$airport)) return false;
        final Object this$airportDetails = this.airportDetails;
        final Object other$airportDetails = other.airportDetails;
        if (this$airportDetails == null ? other$airportDetails != null : !this$airportDetails.equals(other$airportDetails))
            return false;
        final Object this$orgUnitID = this.orgUnitID;
        final Object other$orgUnitID = other.orgUnitID;
        if (this$orgUnitID == null ? other$orgUnitID != null : !this$orgUnitID.equals(other$orgUnitID)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $code = this.code;
        result = result * PRIME + ($code == null ? 0 : $code.hashCode());
        final Object $name = this.name;
        result = result * PRIME + ($name == null ? 0 : $name.hashCode());
        final Object $airport = this.airport;
        result = result * PRIME + ($airport == null ? 0 : $airport.hashCode());
        final Object $airportDetails = this.airportDetails;
        result = result * PRIME + ($airportDetails == null ? 0 : $airportDetails.hashCode());
        final Object $orgUnitID = this.orgUnitID;
        result = result * PRIME + ($orgUnitID == null ? 0 : $orgUnitID.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof StationResource;
    }

}
