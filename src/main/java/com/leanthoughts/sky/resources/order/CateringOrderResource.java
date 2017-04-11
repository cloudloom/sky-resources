package com.leanthoughts.sky.resources.order;

import com.leanthoughts.sky.resources.partner.EmployeeResource;
import com.leanthoughts.sky.resources.planning.StationResource;

import java.time.LocalDateTime;

public class CateringOrderResource extends BaseOrderResource {
    private static final String type = "Catering order";
    private FlightSectorResource flightResource;
    private String flightUid;
    private String cateringExecutive;
    private String upliftStation;
    private String unloadStation;
    private LocalDateTime confirmationDateTime;
    private CateringOrderStatus status;
    private PrebookingResource preBooking;
    private String orderId;
    private String tailNo;
    private String cateringOrderUid;

    private EmployeeResource cateringExecutiveMeta;
    private EmployeeResource createdByMeta;
    private StationResource upliftStationMeta;
    private StationResource unloadStationMeta;
    private boolean glpApplied;


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

    public FlightSectorResource getFlightResource() {
        return flightResource;
    }

    public void setFlightResource(FlightSectorResource flightResource) {
        this.flightResource = flightResource;
    }

    public String getFlightUid() {
        return flightUid;
    }

    public void setFlightUid(String flightUid) {
        this.flightUid = flightUid;
    }

    public String getCateringExecutive() {
        return cateringExecutive;
    }

    public void setCateringExecutive(String cateringExecutive) {
        this.cateringExecutive = cateringExecutive;
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

    public LocalDateTime getConfirmationDateTime() {
        return confirmationDateTime;
    }

    public void setConfirmationDateTime(LocalDateTime confirmationDateTime) {
        this.confirmationDateTime = confirmationDateTime;
    }

    public CateringOrderStatus getStatus() {
        return status;
    }

    public void setStatus(CateringOrderStatus status) {
        this.status = status;
    }

    public PrebookingResource getPreBooking() {
        return preBooking;
    }

    public void setPreBooking(PrebookingResource preBooking) {
        this.preBooking = preBooking;
    }

    @Override
    public String getOrderId() {
        return orderId;
    }

    @Override
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getTailNo() {
        return tailNo;
    }

    public void setTailNo(String tailNo) {
        this.tailNo = tailNo;
    }

    public String getCateringOrderUid() {
        return cateringOrderUid;
    }

    public void setCateringOrderUid(String cateringOrderUid) {
        this.cateringOrderUid = cateringOrderUid;
    }

    public EmployeeResource getCateringExecutiveMeta() {
        return cateringExecutiveMeta;
    }

    public void setCateringExecutiveMeta(EmployeeResource cateringExecutiveMeta) {
        this.cateringExecutiveMeta = cateringExecutiveMeta;
    }

    public EmployeeResource getCreatedByMeta() {
        return createdByMeta;
    }

    public void setCreatedByMeta(EmployeeResource createdByMeta) {
        this.createdByMeta = createdByMeta;
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

    public boolean isGlpApplied() {
        return glpApplied;
    }

    public void setGlpApplied(boolean glpApplied) {
        this.glpApplied = glpApplied;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CateringOrderResource that = (CateringOrderResource) o;

        if (!flightResource.equals(that.flightResource)) return false;
        if (!flightUid.equals(that.flightUid)) return false;
        if (!cateringExecutive.equals(that.cateringExecutive)) return false;
        if (!upliftStation.equals(that.upliftStation)) return false;
        return unloadStation.equals(that.unloadStation);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + flightResource.hashCode();
        result = 31 * result + flightUid.hashCode();
        result = 31 * result + cateringExecutive.hashCode();
        result = 31 * result + upliftStation.hashCode();
        result = 31 * result + unloadStation.hashCode();
        return result;
    }
}