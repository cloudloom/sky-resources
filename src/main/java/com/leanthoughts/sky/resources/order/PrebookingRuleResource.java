package com.leanthoughts.sky.resources.order;

import com.leanthoughts.sky.resources.dictionary.jpa.impl.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by fahadfazil on 27/10/16.
 */

public class PrebookingRuleResource extends BaseEntity {

    private String prebookingCode;

    private Set<PrebookingRuleLineItemResource> lineItems = new HashSet<>(0);

    public String getPrebookingRuleUid(){
        return this.getUid();
    }

    public String getPrebookingCode() {
        return prebookingCode;
    }

    public void setPrebookingCode(String prebookingCode) {
        this.prebookingCode = prebookingCode;
    }

    public Set<PrebookingRuleLineItemResource> getLineItems() {
        return lineItems;
    }

    public void setLineItems(Set<PrebookingRuleLineItemResource> lineItems) {
        this.lineItems = lineItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrebookingRuleResource that = (PrebookingRuleResource) o;

        return prebookingCode.equals(that.prebookingCode);

    }

    @Override
    public int hashCode() {
        return prebookingCode.hashCode();
    }
}
