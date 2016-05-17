package com.leanthoughts.sky.resources.order;

/**
 * @author fahad
 * @since 12-05-2016.
 */
public class FollowUpOrderResponse {

    private String orderType;
    private String planningGroup;
    private String uid;

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getPlanningGroup() {
        return planningGroup;
    }

    public void setPlanningGroup(String planningGroup) {
        this.planningGroup = planningGroup;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
