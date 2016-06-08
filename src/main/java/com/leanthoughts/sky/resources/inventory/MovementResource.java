package com.leanthoughts.sky.resources.inventory;

import com.leanthoughts.sky.resources.order.BaseLineItemResource;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

/**
 * @author fahad
 * @since 06-06-2016.
 */
@Data
@NoArgsConstructor
public class MovementResource {


    private OrderType orderType;
    private String orderId;
    private String orgUnitReference;
    private Set<BaseLineItemResource> lineItems;
    private MovementStatus movementStatus;


}
