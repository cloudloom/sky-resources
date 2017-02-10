package com.leanthoughts.sky.resources.loyalty;

/**
 * Created by fahadfazil on 10/02/17.
 */
public class Transaction {

    private String loyaltyId;
    private Integer pointsRedeemed;
    private String reference;
    private String txnDate;

    public Transaction() {
    }

    public Transaction(String loyaltyId, Integer pointsRedeemed) {
        this.loyaltyId = loyaltyId;
        this.pointsRedeemed = pointsRedeemed;
    }

    public Transaction(String loyaltyId, Integer pointsRedeemed, String reference, String txnDate) {
        this.loyaltyId = loyaltyId;
        this.pointsRedeemed = pointsRedeemed;
        this.reference = reference;
        this.txnDate = txnDate;
    }

    public String getLoyaltyId() {
        return loyaltyId;
    }

    public void setLoyaltyId(String loyaltyId) {
        this.loyaltyId = loyaltyId;
    }

    public Integer getPointsRedeemed() {
        return pointsRedeemed;
    }

    public void setPointsRedeemed(Integer pointsRedeemed) {
        this.pointsRedeemed = pointsRedeemed;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getTxnDate() {
        return txnDate;
    }

    public void setTxnDate(String txnDate) {
        this.txnDate = txnDate;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "loyaltyId='" + loyaltyId + '\'' +
                ", pointsRedeemed=" + pointsRedeemed +
                ", reference='" + reference + '\'' +
                ", txnDate='" + txnDate + '\'' +
                '}';
    }
}
