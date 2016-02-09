package com.leanthoughts.sky.resources.root;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.leanthoughts.sky.resources.planning.MealCategoryResource;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sadath on 08-Jan-2016.
 */
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MealCategoryRoot {
    private List<MealCategoryResource> mealCategories = new ArrayList<MealCategoryResource>();

    public MealCategoryRoot() {
    }

    public List<MealCategoryResource> getMealCategories() {
        return this.mealCategories;
    }

    public void setMealCategories(List<MealCategoryResource> mealCategories) {
        this.mealCategories = mealCategories;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof MealCategoryRoot)) return false;
        final MealCategoryRoot other = (MealCategoryRoot) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$mealCategories = this.mealCategories;
        final Object other$mealCategories = other.mealCategories;
        if (this$mealCategories == null ? other$mealCategories != null : !this$mealCategories.equals(other$mealCategories))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $mealCategories = this.mealCategories;
        result = result * PRIME + ($mealCategories == null ? 0 : $mealCategories.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof MealCategoryRoot;
    }

    public String toString() {
        return "com.leanthoughts.sky.resources.root.MealCategoryRoot(mealCategories=" + this.mealCategories + ")";
    }
}
