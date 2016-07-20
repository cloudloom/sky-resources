package com.leanthoughts.sky.resources.order;

import com.leanthoughts.sky.resources.flight.SearchCriteriaResource;
import com.leanthoughts.sky.resources.pagination.PageableResource;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fahad
 * @since 20-07-2016.
 */
public class UpliftSearchResource {
    private List<SearchCriteriaResource> searchCriteriaResources = new ArrayList<>(0);
    private PageableResource pageable;

    public UpliftSearchResource(List<SearchCriteriaResource> searchCriteriaResources, PageableResource pageable) {
        this.searchCriteriaResources = searchCriteriaResources;
        this.pageable = pageable;
    }

    public UpliftSearchResource(){}

    public List<SearchCriteriaResource> getSearchCriteriaResources() {
        return searchCriteriaResources;
    }

    public void setSearchCriteriaResources(List<SearchCriteriaResource> searchCriteriaResources) {
        this.searchCriteriaResources = searchCriteriaResources;
    }

    public PageableResource getPageable() {
        return pageable;
    }

    public void setPageable(PageableResource pageable) {
        this.pageable = pageable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UpliftSearchResource that = (UpliftSearchResource) o;

        if (searchCriteriaResources != null ? !searchCriteriaResources.equals(that.searchCriteriaResources) : that.searchCriteriaResources != null)
            return false;
        return pageable != null ? pageable.equals(that.pageable) : that.pageable == null;

    }

    @Override
    public int hashCode() {
        int result = searchCriteriaResources != null ? searchCriteriaResources.hashCode() : 0;
        result = 31 * result + (pageable != null ? pageable.hashCode() : 0);
        return result;
    }
}
