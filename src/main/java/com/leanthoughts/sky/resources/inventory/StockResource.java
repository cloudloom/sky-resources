package com.leanthoughts.sky.resources.inventory;

import com.leanthoughts.sky.resources.partner.EmployeeResource;
import com.leanthoughts.sky.resources.planning.StationResource;
import com.leanthoughts.sky.resources.product.ArticleResource;

import java.time.LocalDateTime;

/**
 * Created by fahad on 22-08-2016.
 */
public class StockResource {

    private String productReference;
    private String orgUnitReference;
    private Long quantity;
    private String modifiedBy;
    private LocalDateTime lastModified;
    private ArticleResource product;
    private StationResource orgUnit;
    private EmployeeResource emplyee;

    public StockResource(){}

    public StockResource(String productReference, String orgUnitReference, Long quantity, String modifiedBy, LocalDateTime lastModified, ArticleResource product, StationResource orgUnit, EmployeeResource emplyee) {
        this.productReference = productReference;
        this.orgUnitReference = orgUnitReference;
        this.quantity = quantity;
        this.modifiedBy = modifiedBy;
        this.lastModified = lastModified;
        this.product = product;
        this.orgUnit = orgUnit;
        this.emplyee = emplyee;
    }

    public String getProductReference() {
        return productReference;
    }

    public void setProductReference(String productReference) {
        this.productReference = productReference;
    }

    public String getOrgUnitReference() {
        return orgUnitReference;
    }

    public void setOrgUnitReference(String orgUnitReference) {
        this.orgUnitReference = orgUnitReference;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public LocalDateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(LocalDateTime lastModified) {
        this.lastModified = lastModified;
    }

    public ArticleResource getProduct() {
        return product;
    }

    public void setProduct(ArticleResource product) {
        this.product = product;
    }

    public StationResource getOrgUnit() {
        return orgUnit;
    }

    public void setOrgUnit(StationResource orgUnit) {
        this.orgUnit = orgUnit;
    }

    public EmployeeResource getEmplyee() {
        return emplyee;
    }

    public void setEmplyee(EmployeeResource emplyee) {
        this.emplyee = emplyee;
    }
}
