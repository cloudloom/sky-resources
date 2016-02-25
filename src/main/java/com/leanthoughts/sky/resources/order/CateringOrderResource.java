package com.leanthoughts.sky.resources.order;

import com.leanthoughts.sky.resources.flight.FlightResource;

import java.time.LocalDateTime;

public class CateringOrderResource extends BaseOrderResource {
    private static final String type = "Catering order";
    private FlightSectorResource flightSector;
    private String cateringExecutive;
    private String upliftStation;
    private String unloadStation;
    private Integer totalPax;
    private Integer preBookingsCount;
    private Integer premiumBookingCount;
    private LocalDateTime confirmationDateTime;
    private CateringOrderStatus orderStatus;
    private FlightResource flight;
    private PrebookingResource preBooking;

    public CateringOrderResource() {
    }

    public FlightSectorResource getFlightSector() {
        return this.flightSector;
    }

    public String getCateringExecutive() {
        return this.cateringExecutive;
    }

    public String getUpliftStation() {
        return this.upliftStation;
    }

    public String getUnloadStation() {
        return this.unloadStation;
    }

    public Integer getTotalPax() {
        return this.totalPax;
    }

    public Integer getPreBookingsCount() {
        return this.preBookingsCount;
    }

    public Integer getPremiumBookingCount() {
        return this.premiumBookingCount;
    }

    public LocalDateTime getConfirmationDateTime() {
        return this.confirmationDateTime;
    }

    public CateringOrderStatus getOrderStatus() {
        return this.orderStatus;
    }

    public FlightResource getFlight() {
        return flight;
    }

    public PrebookingResource getPreBooking() {
        return preBooking;
    }

    public void setPreBooking(PrebookingResource preBooking) {
        this.preBooking = preBooking;
    }

    public void setFlight(FlightResource flight) {
        this.flight = flight;
    }

    public void setFlightSector(FlightSectorResource flightSector) {
        this.flightSector = flightSector;
    }

    public void setCateringExecutive(String cateringExecutive) {
        this.cateringExecutive = cateringExecutive;
    }

    public void setUpliftStation(String upliftStation) {
        this.upliftStation = upliftStation;
    }

    public void setUnloadStation(String unloadStation) {
        this.unloadStation = unloadStation;
    }

    public void setTotalPax(Integer totalPax) {
        this.totalPax = totalPax;
    }

    public void setPreBookingsCount(Integer preBookingsCount) {
        this.preBookingsCount = preBookingsCount;
    }

    public void setPremiumBookingCount(Integer premiumBookingCount) {
        this.premiumBookingCount = premiumBookingCount;
    }

    public void setConfirmationDateTime(LocalDateTime confirmationDateTime) {
        this.confirmationDateTime = confirmationDateTime;
    }

    public void setOrderStatus(CateringOrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof CateringOrderResource)) return false;
        final CateringOrderResource other = (CateringOrderResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$flightSector = this.flightSector;
        final Object other$flightSector = other.flightSector;
        if (this$flightSector == null ? other$flightSector != null : !this$flightSector.equals(other$flightSector))
            return false;
        final Object this$cateringExecutive = this.cateringExecutive;
        final Object other$cateringExecutive = other.cateringExecutive;
        if (this$cateringExecutive == null ? other$cateringExecutive != null : !this$cateringExecutive.equals(other$cateringExecutive))
            return false;
        final Object this$upliftStation = this.upliftStation;
        final Object other$upliftStation = other.upliftStation;
        if (this$upliftStation == null ? other$upliftStation != null : !this$upliftStation.equals(other$upliftStation))
            return false;
        final Object this$unloadStation = this.unloadStation;
        final Object other$unloadStation = other.unloadStation;
        if (this$unloadStation == null ? other$unloadStation != null : !this$unloadStation.equals(other$unloadStation))
            return false;
        final Object this$totalPax = this.totalPax;
        final Object other$totalPax = other.totalPax;
        if (this$totalPax == null ? other$totalPax != null : !this$totalPax.equals(other$totalPax)) return false;
        final Object this$preBookingsCount = this.preBookingsCount;
        final Object other$preBookingsCount = other.preBookingsCount;
        if (this$preBookingsCount == null ? other$preBookingsCount != null : !this$preBookingsCount.equals(other$preBookingsCount))
            return false;
        final Object this$premiumBookingCount = this.premiumBookingCount;
        final Object other$premiumBookingCount = other.premiumBookingCount;
        if (this$premiumBookingCount == null ? other$premiumBookingCount != null : !this$premiumBookingCount.equals(other$premiumBookingCount))
            return false;
        final Object this$confirmationDateTime = this.confirmationDateTime;
        final Object other$confirmationDateTime = other.confirmationDateTime;
        if (this$confirmationDateTime == null ? other$confirmationDateTime != null : !this$confirmationDateTime.equals(other$confirmationDateTime))
            return false;
        final Object this$orderStatus = this.orderStatus;
        final Object other$orderStatus = other.orderStatus;
        if (this$orderStatus == null ? other$orderStatus != null : !this$orderStatus.equals(other$orderStatus))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $flightSector = this.flightSector;
        result = result * PRIME + ($flightSector == null ? 0 : $flightSector.hashCode());
        final Object $cateringExecutive = this.cateringExecutive;
        result = result * PRIME + ($cateringExecutive == null ? 0 : $cateringExecutive.hashCode());
        final Object $upliftStation = this.upliftStation;
        result = result * PRIME + ($upliftStation == null ? 0 : $upliftStation.hashCode());
        final Object $unloadStation = this.unloadStation;
        result = result * PRIME + ($unloadStation == null ? 0 : $unloadStation.hashCode());
        final Object $totalPax = this.totalPax;
        result = result * PRIME + ($totalPax == null ? 0 : $totalPax.hashCode());
        final Object $preBookingsCount = this.preBookingsCount;
        result = result * PRIME + ($preBookingsCount == null ? 0 : $preBookingsCount.hashCode());
        final Object $premiumBookingCount = this.premiumBookingCount;
        result = result * PRIME + ($premiumBookingCount == null ? 0 : $premiumBookingCount.hashCode());
        final Object $confirmationDateTime = this.confirmationDateTime;
        result = result * PRIME + ($confirmationDateTime == null ? 0 : $confirmationDateTime.hashCode());
        final Object $orderStatus = this.orderStatus;
        result = result * PRIME + ($orderStatus == null ? 0 : $orderStatus.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof CateringOrderResource;
    }
}