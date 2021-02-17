package org.example.repository.impl;

import org.example.model.Bill;
import org.example.model.Order;
import org.example.repository.OrderRepository;

import java.util.ArrayList;
import java.util.List;

public class OrderRepositoryImpl implements OrderRepository {
    List<Order> orderList = new ArrayList<>();
    List<Bill> billList=new ArrayList<>();

    public List<Bill> getBillList() {
        return billList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    @Override
    public List<Order> saveOrder(Order order) {
        Order order1 = new Order();
        order1.setTableNumber(order.getTableNumber());
        order1.setItems(order.getItems());
        orderList.add(order1);
        return orderList;
    }

    @Override
    public OrderRepositoryImpl getInstance(){
        return new OrderRepositoryImpl();
    }

}
