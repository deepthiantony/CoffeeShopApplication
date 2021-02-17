package org.example.model;

import java.util.List;

public class SalesReport {
    int totalNoOfSales;
    double salesAmount;
    List<Item> itemList;

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public int getTotalNoOfSales() {
        return totalNoOfSales;
    }

    public void setTotalNoOfSales(int totalNoOfSales) {
        this.totalNoOfSales = totalNoOfSales;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }
}
