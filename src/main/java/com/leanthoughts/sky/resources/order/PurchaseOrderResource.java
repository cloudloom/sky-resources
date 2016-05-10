package com.leanthoughts.sky.resources.order;

import lombok.Setter;

import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.Set;

/**
 * @author fahad
 * @since 10-05-2016.
 */
public class PurchaseOrderResource extends BaseOrderResource {

    private static final String type = "PurchaseOrder";
    private String orderingPartyReference;
    private String recepientPartyReference;
    private String contactPersonReference;
    private Set<CateringOrderResource> referenceOrder;
    private LocalDate deliveryDate;
    private String deliveryAddress;
    private PurchaseOrderStatusResource status;

    /** Customized Properties For App**/

}
