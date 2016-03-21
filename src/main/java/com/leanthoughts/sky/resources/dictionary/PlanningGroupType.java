package com.leanthoughts.sky.resources.dictionary;

/**
 * Created by sadath on 21-Mar-2016.
 */
public enum PlanningGroupType {
    INDEPENDENT("Independent", "INDEPENDENT"),
    UNION("Union", "UNION");

    private final String planningGroupType;
    private final String abbreviation;

    PlanningGroupType(String planningGroupType, String abbreviation) {
        this.planningGroupType = planningGroupType;
        this.abbreviation = abbreviation;
    }

    public String getPlanningGroupType() {
        return planningGroupType;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public static PlanningGroupType fromValue(final String jsonNode) {
        for (PlanningGroupType type : PlanningGroupType.values()) {
            if (type.planningGroupType.equals(jsonNode)) {
                return type;
            }
        }
        return null;
    }
}