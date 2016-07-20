package com.leanthoughts.sky.resources.order;

import com.leanthoughts.sky.resources.flight.AirportResource;
import com.leanthoughts.sky.resources.planning.StationResource;

/**
 * @author fahad
 * @since 19-07-2016.
 */
public class UpliftOrderResource extends BaseOrderResource {

    private static final String type = "UpliftOrder";
    private FlightSectorResource flightSector;
    private String upliftStation;
    private String unloadStation;
    private StationResource upliftStationMeta;
    private StationResource unloadStationMeta;
    private AirportResource from;
    private AirportResource to;
    private String upliftUid;

    public UpliftOrderResource(FlightSectorResource flightSector, String upliftStation, String unloadStation) {
        this.flightSector = flightSector;
        this.upliftStation = upliftStation;
        this.unloadStation = unloadStation;
    }

    public UpliftOrderResource(){}

    public static String getType() {
        return type;
    }

    public FlightSectorResource getFlightSector() {
        return flightSector;
    }

    public void setFlightSector(FlightSectorResource flightSector) {
        this.flightSector = flightSector;
    }

    public String getUpliftStation() {
        return upliftStation;
    }

    public void setUpliftStation(String upliftStation) {
        this.upliftStation = upliftStation;
    }

    public String getUnloadStation() {
        return unloadStation;
    }

    public void setUnloadStation(String unloadStation) {
        this.unloadStation = unloadStation;
    }

    public StationResource getUpliftStationMeta() {
        return upliftStationMeta;
    }

    public void setUpliftStationMeta(StationResource upliftStationMeta) {
        this.upliftStationMeta = upliftStationMeta;
    }

    public StationResource getUnloadStationMeta() {
        return unloadStationMeta;
    }

    public void setUnloadStationMeta(StationResource unloadStationMeta) {
        this.unloadStationMeta = unloadStationMeta;
    }

    public AirportResource getFrom() {
        return from;
    }

    public void setFrom(AirportResource from) {
        this.from = from;
    }

    public AirportResource getTo() {
        return to;
    }

    public void setTo(AirportResource to) {
        this.to = to;
    }

    public String getUpliftUid() {
        return upliftUid;
    }

    public void setUpliftUid(String upliftUid) {
        this.upliftUid = upliftUid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        UpliftOrderResource that = (UpliftOrderResource) o;

        if (flightSector != null ? !flightSector.equals(that.flightSector) : that.flightSector != null) return false;
        if (upliftStation != null ? !upliftStation.equals(that.upliftStation) : that.upliftStation != null)
            return false;
        return unloadStation != null ? unloadStation.equals(that.unloadStation) : that.unloadStation == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (flightSector != null ? flightSector.hashCode() : 0);
        result = 31 * result + (upliftStation != null ? upliftStation.hashCode() : 0);
        result = 31 * result + (unloadStation != null ? unloadStation.hashCode() : 0);
        return result;
    }
}
