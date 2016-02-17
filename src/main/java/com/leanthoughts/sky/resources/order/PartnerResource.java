package com.leanthoughts.sky.resources.order;

import com.leanthoughts.sky.resources.BaseResource;

import java.util.Set;

public class PartnerResource extends BaseResource{
    private String partnerReference;
    private Set<OrderFunction> orderFunctions;

    public PartnerResource() {
    }

    public String getPartnerReference() {
        return this.partnerReference;
    }

    public Set<OrderFunction> getOrderFunctions() {
        return this.orderFunctions;
    }

    public void setPartnerReference(String partnerReference) {
        this.partnerReference = partnerReference;
    }

    public void setOrderFunctions(Set<OrderFunction> orderFunctions) {
        this.orderFunctions = orderFunctions;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof PartnerResource)) return false;
        final PartnerResource other = (PartnerResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$partnerReference = this.partnerReference;
        final Object other$partnerReference = other.partnerReference;
        if (this$partnerReference == null ? other$partnerReference != null : !this$partnerReference.equals(other$partnerReference))
            return false;
        final Object this$orderFunctions = this.orderFunctions;
        final Object other$orderFunctions = other.orderFunctions;
        if (this$orderFunctions == null ? other$orderFunctions != null : !this$orderFunctions.equals(other$orderFunctions))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $partnerReference = this.partnerReference;
        result = result * PRIME + ($partnerReference == null ? 0 : $partnerReference.hashCode());
        final Object $orderFunctions = this.orderFunctions;
        result = result * PRIME + ($orderFunctions == null ? 0 : $orderFunctions.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof PartnerResource;
    }
}