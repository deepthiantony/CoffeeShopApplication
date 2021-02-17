package org.example.repository;

import org.example.model.Order;
import org.example.repository.impl.OrderRepositoryImpl;

import java.util.List;

public interface OrderRepository {
    public List<Order> saveOrder(Order order);
    public OrderRepositoryImpl getInstance();
}
