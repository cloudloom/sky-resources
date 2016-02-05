package com.leanthoughts.sky.resources;

/**
 * Created by fahad on 25-01-2016.
 */
public class StationResource extends BaseResource {

    private String Uid;
    private String code;
    private String name;
    private String airport;
    private AirportResource airportDetails;
    private String orgUnitID;

    public StationResource() {
    }

    @Override
    public String getUid() {
        return Uid;
    }

    @Override
    public void setUid(String uid) {
        Uid = uid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getOrgUnitID() {
        return orgUnitID;
    }

    public void setOrgUnitID(String orgUnitID) {
        this.orgUnitID = orgUnitID;
    }

    public AirportResource getAirportDetails() {
        return airportDetails;
    }

    public void setAirportDetails(AirportResource airportDetails) {
        this.airportDetails = airportDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        StationResource that = (StationResource) o;

        if (Uid != null ? !Uid.equals(that.Uid) : that.Uid != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (airport != null ? !airport.equals(that.airport) : that.airport != null) return false;
        return orgUnitID != null ? orgUnitID.equals(that.orgUnitID) : that.orgUnitID == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (Uid != null ? Uid.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (airport != null ? airport.hashCode() : 0);
        result = 31 * result + (orgUnitID != null ? orgUnitID.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "StationResource{" +
                "Uid='" + Uid + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", airport='" + airport + '\'' +
                ", orgUnitID='" + orgUnitID + '\'' +
                '}';
    }
}
