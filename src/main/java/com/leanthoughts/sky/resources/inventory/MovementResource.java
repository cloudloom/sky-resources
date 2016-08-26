package com.leanthoughts.sky.resources.inventory;

import com.leanthoughts.sky.resources.order.BaseLineItemResource;

import java.util.Set;

/**
 * @author fahad
 * @since 06-06-2016.
 */
public class MovementResource {


    private OrderType orderType;
    private String orderId;

    //from org unit
    private String fromOrgUnit;

    //Receiving Org Unit
    private String orgUnitReference;
    private Set<BaseLineItemResource> lineItems;
    private MovementStatus movementStatus;

    public MovementResource(){}

    public MovementResource(OrderType orderType, String orderId, String fromOrgUnit, String orgUnitReference, Set<BaseLineItemResource> lineItems, MovementStatus movementStatus) {
        this.orderType = orderType;
        this.orderId = orderId;
        this.fromOrgUnit = fromOrgUnit;
        this.orgUnitReference = orgUnitReference;
        this.lineItems = lineItems;
        this.movementStatus = movementStatus;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getFromOrgUnit() {
        return fromOrgUnit;
    }

    public void setFromOrgUnit(String fromOrgUnit) {
        this.fromOrgUnit = fromOrgUnit;
    }

    public String getOrgUnitReference() {
        return orgUnitReference;
    }

    public void setOrgUnitReference(String orgUnitReference) {
        this.orgUnitReference = orgUnitReference;
    }

    public Set<BaseLineItemResource> getLineItems() {
        return lineItems;
    }

    public void setLineItems(Set<BaseLineItemResource> lineItems) {
        this.lineItems = lineItems;
    }

    public MovementStatus getMovementStatus() {
        return movementStatus;
    }

    public void setMovementStatus(MovementStatus movementStatus) {
        this.movementStatus = movementStatus;
    }
}
