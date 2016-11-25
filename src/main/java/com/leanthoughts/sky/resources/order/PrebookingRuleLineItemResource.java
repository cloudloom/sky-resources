package com.leanthoughts.sky.resources.order;

import com.leanthoughts.sky.resources.dictionary.jpa.impl.BaseEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalTime;

/**
 * Created by fahadfazil on 27/10/16.
 */

public class PrebookingRuleLineItemResource extends BaseEntity {

    private LocalTime from;
    private LocalTime to;
    private String toMealCategory;

    public LocalTime getFrom() {
        return from;
    }

    public void setFrom(LocalTime from) {
        this.from = from;
    }

    public LocalTime getTo() {
        return to;
    }

    public void setTo(LocalTime to) {
        this.to = to;
    }

    public String getToMealCategory() {
        return toMealCategory;
    }

    public void setToMealCategory(String toMealCategory) {
        this.toMealCategory = toMealCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrebookingRuleLineItemResource that = (PrebookingRuleLineItemResource) o;

        if (!from.equals(that.from)) return false;
        if (!to.equals(that.to)) return false;
        return toMealCategory.equals(that.toMealCategory);

    }

    @Override
    public int hashCode() {
        int result = from.hashCode();
        result = 31 * result + to.hashCode();
        result = 31 * result + toMealCategory.hashCode();
        return result;
    }
}