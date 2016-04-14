package com.leanthoughts.sky.resources.pagination;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sadath on 01-Apr-2016.
 */
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PageableResource {
    private int page;
    private int size;
    private Map<String, String> sort = new HashMap<String, String>();

    public PageableResource() {
    }

    public PageableResource(Pageable pageable) {
        this.page = pageable.getPageNumber();
        this.size = pageable.getPageSize();
        if(pageable.getSort() != null) {
            pageable.getSort().forEach(order -> this.sort.put(order.getProperty(), order.getDirection().name()));
        }
    }

    public PageableResource(int page, int size, Sort sort) {
        this.page = page;
        this.size = size;
        if(sort != null) {
            sort.forEach(order -> this.sort.put(order.getProperty(), order.getDirection().name()));
        }
    }

    public PageRequest getPageRequest() {
        Sort sort = null;
        if(this.sort != null && this.sort.size() > 0) {
            final List<Sort.Order> orders = new ArrayList<Sort.Order>();
            this.sort.entrySet().stream().forEach(entry -> {
                Sort.Order order = new Sort.Order(Sort.Direction.valueOf(entry.getValue()), entry.getKey());
                orders.add(order);
            });
            if(orders.size() > 0) {
                sort = new Sort(orders);
            }
        }
        return new PageRequest(this.page, this.size, sort);
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Map<String, String> getSort() {
        return sort;
    }

    public void setSort(Map<String, String> sort) {
        this.sort = sort;
    }
}