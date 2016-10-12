package com.leanthoughts.sky.resources.order;

import com.leanthoughts.sky.resources.partner.EmployeeResource;
import com.leanthoughts.sky.resources.partner.VendorResource;
import com.leanthoughts.sky.resources.planning.StationResource;

import java.time.LocalDate;
import java.util.List;

/**
 * @author fahad
 * @since 10-05-2016.
 */
public class PurchaseOrderResource extends BaseOrderResource {

    private String purchaseOrderUid;
    private static final String type = "PurchaseOrder";
    private String orderingPartyReference;
    private String recepientPartyReference;
    private String contactPersonReference;
    private List<String> referenceOrder;
    private LocalDate deliveryDate;
    private String deliveryAddress;
    private StationResource deliveryStation;
    private PurchaseOrderStatus status;
    private String subType;
    private String planningGroup;
    private EmployeeResource storeEmployee;
    private EmployeeResource cateringExecutive;
    private EmployeeResource orderingPartyEmployee;
    private FlightSectorResource flightSector;


    /** Customized Properties For App**/
    private String orderingParty;
    private String recepientParty;
    private String contactPerson;
    private VendorResource vendor;

    public PurchaseOrderResource() {
    }

    public String getPurchaseOrderUid() {
        return purchaseOrderUid;
    }

    public void setPurchaseOrderUid(String purchaseOrderUid) {
        this.purchaseOrderUid = purchaseOrderUid;
    }

    public static String getType() {
        return type;
    }

    public String getOrderingPartyReference() {
        return orderingPartyReference;
    }

    public void setOrderingPartyReference(String orderingPartyReference) {
        this.orderingPartyReference = orderingPartyReference;
    }

    public String getRecepientPartyReference() {
        return recepientPartyReference;
    }

    public void setRecepientPartyReference(String recepientPartyReference) {
        this.recepientPartyReference = recepientPartyReference;
    }

    public String getContactPersonReference() {
        return contactPersonReference;
    }

    public void setContactPersonReference(String contactPersonReference) {
        this.contactPersonReference = contactPersonReference;
    }

    public List<String> getReferenceOrder() {
        return referenceOrder;
    }

    public void setReferenceOrder(List<String> referenceOrder) {
        this.referenceOrder = referenceOrder;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public PurchaseOrderStatus getStatus() {
        return status;
    }

    public void setStatus(PurchaseOrderStatus status) {
        this.status = status;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public String getPlanningGroup() {
        return planningGroup;
    }

    public void setPlanningGroup(String planningGroup) {
        this.planningGroup = planningGroup;
    }

    public String getOrderingParty() {
        return orderingParty;
    }

    public void setOrderingParty(String orderingParty) {
        this.orderingParty = orderingParty;
    }

    public String getRecepientParty() {
        return recepientParty;
    }

    public void setRecepientParty(String recepientParty) {
        this.recepientParty = recepientParty;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public StationResource getDeliveryStation() {
        return deliveryStation;
    }

    public void setDeliveryStation(StationResource deliveryStation) {
        this.deliveryStation = deliveryStation;
    }

    public VendorResource getVendor() {
        return vendor;
    }

    public void setVendor(VendorResource vendor) {
        this.vendor = vendor;
    }

    public EmployeeResource getStoreEmployee() {
        return storeEmployee;
    }

    public void setStoreEmployee(EmployeeResource storeEmployee) {
        this.storeEmployee = storeEmployee;
    }

    public EmployeeResource getCateringExecutive() {
        return cateringExecutive;
    }

    public void setCateringExecutive(EmployeeResource cateringExecutive) {
        this.cateringExecutive = cateringExecutive;
    }

    public EmployeeResource getOrderingPartyEmployee() {
        return orderingPartyEmployee;
    }

    public void setOrderingPartyEmployee(EmployeeResource orderingPartyEmployee) {
        this.orderingPartyEmployee = orderingPartyEmployee;
    }

    public FlightSectorResource getFlightSector() {
        return flightSector;
    }

    public void setFlightSector(FlightSectorResource flightSector) {
        this.flightSector = flightSector;
    }
}
