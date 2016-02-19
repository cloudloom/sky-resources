package com.leanthoughts.sky.resources.partner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sadath on 03-Jul-2015.
 */
@com.fasterxml.jackson.databind.annotation.JsonSerialize(include = com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_NULL)
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class DefaultEmployeeStructure {
    private HashMap<String, List<Map<String, String>>> organizationUnitPositions;

    public HashMap<String, List<Map<String, String>>> getOrganizationUnitPositions() {
        return organizationUnitPositions;
    }

    public void setOrganizationUnitPositions(HashMap<String, List<Map<String, String>>> organizationUnitPositions) {
        this.organizationUnitPositions = organizationUnitPositions;
    }
}