package com.leanthoughts.sky.resources.partner;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by sadath on 02-Jul-2015.
 */
public class DefaultPositionRestructureEmployeeResource {
    private ArrayList<HashMap<String, HashMap<String, ArrayList<DefaultPartnerPositionAndOrganizationUnitResource>>>> positionStructure;

    public ArrayList<HashMap<String, HashMap<String, ArrayList<DefaultPartnerPositionAndOrganizationUnitResource>>>> getPositionStructure() {
        return positionStructure;
    }

    public void setPositionStructure(ArrayList<HashMap<String, HashMap<String, ArrayList<DefaultPartnerPositionAndOrganizationUnitResource>>>> positionStructure) {
        this.positionStructure = positionStructure;
    }
}