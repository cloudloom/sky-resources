package com.leanthoughts.sky.resources.order;

import com.leanthoughts.sky.resources.BaseResource;
import com.leanthoughts.sky.resources.product.ProductResource;
import org.javamoney.moneta.Money;

import java.util.HashMap;
import java.util.Map;

public class BaseLineItemResource extends BaseResource {
    private String id;
    private Integer sequenceNumber;
    private String productReference;
    private Money unitPrice;
    private int quantity;
    private String comment;
    private String orderReference;
    private Map<String, ProductResource> productMetaData = new HashMap<String, ProductResource>();

    public BaseLineItemResource() {
    }

    public String getId() {
        return this.id;
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

    public Map<String, ProductResource> getProductMetaData() {
        return this.productMetaData;
    }

    public void setId(String id) {
        this.id = id;
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

    public void setProductMetaData(Map<String, ProductResource> productMetaData) {
        this.productMetaData = productMetaData;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof BaseLineItemResource)) return false;
        final BaseLineItemResource other = (BaseLineItemResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.id;
        final Object other$id = other.id;
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
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
        final Object this$productMetaData = this.productMetaData;
        final Object other$productMetaData = other.productMetaData;
        if (this$productMetaData == null ? other$productMetaData != null : !this$productMetaData.equals(other$productMetaData))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.id;
        result = result * PRIME + ($id == null ? 0 : $id.hashCode());
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
        final Object $productMetaData = this.productMetaData;
        result = result * PRIME + ($productMetaData == null ? 0 : $productMetaData.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof BaseLineItemResource;
    }

    public String toString() {
        return "com.leanthoughts.sky.resources.order.BaseLineItemResource(id=" + this.id + ", sequenceNumber=" + this.sequenceNumber + ", productReference=" + this.productReference + ", unitPrice=" + this.unitPrice + ", quantity=" + this.quantity + ", comment=" + this.comment + ", orderReference=" + this.orderReference + ", productMetaData=" + this.productMetaData + ")";
    }
}