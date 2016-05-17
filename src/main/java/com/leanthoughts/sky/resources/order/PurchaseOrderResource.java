package com.leanthoughts.sky.resources.order;

import com.leanthoughts.sky.resources.product.ArticleResource;
import lombok.Setter;

import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author fahad
 * @since 10-05-2016.
 */
public class PurchaseOrderResource extends BaseOrderResource {

    private String purchaseOrderUid;
    private static final String type = "PurchaseOrder";
    private String orderingPartyReference;
    private String recepientPartyReference;
    private String contactPersonReference;
    private List<String> referenceOrder;
    private LocalDate deliveryDate;
    private String deliveryAddress;
    private PurchaseOrderStatusResource status;

    /** Customized Properties For App**/
    private String orderingParty;
    private String recepientParty;
    private String contactPerson;


}
