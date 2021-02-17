package org.example.service;

import org.example.exception.BillException;
import org.example.exception.OrderException;
import org.example.model.Bill;
import org.example.model.Order;
import org.example.model.SalesReport;

import java.util.List;

public interface OrderService {
    public List<Order> placeOrder(Order order) throws OrderException;
    Bill generateBill(int tableNumber) throws BillException;
    SalesReport generateSalesReport() throws BillException;
}
