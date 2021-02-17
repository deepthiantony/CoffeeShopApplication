package org.example.service;

import org.example.exception.OrderServiceException;
import org.example.model.Bill;
import org.example.model.Order;
import org.example.model.SalesReport;

public interface OrderService {
    Bill placeOrder(Order order) throws OrderServiceException;

    Bill finalizeBill(int tableNumber) throws OrderServiceException;

    SalesReport generateSalesReport();
}
