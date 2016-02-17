package com.leanthoughts.sky.resources.order;

import com.leanthoughts.sky.resources.BaseResource;

public class PartnerFunction extends BaseResource{
    private PartnerResource partner;
    private OrderFunction orderFunction;

    public PartnerFunction() {
    }

    public PartnerResource getPartner() {
        return this.partner;
    }

    public OrderFunction getOrderFunction() {
        return this.orderFunction;
    }

    public void setPartner(PartnerResource partner) {
        this.partner = partner;
    }

    public void setOrderFunction(OrderFunction orderFunction) {
        this.orderFunction = orderFunction;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof PartnerFunction)) return false;
        final PartnerFunction other = (PartnerFunction) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$partner = this.partner;
        final Object other$partner = other.partner;
        if (this$partner == null ? other$partner != null : !this$partner.equals(other$partner)) return false;
        final Object this$orderFunction = this.orderFunction;
        final Object other$orderFunction = other.orderFunction;
        if (this$orderFunction == null ? other$orderFunction != null : !this$orderFunction.equals(other$orderFunction))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $partner = this.partner;
        result = result * PRIME + ($partner == null ? 0 : $partner.hashCode());
        final Object $orderFunction = this.orderFunction;
        result = result * PRIME + ($orderFunction == null ? 0 : $orderFunction.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof PartnerFunction;
    }
}
