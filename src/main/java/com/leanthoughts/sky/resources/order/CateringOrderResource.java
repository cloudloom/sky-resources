package com.leanthoughts.sky.resources.order;

import com.leanthoughts.sky.resources.flight.FlightResource;
import com.leanthoughts.sky.resources.planning.StationResource;
import com.leanthoughts.sky.resources.product.ArticleResource;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class CateringOrderResource extends BaseOrderResource {
    private static final String type = "Catering order";
    private FlightSectorResource flightSector;
    private String flightUid;
    private String cateringExecutive;
    private String upliftStation;
    private String unloadStation;
    private Integer totalPax;
    private Integer preBookingsCount;
    private Integer premiumBookingCount;
    private LocalDateTime confirmationDateTime;
    private CateringOrderStatus status;
    private FlightResource flight;
    private PrebookingResource preBooking;

    /** Customized Properties For App**/
    private String tailNo;
    private StationResource upliftStationResource;
    private StationResource unloadStationResource;
    final private Set<ArticleResource> products = new HashSet<ArticleResource>();

    public CateringOrderResource() {
    }

    public static String getType() {
        return type;
    }

    @Override
    public String getOrderType(){
        if(super.getOrderType() == null || super.getOrderType().isEmpty())
            return "CateringOrder";
        else
            return super.getOrderType();
    }

    public FlightSectorResource getFlightSector() {
        return this.flightSector;
    }

    public String getFlightUid() {
        return this.flightUid;
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

    public CateringOrderStatus getStatus() {
        return this.status;
    }

    public FlightResource getFlight() {
        return this.flight;
    }

    public PrebookingResource getPreBooking() {
        return this.preBooking;
    }

    public String getTailNo() {
        return this.tailNo;
    }

    public StationResource getUpliftStationResource() {
        return this.upliftStationResource;
    }

    public StationResource getUnloadStationResource() {
        return this.unloadStationResource;
    }

    public Set<ArticleResource> getProducts() {
        return this.products;
    }

    public void setFlightSector(FlightSectorResource flightSector) {
        this.flightSector = flightSector;
    }

    public void setFlightUid(String flightUid) {
        this.flightUid = flightUid;
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

    public void setStatus(CateringOrderStatus status) {
        this.status = status;
    }

    public void setFlight(FlightResource flight) {
        this.flight = flight;
    }

    public void setPreBooking(PrebookingResource preBooking) {
        this.preBooking = preBooking;
    }

    public void setTailNo(String tailNo) {
        this.tailNo = tailNo;
    }

    public void setUpliftStationResource(StationResource upliftStationResource) {
        this.upliftStationResource = upliftStationResource;
    }

    public void setUnloadStationResource(StationResource unloadStationResource) {
        this.unloadStationResource = unloadStationResource;
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
        final Object this$flightUid = this.flightUid;
        final Object other$flightUid = other.flightUid;
        if (this$flightUid == null ? other$flightUid != null : !this$flightUid.equals(other$flightUid)) return false;
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
        final Object this$status = this.status;
        final Object other$status = other.status;
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$flight = this.flight;
        final Object other$flight = other.flight;
        if (this$flight == null ? other$flight != null : !this$flight.equals(other$flight)) return false;
        final Object this$preBooking = this.preBooking;
        final Object other$preBooking = other.preBooking;
        if (this$preBooking == null ? other$preBooking != null : !this$preBooking.equals(other$preBooking))
            return false;
        final Object this$tailNo = this.tailNo;
        final Object other$tailNo = other.tailNo;
        if (this$tailNo == null ? other$tailNo != null : !this$tailNo.equals(other$tailNo)) return false;
        final Object this$upliftStationResource = this.upliftStationResource;
        final Object other$upliftStationResource = other.upliftStationResource;
        if (this$upliftStationResource == null ? other$upliftStationResource != null : !this$upliftStationResource.equals(other$upliftStationResource))
            return false;
        final Object this$unloadStationResource = this.unloadStationResource;
        final Object other$unloadStationResource = other.unloadStationResource;
        if (this$unloadStationResource == null ? other$unloadStationResource != null : !this$unloadStationResource.equals(other$unloadStationResource))
            return false;
        final Object this$products = this.products;
        final Object other$products = other.products;
        if (this$products == null ? other$products != null : !this$products.equals(other$products)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $flightSector = this.flightSector;
        result = result * PRIME + ($flightSector == null ? 0 : $flightSector.hashCode());
        final Object $flightUid = this.flightUid;
        result = result * PRIME + ($flightUid == null ? 0 : $flightUid.hashCode());
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
        final Object $status = this.status;
        result = result * PRIME + ($status == null ? 0 : $status.hashCode());
        final Object $flight = this.flight;
        result = result * PRIME + ($flight == null ? 0 : $flight.hashCode());
        final Object $preBooking = this.preBooking;
        result = result * PRIME + ($preBooking == null ? 0 : $preBooking.hashCode());
        final Object $tailNo = this.tailNo;
        result = result * PRIME + ($tailNo == null ? 0 : $tailNo.hashCode());
        final Object $upliftStationResource = this.upliftStationResource;
        result = result * PRIME + ($upliftStationResource == null ? 0 : $upliftStationResource.hashCode());
        final Object $unloadStationResource = this.unloadStationResource;
        result = result * PRIME + ($unloadStationResource == null ? 0 : $unloadStationResource.hashCode());
        final Object $products = this.products;
        result = result * PRIME + ($products == null ? 0 : $products.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof CateringOrderResource;
    }
}