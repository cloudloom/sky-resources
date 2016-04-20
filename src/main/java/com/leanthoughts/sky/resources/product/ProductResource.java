package com.leanthoughts.sky.resources.product;

import com.leanthoughts.sky.resources.BaseResource;
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