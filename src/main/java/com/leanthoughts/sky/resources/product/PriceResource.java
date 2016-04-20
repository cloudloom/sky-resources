package com.leanthoughts.sky.resources.product;

import com.leanthoughts.sky.resources.BaseResource;

/**
 * Created by sadath on 01-Jan-2016.
 */
public class PriceResource extends BaseResource {
    private PriceType priceType;
    private CurrencyResource currency;
    private Double amount;

    public PriceResource() {
    }

    public PriceType getPriceType() {
        return this.priceType;
    }

    public CurrencyResource getCurrency() {
        return this.currency;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setPriceType(PriceType priceType) {
        this.priceType = priceType;
    }

    public void setCurrency(CurrencyResource currency) {
        this.currency = currency;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof PriceResource)) return false;
        final PriceResource other = (PriceResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$priceType = this.priceType;
        final Object other$priceType = other.priceType;
        if (this$priceType == null ? other$priceType != null : !this$priceType.equals(other$priceType)) return false;
        final Object this$currency = this.currency;
        final Object other$currency = other.currency;
        if (this$currency == null ? other$currency != null : !this$currency.equals(other$currency)) return false;
        final Object this$amount = this.amount;
        final Object other$amount = other.amount;
        if (this$amount == null ? other$amount != null : !this$amount.equals(other$amount)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $priceType = this.priceType;
        result = result * PRIME + ($priceType == null ? 0 : $priceType.hashCode());
        final Object $currency = this.currency;
        result = result * PRIME + ($currency == null ? 0 : $currency.hashCode());
        final Object $amount = this.amount;
        result = result * PRIME + ($amount == null ? 0 : $amount.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof PriceResource;
    }
}