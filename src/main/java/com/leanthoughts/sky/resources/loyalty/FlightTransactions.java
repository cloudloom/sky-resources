package com.leanthoughts.sky.resources.loyalty;

import com.leanthoughts.sky.resources.order.FlightSectorResource;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fahadfazil on 10/02/17.
 */
public class FlightTransactions {
    private List<Transaction> transactions = new ArrayList<>(0);
    private FlightSectorResource flight;


    public FlightTransactions() {
    }

    public FlightTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public FlightTransactions(List<Transaction> transactions, FlightSectorResource flight) {
        this.transactions = transactions;
        this.flight = flight;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public FlightSectorResource getFlight() {
        return flight;
    }

    public void setFlight(FlightSectorResource flight) {
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "FlightTransactions{" +
                "transactions=" + transactions +
                ", flight=" + flight +
                '}';
    }
}
