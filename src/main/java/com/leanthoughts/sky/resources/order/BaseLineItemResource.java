package com.leanthoughts.sky.resources.order;

import com.leanthoughts.sky.resources.BaseResource;
import org.javamoney.moneta.Money;

public class BaseLineItemResource extends BaseResource {
    private Integer sequenceNumber;
    private String productReference;
    private Money unitPrice;
    private int quantity;
    private String comment;
    private String orderReference;

    public BaseLineItemResource() {
    }

    public Integer getSequenceNumber() {
        return this.sequenceNumber;
    }

    public String getProductReference() {
        return this.productReference;
    }

    public Money getUnitPrice() {
        return this.unitPrice;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String getComment() {
        return this.comment;
    }

    public String getOrderReference() {
        return this.orderReference;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public void setProductReference(String productReference) {
        this.productReference = productReference;
    }

    public void setUnitPrice(Money unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setOrderReference(String orderReference) {
        this.orderReference = orderReference;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof BaseLineItemResource)) return false;
        final BaseLineItemResource other = (BaseLineItemResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$sequenceNumber = this.sequenceNumber;
        final Object other$sequenceNumber = other.sequenceNumber;
        if (this$sequenceNumber == null ? other$sequenceNumber != null : !this$sequenceNumber.equals(other$sequenceNumber))
            return false;
        final Object this$productReference = this.productReference;
        final Object other$productReference = other.productReference;
        if (this$productReference == null ? other$productReference != null : !this$productReference.equals(other$productReference))
            return false;
        final Object this$unitPrice = this.unitPrice;
        final Object other$unitPrice = other.unitPrice;
        if (this$unitPrice == null ? other$unitPrice != null : !this$unitPrice.equals(other$unitPrice)) return false;
        if (this.quantity != other.quantity) return false;
        final Object this$comment = this.comment;
        final Object other$comment = other.comment;
        if (this$comment == null ? other$comment != null : !this$comment.equals(other$comment)) return false;
        final Object this$orderReference = this.orderReference;
        final Object other$orderReference = other.orderReference;
        if (this$orderReference == null ? other$orderReference != null : !this$orderReference.equals(other$orderReference))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $sequenceNumber = this.sequenceNumber;
        result = result * PRIME + ($sequenceNumber == null ? 0 : $sequenceNumber.hashCode());
        final Object $productReference = this.productReference;
        result = result * PRIME + ($productReference == null ? 0 : $productReference.hashCode());
        final Object $unitPrice = this.unitPrice;
        result = result * PRIME + ($unitPrice == null ? 0 : $unitPrice.hashCode());
        result = result * PRIME + this.quantity;
        final Object $comment = this.comment;
        result = result * PRIME + ($comment == null ? 0 : $comment.hashCode());
        final Object $orderReference = this.orderReference;
        result = result * PRIME + ($orderReference == null ? 0 : $orderReference.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof BaseLineItemResource;
    }
}