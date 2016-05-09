package com.leanthoughts.sky.resources.flight;

import com.leanthoughts.sky.resources.pagination.PageableResource;

import java.util.List;

/**
 * @author fahad
 * @since 09-05-2016.
 */
public class SearchCriteriaResourceWrapper {


    private List<SearchCriteriaResource> searchCriteriaResources;
    private PageableResource pageableResource;

    public List<SearchCriteriaResource> getSearchCriteriaResources() {
        return searchCriteriaResources;
    }

    public void setSearchCriteriaResources(List<SearchCriteriaResource> searchCriteriaResources) {
        this.searchCriteriaResources = searchCriteriaResources;
    }

    public PageableResource getPageableResource() {
        return pageableResource;
    }

    public void setPageableResource(PageableResource pageableResource) {
        this.pageableResource = pageableResource;
    }
}
