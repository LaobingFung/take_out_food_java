package main.java.fung.service;

import main.java.fung.model.Order;

public abstract class Promotion {
    private String type;

    public Promotion(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract double computeDiscount(Order order);
}
