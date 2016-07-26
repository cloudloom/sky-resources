package com.leanthoughts.sky.resources.order;

import com.leanthoughts.sky.resources.BaseResource;

import java.time.LocalDateTime;
import java.util.*;

public abstract class BaseOrderResource extends BaseResource{
    private String id;
    private String orderId;
    private LocalDateTime created;
    private String createdBy;
    private String modifiedBy;
    private String comments;
    protected LocalDateTime lastModified;
    protected String orderType;
    private Map<DateType, Date> orderDates = new HashMap<>(0);
    private Set<String> referenceOrders = new HashSet<>(0);
    private Set<PartnerFunction> partnerFunctions = new HashSet<>(0);
    private OrganizationResource organization;
    private Set<BaseLineItemResource> lineItems = new HashSet<BaseLineItemResource>();
    private Double totalAmount;

    public BaseOrderResource() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public LocalDateTime getCreated() {
        return this.created;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public String getModifiedBy() {
        return this.modifiedBy;
    }

    public LocalDateTime getLastModified() {
        return this.lastModified;
    }

    public String getOrderType() {
        return this.orderType;
    }

    public Map<DateType, Date> getOrderDates() {
        return this.orderDates;
    }

    public Set<String> getReferenceOrders() {
        return this.referenceOrders;
    }

    public Set<PartnerFunction> getPartnerFunctions() {
        return this.partnerFunctions;
    }

    public OrganizationResource getOrganization() {
        return this.organization;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public void setLastModified(LocalDateTime lastModified) {
        this.lastModified = lastModified;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public void setOrderDates(Map<DateType, Date> orderDates) {
        this.orderDates = orderDates;
    }

    public void setReferenceOrders(Set<String> referenceOrders) {
        this.referenceOrders = referenceOrders;
    }

    public void setPartnerFunctions(Set<PartnerFunction> partnerFunctions) {
        this.partnerFunctions = partnerFunctions;
    }

    public void setOrganization(OrganizationResource organization) {
        this.organization = organization;
    }

    public Set<BaseLineItemResource> getLineItems() {
        return lineItems;
    }

    public void setLineItems(Set<BaseLineItemResource> lineItems) {
        this.lineItems = lineItems;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof BaseOrderResource)) return false;
        final BaseOrderResource other = (BaseOrderResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$orderId = this.orderId;
        final Object other$orderId = other.orderId;
        if (this$orderId == null ? other$orderId != null : !this$orderId.equals(other$orderId)) return false;
        final Object this$created = this.created;
        final Object other$created = other.created;
        if (this$created == null ? other$created != null : !this$created.equals(other$created)) return false;
        final Object this$createdBy = this.createdBy;
        final Object other$createdBy = other.createdBy;
        if (this$createdBy == null ? other$createdBy != null : !this$createdBy.equals(other$createdBy)) return false;
        final Object this$modifiedBy = this.modifiedBy;
        final Object other$modifiedBy = other.modifiedBy;
        if (this$modifiedBy == null ? other$modifiedBy != null : !this$modifiedBy.equals(other$modifiedBy))
            return false;
        final Object this$lastModified = this.lastModified;
        final Object other$lastModified = other.lastModified;
        if (this$lastModified == null ? other$lastModified != null : !this$lastModified.equals(other$lastModified))
            return false;
        final Object this$orderType = this.orderType;
        final Object other$orderType = other.orderType;
        if (this$orderType == null ? other$orderType != null : !this$orderType.equals(other$orderType)) return false;
        final Object this$orderDates = this.orderDates;
        final Object other$orderDates = other.orderDates;
        if (this$orderDates == null ? other$orderDates != null : !this$orderDates.equals(other$orderDates))
            return false;
        final Object this$referenceOrders = this.referenceOrders;
        final Object other$referenceOrders = other.referenceOrders;
        if (this$referenceOrders == null ? other$referenceOrders != null : !this$referenceOrders.equals(other$referenceOrders))
            return false;
        final Object this$partnerFunctions = this.partnerFunctions;
        final Object other$partnerFunctions = other.partnerFunctions;
        if (this$partnerFunctions == null ? other$partnerFunctions != null : !this$partnerFunctions.equals(other$partnerFunctions))
            return false;
        final Object this$organization = this.organization;
        final Object other$organization = other.organization;
        if (this$organization == null ? other$organization != null : !this$organization.equals(other$organization))
            return false;
        final Object this$lineItems = this.lineItems;
        final Object other$lineItems = other.lineItems;
        if (this$lineItems == null ? other$lineItems != null : !this$lineItems.equals(other$lineItems)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $orderId = this.orderId;
        result = result * PRIME + ($orderId == null ? 0 : $orderId.hashCode());
        final Object $created = this.created;
        result = result * PRIME + ($created == null ? 0 : $created.hashCode());
        final Object $createdBy = this.createdBy;
        result = result * PRIME + ($createdBy == null ? 0 : $createdBy.hashCode());
        final Object $modifiedBy = this.modifiedBy;
        result = result * PRIME + ($modifiedBy == null ? 0 : $modifiedBy.hashCode());
        final Object $lastModified = this.lastModified;
        result = result * PRIME + ($lastModified == null ? 0 : $lastModified.hashCode());
        final Object $orderType = this.orderType;
        result = result * PRIME + ($orderType == null ? 0 : $orderType.hashCode());
        final Object $orderDates = this.orderDates;
        result = result * PRIME + ($orderDates == null ? 0 : $orderDates.hashCode());
        final Object $referenceOrders = this.referenceOrders;
        result = result * PRIME + ($referenceOrders == null ? 0 : $referenceOrders.hashCode());
        final Object $partnerFunctions = this.partnerFunctions;
        result = result * PRIME + ($partnerFunctions == null ? 0 : $partnerFunctions.hashCode());
        final Object $organization = this.organization;
        result = result * PRIME + ($organization == null ? 0 : $organization.hashCode());
        final Object $lineItems = this.lineItems;
        result = result * PRIME + ($lineItems == null ? 0 : $lineItems.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof BaseOrderResource;
    }
}