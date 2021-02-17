package org.example.service.impl;

import org.example.exception.OrderServiceException;
import org.example.model.Bill;
import org.example.model.Order;
import org.example.model.SalesReport;
import org.example.service.OrderService;

public class OrderServiceImpl implements OrderService {


    @Override
    public Bill placeOrder(Order order) throws OrderServiceException {
        return null;
    }

    @Override
    public Bill finalizeBill(int tableNumber) throws OrderServiceException {
        return null;
    }

    @Override
    public SalesReport generateSalesReport() {
        return null;
    }
}
