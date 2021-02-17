package org.example.model;

public enum ItemType {
    TEA, PASTRY, CUP_CAKE;

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
