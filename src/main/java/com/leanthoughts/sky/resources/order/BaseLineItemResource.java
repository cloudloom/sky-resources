package com.leanthoughts.sky.resources.order;

import com.leanthoughts.sky.resources.BaseResource;
import com.leanthoughts.sky.resources.planning.MealCategoryResource;
import com.leanthoughts.sky.resources.product.ProductResource;
import org.javamoney.moneta.Money;

import java.util.HashMap;
import java.util.Map;

public class BaseLineItemResource extends BaseResource {
    private String id;
    private Integer sequenceNumber;
    private String productReference;
    private String categoryReference;
    private MealCategoryResource category;
    private String groupReference;
    private Money unitPrice;
    private int quantity;
    private String comment;
    private String orderReference;
    private Map<String, ProductResource> productMetaData = new HashMap<String, ProductResource>();

    public BaseLineItemResource() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getSequenceNumber() {
        return this.sequenceNumber;
    }

    public String getProductReference() {
        return this.productReference;
    }

    public String getCategoryReference() {
        return this.categoryReference;
    }

    public String getGroupReference() {
        return this.groupReference;
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

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public void setProductReference(String productReference) {
        this.productReference = productReference;
    }

    public void setCategoryReference(String categoryReference) {
        this.categoryReference = categoryReference;
    }

    public void setGroupReference(String groupReference) {
        this.groupReference = groupReference;
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

    public MealCategoryResource getCategory() {
        return category;
    }

    public void setCategory(MealCategoryResource category) {
        this.category = category;
    }

    public String toString() {
        return "com.leanthoughts.sky.resources.order.BaseLineItemResource(sequenceNumber=" + this.sequenceNumber + ", productReference=" + this.productReference + ", categoryReference=" + this.categoryReference + ", groupReference=" + this.groupReference + ", unitPrice=" + this.unitPrice + ", quantity=" + this.quantity + ", comment=" + this.comment + ", orderReference=" + this.orderReference + ", productMetaData=" + this.productMetaData + ")";
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof BaseLineItemResource)) return false;
        final BaseLineItemResource other = (BaseLineItemResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$sequenceNumber = this.getSequenceNumber();
        final Object other$sequenceNumber = other.getSequenceNumber();
        if (this$sequenceNumber == null ? other$sequenceNumber != null : !this$sequenceNumber.equals(other$sequenceNumber))
            return false;
        final Object this$productReference = this.getProductReference();
        final Object other$productReference = other.getProductReference();
        if (this$productReference == null ? other$productReference != null : !this$productReference.equals(other$productReference))
            return false;
        final Object this$categoryReference = this.getCategoryReference();
        final Object other$categoryReference = other.getCategoryReference();
        if (this$categoryReference == null ? other$categoryReference != null : !this$categoryReference.equals(other$categoryReference))
            return false;
        final Object this$groupReference = this.getGroupReference();
        final Object other$groupReference = other.getGroupReference();
        if (this$groupReference == null ? other$groupReference != null : !this$groupReference.equals(other$groupReference))
            return false;
        final Object this$unitPrice = this.getUnitPrice();
        final Object other$unitPrice = other.getUnitPrice();
        if (this$unitPrice == null ? other$unitPrice != null : !this$unitPrice.equals(other$unitPrice)) return false;
        if (this.getQuantity() != other.getQuantity()) return false;
        final Object this$comment = this.getComment();
        final Object other$comment = other.getComment();
        if (this$comment == null ? other$comment != null : !this$comment.equals(other$comment)) return false;
        final Object this$orderReference = this.getOrderReference();
        final Object other$orderReference = other.getOrderReference();
        if (this$orderReference == null ? other$orderReference != null : !this$orderReference.equals(other$orderReference))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $sequenceNumber = this.getSequenceNumber();
        result = result * PRIME + ($sequenceNumber == null ? 0 : $sequenceNumber.hashCode());
        final Object $productReference = this.getProductReference();
        result = result * PRIME + ($productReference == null ? 0 : $productReference.hashCode());
        final Object $categoryReference = this.getCategoryReference();
        result = result * PRIME + ($categoryReference == null ? 0 : $categoryReference.hashCode());
        final Object $groupReference = this.getGroupReference();
        result = result * PRIME + ($groupReference == null ? 0 : $groupReference.hashCode());
        final Object $unitPrice = this.getUnitPrice();
        result = result * PRIME + ($unitPrice == null ? 0 : $unitPrice.hashCode());
        result = result * PRIME + this.getQuantity();
        final Object $comment = this.getComment();
        result = result * PRIME + ($comment == null ? 0 : $comment.hashCode());
        final Object $orderReference = this.getOrderReference();
        result = result * PRIME + ($orderReference == null ? 0 : $orderReference.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof BaseLineItemResource;
    }
}