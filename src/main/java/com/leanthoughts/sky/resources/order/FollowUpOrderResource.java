package com.leanthoughts.sky.resources.order;

import com.leanthoughts.sky.resources.planning.PlanningCriteriaGroupResource;

import java.util.List;

/**
 * @author fahad
 * @since 10-05-2016.
 */
public class FollowUpOrderResource {

    List<String> flights;
    List<PlanningCriteriaGroupResource> planningCriteriaGroups;

    public List<String> getFlights() {
        return flights;
    }

    public void setFlights(List<String> flights) {
        this.flights = flights;
    }

    public List<PlanningCriteriaGroupResource> getPlanningCriteriaGroups() {
        return planningCriteriaGroups;
    }

    public void setPlanningCriteriaGroups(List<PlanningCriteriaGroupResource> planningCriteriaGroups) {
        this.planningCriteriaGroups = planningCriteriaGroups;
    }
}
