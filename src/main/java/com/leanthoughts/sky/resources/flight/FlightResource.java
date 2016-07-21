package com.leanthoughts.sky.resources.flight;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.leanthoughts.sky.resources.BaseResource;
import com.leanthoughts.sky.resources.order.CateringOrderStatus;
import com.leanthoughts.sky.resources.planning.MealPlanResource;
import com.leanthoughts.sky.resources.planning.StationResource;

import java.util.Date;
import java.util.Set;

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
    private String fromAirportCode;
    private String fromAirportName;
    private String toAirportCode;
    private String toAirportName;
    private String operator;
    @JsonFormat(pattern = "HH:mm:ss")
    private Date sta;
    @JsonFormat(pattern = "HH:mm:ss")
    private Date std;
    private String period;
    private String equipment;
    private String flightType;
    private PlaneResource plane;
    private ScheduleResource schedule;
    private String scheduleUid;
    private Boolean BOBStatus;
    private Set<Station> station;
    private String tailNo;
    private boolean hasCateringOrder;
    private CateringOrderStatus cateringOrderStatus;

    public FlightResource() {
    }

    @JsonIgnoreType
    public static class Station {
        private MealPlanResource mealPlan;
        private StationResource upliftStation;
        private StationResource unloadStation;

        public MealPlanResource getMealPlan() {
            return mealPlan;
        }

        public void setMealPlan(MealPlanResource mealPlan) {
            this.mealPlan = mealPlan;
        }

        public StationResource getUpliftStation() {
            return upliftStation;
        }

        public void setUpliftStation(StationResource upliftStation) {
            this.upliftStation = upliftStation;
        }

        public StationResource getUnloadStation() {
            return unloadStation;
        }

        public void setUnloadStation(StationResource unloadStation) {
            this.unloadStation = unloadStation;
        }
    }

    public Set<Station> getStation() {
        return station;
    }

    public void setStation(Set<Station> station) {
        this.station = station;
    }

    public Boolean getBOBStatus() {
        return BOBStatus;
    }

    public void setBOBStatus(Boolean BOBStatus) {
        this.BOBStatus = BOBStatus;
    }

    public String getFlightUid() {
        return flightUid;
    }

    public void setFlightUid(String flightUid) {
        this.flightUid = flightUid;
    }

    public String getConnId() {
        return connId;
    }

    public void setConnId(String connId) {
        this.connId = connId;
    }

    public Date getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }

    public Date getEta() {
        return eta;
    }

    public void setEta(Date eta) {
        this.eta = eta;
    }

    public Date getEtd() {
        return etd;
    }

    public void setEtd(Date etd) {
        this.etd = etd;
    }

    public String getFromAirportCode() {
        return fromAirportCode;
    }

    public void setFromAirportCode(String fromAirportCode) {
        this.fromAirportCode = fromAirportCode;
    }

    public String getFromAirportName() {
        return fromAirportName;
    }

    public void setFromAirportName(String fromAirportName) {
        this.fromAirportName = fromAirportName;
    }

    public String getToAirportCode() {
        return toAirportCode;
    }

    public void setToAirportCode(String toAirportCode) {
        this.toAirportCode = toAirportCode;
    }

    public String getToAirportName() {
        return toAirportName;
    }

    public void setToAirportName(String toAirportName) {
        this.toAirportName = toAirportName;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Date getSta() {
        return sta;
    }

    public void setSta(Date sta) {
        this.sta = sta;
    }

    public Date getStd() {
        return std;
    }

    public void setStd(Date std) {
        this.std = std;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getFlightType() {
        return flightType;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    public PlaneResource getPlane() {
        return plane;
    }

    public void setPlane(PlaneResource plane) {
        this.plane = plane;
    }

    public ScheduleResource getSchedule() {
        return schedule;
    }

    public void setSchedule(ScheduleResource schedule) {
        this.schedule = schedule;
    }

    public String getTailNo() {
        return tailNo;
    }

    public void setTailNo(String tailNo) {
        this.tailNo = tailNo;
    }

    public boolean isHasCateringOrder() {
        return hasCateringOrder;
    }

    public void setHasCateringOrder(boolean hasCateringOrder) {
        this.hasCateringOrder = hasCateringOrder;
    }

    public CateringOrderStatus getCateringOrderStatus() {
        return cateringOrderStatus;
    }

    public void setCateringOrderStatus(CateringOrderStatus cateringOrderStatus) {
        this.cateringOrderStatus = cateringOrderStatus;
    }

    public String getScheduleUid() {
        return scheduleUid;
    }

    public void setScheduleUid(String scheduleUid) {
        this.scheduleUid = scheduleUid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        FlightResource that = (FlightResource) o;

        if (flightUid != null ? !flightUid.equals(that.flightUid) : that.flightUid != null) return false;
        if (connId != null ? !connId.equals(that.connId) : that.connId != null) return false;
        if (flightDate != null ? !flightDate.equals(that.flightDate) : that.flightDate != null) return false;
        if (eta != null ? !eta.equals(that.eta) : that.eta != null) return false;
        if (etd != null ? !etd.equals(that.etd) : that.etd != null) return false;
        if (fromAirportCode != null ? !fromAirportCode.equals(that.fromAirportCode) : that.fromAirportCode != null)
            return false;
        if (fromAirportName != null ? !fromAirportName.equals(that.fromAirportName) : that.fromAirportName != null)
            return false;
        if (toAirportCode != null ? !toAirportCode.equals(that.toAirportCode) : that.toAirportCode != null)
            return false;
        if (toAirportName != null ? !toAirportName.equals(that.toAirportName) : that.toAirportName != null)
            return false;
        if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;
        if (sta != null ? !sta.equals(that.sta) : that.sta != null) return false;
        if (std != null ? !std.equals(that.std) : that.std != null) return false;
        if (period != null ? !period.equals(that.period) : that.period != null) return false;
        if (equipment != null ? !equipment.equals(that.equipment) : that.equipment != null) return false;
        if (flightType != null ? !flightType.equals(that.flightType) : that.flightType != null) return false;
        if (plane != null ? !plane.equals(that.plane) : that.plane != null) return false;
        return schedule != null ? schedule.equals(that.schedule) : that.schedule == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (flightUid != null ? flightUid.hashCode() : 0);
        result = 31 * result + (connId != null ? connId.hashCode() : 0);
        result = 31 * result + (flightDate != null ? flightDate.hashCode() : 0);
        result = 31 * result + (eta != null ? eta.hashCode() : 0);
        result = 31 * result + (etd != null ? etd.hashCode() : 0);
        result = 31 * result + (fromAirportCode != null ? fromAirportCode.hashCode() : 0);
        result = 31 * result + (fromAirportName != null ? fromAirportName.hashCode() : 0);
        result = 31 * result + (toAirportCode != null ? toAirportCode.hashCode() : 0);
        result = 31 * result + (toAirportName != null ? toAirportName.hashCode() : 0);
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        result = 31 * result + (sta != null ? sta.hashCode() : 0);
        result = 31 * result + (std != null ? std.hashCode() : 0);
        result = 31 * result + (period != null ? period.hashCode() : 0);
        result = 31 * result + (equipment != null ? equipment.hashCode() : 0);
        result = 31 * result + (flightType != null ? flightType.hashCode() : 0);
        result = 31 * result + (plane != null ? plane.hashCode() : 0);
        result = 31 * result + (schedule != null ? schedule.hashCode() : 0);
        return result;
    }
}