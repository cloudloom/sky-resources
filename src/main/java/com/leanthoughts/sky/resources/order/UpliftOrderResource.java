package com.leanthoughts.sky.resources.order;

/**
 * @author fahad
 * @since 19-07-2016.
 */
public class UpliftOrderResource extends BaseOrderResource {

    private static final String type = "UpliftOrder";
    private FlightSectorResource flightSector;
    private String upliftStation;
    private String unloadStation;

    public UpliftOrderResource(FlightSectorResource flightSector, String upliftStation, String unloadStation) {
        this.flightSector = flightSector;
        this.upliftStation = upliftStation;
        this.unloadStation = unloadStation;
    }

    protected UpliftOrderResource(){}

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
