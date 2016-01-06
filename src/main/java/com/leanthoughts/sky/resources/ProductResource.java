package com.leanthoughts.sky.resources;

import lombok.Data;

/**
 * Created by sadath on 01-Jan-2016.
 */
@Data
public abstract class ProductResource extends BaseResource {
    private String name;
    private String description;
    private SellerResource seller;
}