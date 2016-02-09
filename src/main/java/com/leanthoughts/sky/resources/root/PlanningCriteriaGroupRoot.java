package com.leanthoughts.sky.resources.root;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.leanthoughts.sky.resources.planning.PlanningCriteriaGroupResource;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sadath on 08-Jan-2016.
 */
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlanningCriteriaGroupRoot {
    private List<PlanningCriteriaGroupResource> planningCriteriaGroups = new ArrayList<PlanningCriteriaGroupResource>();

    public PlanningCriteriaGroupRoot() {
    }

    public List<PlanningCriteriaGroupResource> getPlanningCriteriaGroups() {
        return this.planningCriteriaGroups;
    }

    public void setPlanningCriteriaGroups(List<PlanningCriteriaGroupResource> planningCriteriaGroups) {
        this.planningCriteriaGroups = planningCriteriaGroups;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof PlanningCriteriaGroupRoot)) return false;
        final PlanningCriteriaGroupRoot other = (PlanningCriteriaGroupRoot) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$planningCriteriaGroups = this.planningCriteriaGroups;
        final Object other$planningCriteriaGroups = other.planningCriteriaGroups;
        if (this$planningCriteriaGroups == null ? other$planningCriteriaGroups != null : !this$planningCriteriaGroups.equals(other$planningCriteriaGroups))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $planningCriteriaGroups = this.planningCriteriaGroups;
        result = result * PRIME + ($planningCriteriaGroups == null ? 0 : $planningCriteriaGroups.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof PlanningCriteriaGroupRoot;
    }

    public String toString() {
        return "com.leanthoughts.sky.resources.root.PlanningCriteriaGroupRoot(planningCriteriaGroups=" + this.planningCriteriaGroups + ")";
    }
}