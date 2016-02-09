package com.leanthoughts.sky.resources.organization;

import javax.validation.Valid;
import java.util.HashSet;

/**
 * Created by sadath on 24-Aug-2015.
 */
public class DefaultDepartmentResources {
    @Valid
    private HashSet<DefaultDepartmentResource> departments = new HashSet<>();

    public HashSet<DefaultDepartmentResource> getDepartments() {
        return departments;
    }

    public void setDepartments(HashSet<DefaultDepartmentResource> departments) {
        this.departments = departments;
    }
}