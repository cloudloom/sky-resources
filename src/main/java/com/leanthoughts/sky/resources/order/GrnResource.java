package com.leanthoughts.sky.resources.order;

/**
 * @author fahad
 * @since 04-07-2016.
 */
public class GrnResource extends BaseOrderResource {

    //Reference for the Recipient Party
    private String recipientPartyReference;

    //Reference for the Recipient Party
    private String deliveringPartyReference;

    //GRN Issuing Location
    private String issuingLocation;

    //Goods delivered plant
    private String goodsDeliveredPlant;

    //GRN reference if it is connected to any other GRN ( required for partial delivery of items)
    private String grnReference;

    //GRN Status
    private GrnStatusResource status;

    public GrnResource(String recipientPartyReference, String deliveringPartyReference, String issuingLocation, String goodsDeliveredPlant, String grnReference, GrnStatusResource status) {
        this.recipientPartyReference = recipientPartyReference;
        this.deliveringPartyReference = deliveringPartyReference;
        this.issuingLocation = issuingLocation;
        this.goodsDeliveredPlant = goodsDeliveredPlant;
        this.grnReference = grnReference;
        this.status = status;
    }

    public GrnResource(){}

    public String getRecipientPartyReference() {
        return recipientPartyReference;
    }

    public void setRecipientPartyReference(String recipientPartyReference) {
        this.recipientPartyReference = recipientPartyReference;
    }

    public String getDeliveringPartyReference() {
        return deliveringPartyReference;
    }

    public void setDeliveringPartyReference(String deliveringPartyReference) {
        this.deliveringPartyReference = deliveringPartyReference;
    }

    public String getIssuingLocation() {
        return issuingLocation;
    }

    public void setIssuingLocation(String issuingLocation) {
        this.issuingLocation = issuingLocation;
    }

    public String getGoodsDeliveredPlant() {
        return goodsDeliveredPlant;
    }

    public void setGoodsDeliveredPlant(String goodsDeliveredPlant) {
        this.goodsDeliveredPlant = goodsDeliveredPlant;
    }

    public String getGrnReference() {
        return grnReference;
    }

    public void setGrnReference(String grnReference) {
        this.grnReference = grnReference;
    }

    public GrnStatusResource getStatus() {
        return status;
    }

    public void setStatus(GrnStatusResource status) {
        this.status = status;
    }
}
