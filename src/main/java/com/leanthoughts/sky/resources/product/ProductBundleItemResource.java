package com.leanthoughts.sky.resources.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author fahad
 * @since 29-07-2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductBundleItemResource {

    private Boolean mainProduct;
    private Integer quantity;
    private String unitOfMeasure;
    private ArticleResource product;
    private ArticleResource bundleItem;
    private String materialNumber;

    public ProductBundleItemResource (){}

    public ProductBundleItemResource(Boolean mainProduct, Integer quantity, String unitOfMeasure, ArticleResource product, ArticleResource bundleItem) {
        this.mainProduct = mainProduct;
        this.quantity = quantity;
        this.unitOfMeasure = unitOfMeasure;
        this.product = product;
        this.bundleItem = bundleItem;
    }

    public Boolean getMainProduct() {
        return mainProduct;
    }

    public void setMainProduct(Boolean mainProduct) {
        this.mainProduct = mainProduct;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public ArticleResource getProduct() {
        return product;
    }

    public void setProduct(ArticleResource product) {
        this.product = product;
    }

    public ArticleResource getBundleItem() {
        return bundleItem;
    }

    public void setBundleItem(ArticleResource bundleItem) {
        this.bundleItem = bundleItem;
    }

    public String getMaterialNumber() {
        return materialNumber;
    }

    public void setMaterialNumber(String materialNumber) {
        this.materialNumber = materialNumber;
    }
}
