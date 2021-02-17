package org.example.model;

import java.util.List;

public class SalesReport {
    private int totalSales;
    private double totalSalesAmount;
    private List<OrderItem> totalItemisedSales;

    public int getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }

    public double getTotalSalesAmount() {
        return totalSalesAmount;
    }

    public void setTotalSalesAmount(double totalSalesAmount) {
        this.totalSalesAmount = totalSalesAmount;
    }

    public List<OrderItem> getTotalItemisedSales() {
        return totalItemisedSales;
    }

    public void setTotalItemisedSales(List<OrderItem> totalItemisedSales) {
        this.totalItemisedSales = totalItemisedSales;
    }
}
