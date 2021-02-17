package org.example.model;

import java.util.Date;
import java.util.List;

public class Bill {
    private Date billDate;
    private int tableNumber;
    private List<OrderItem> finalizedOrders;
    private double totalBillAmount;

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public List<OrderItem> getFinalizedOrders() {
        return finalizedOrders;
    }

    public void setFinalizedOrders(List<OrderItem> finalizedOrders) {
        this.finalizedOrders = finalizedOrders;
    }

    public double getTotalBillAmount() {
        return totalBillAmount;
    }

    public void setTotalBillAmount(double totalBillAmount) {
        this.totalBillAmount = totalBillAmount;
    }
}
