package org.example.service.impl;

import org.example.enums.ItemType;
import org.example.exception.BillException;
import org.example.exception.OrderException;
import org.example.model.Bill;
import org.example.model.Item;
import org.example.model.Order;
import org.example.model.SalesReport;
import org.example.repository.OrderRepository;
import org.example.repository.impl.OrderRepositoryImpl;
import org.example.service.OrderService;

import java.util.*;
import java.util.stream.Collectors;

public class OrderServiceImpl implements OrderService {
    OrderRepository orderRepository = new OrderRepositoryImpl();

    public List<Order> placeOrder(Order order) throws OrderException {
        if (order == null) {
            throw new OrderException("Order cannot be null");
        }
        if (order.getItems() == null) {
            throw new OrderException("List of orders cannot be null");
        }
        if (order.getItems().size() == 0) {
            throw new OrderException("List of orders cannot be empty");
        }
        return orderRepository.saveOrder(order);
    }

    @Override
    public Bill generateBill(final int tableNumber) throws BillException {
        Map<ItemType, Item> itemTypeMap=new HashMap<>();
        List<Order> orderLists = orderRepository.getInstance().getOrderList();
        List<Item> items=orderLists.stream().filter(orders -> orders.getTableNumber() == tableNumber).flatMap(order ->order.getItems().stream()).collect(Collectors.toList());
        // add each item in list to map by grouping same item
        //if item is not already present add to map
        //if item is present add item after performing operation
        items.forEach(i->{
            itemTypeMap.computeIfAbsent(i.getItem(),k->i);
            itemTypeMap.computeIfPresent(i.getItem(),(k,v)->{
                i.setCount(i.getCount()+v.getCount());
                return i;

            });
        });


       Bill bill=new Bill();
       bill.setItems(itemTypeMap.values().stream().collect(Collectors.toList()));
       bill.setTableNumber(tableNumber);
       double totalBill = bill.getItems().stream().map(e->e.getPrice()).reduce(0.0,(subtotal,element)->subtotal+element);
       bill.setTotalBill(totalBill);
       bill.setBillDate(new Date());
       orderRepository.getInstance().getBillList().add(bill);
       return bill;
    }

    @Override
    public SalesReport generateSalesReport() throws BillException {
        List<Bill> billList=orderRepository.getInstance().getBillList();
        SalesReport salesReport=new SalesReport();
        salesReport.setTotalNoOfSales(billList.size());
        salesReport.setSalesAmount(billList.stream().map(e->e.getTotalBill()).reduce(0.0,(subtotal,element)->subtotal+element));
        return salesReport;
    }


}
