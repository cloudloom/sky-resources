package com.leanthoughts.sky.resources.planning;

import com.leanthoughts.sky.resources.BaseResource;
import com.leanthoughts.sky.resources.product.ArticleResource;

/**
 * Created by fahad on 16-09-2016.
 */
public class GLPLineItemResource extends BaseResource{

    private PlanningCriteriaGroupResource planningGroup;
    private MealCategoryResource mealCategory;
    private String product;
    private Integer quantity;

    private ArticleResource productMeta;

    public GLPLineItemResource(){}

    public GLPLineItemResource(PlanningCriteriaGroupResource planningGroup, MealCategoryResource mealCategory, String product, Integer quantity, ArticleResource productMeta) {
        this.planningGroup = planningGroup;
        this.mealCategory = mealCategory;
        this.product = product;
        this.quantity = quantity;
        this.productMeta = productMeta;
    }

    public PlanningCriteriaGroupResource getPlanningGroup() {
        return planningGroup;
    }

    public void setPlanningGroup(PlanningCriteriaGroupResource planningGroup) {
        this.planningGroup = planningGroup;
    }

    public MealCategoryResource getMealCategory() {
        return mealCategory;
    }

    public void setMealCategory(MealCategoryResource mealCategory) {
        this.mealCategory = mealCategory;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public ArticleResource getProductMeta() {
        return productMeta;
    }

    public void setProductMeta(ArticleResource productMeta) {
        this.productMeta = productMeta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        GLPLineItemResource that = (GLPLineItemResource) o;

        if (planningGroup != null ? !planningGroup.equals(that.planningGroup) : that.planningGroup != null)
            return false;
        if (mealCategory != null ? !mealCategory.equals(that.mealCategory) : that.mealCategory != null) return false;
        if (product != null ? !product.equals(that.product) : that.product != null) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;
        return productMeta != null ? productMeta.equals(that.productMeta) : that.productMeta == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (planningGroup != null ? planningGroup.hashCode() : 0);
        result = 31 * result + (mealCategory != null ? mealCategory.hashCode() : 0);
        result = 31 * result + (product != null ? product.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + (productMeta != null ? productMeta.hashCode() : 0);
        return result;
    }
}
