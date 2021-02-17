package org.example.service.impl;

import org.example.enums.ItemType;
import org.example.exception.OrderException;
import org.example.model.Item;
import org.example.model.Order;
import org.example.service.OrderService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class OrderServiceImplTest {
    OrderService orderService = new OrderServiceImpl();

    @Before
    public void init() {

    }

    public Item createItem(int count, ItemType itemType) {
        Item item = new Item();
        item.setCount(count);
        item.setItem(itemType);
        item.getPrice();
        return item;
    }

    @Test
    public void testPlaceOrder_withOneItemMoreThanOneCount() throws OrderException {
        List<Item> items = new ArrayList<>();
        Item item1 = createItem(2, ItemType.CHOCOLATE_PASTRY);
        items.add(item1);
        Order order = new Order();
        order.setItems(items);
        order.setTableNumber(1);
        Assert.assertEquals(1, orderService.placeOrder(order).size());
    }

    @Test(expected = OrderException.class)
    public void testPlaceOrder_withNullOrder() throws OrderException {
        orderService.placeOrder(null);
    }

    /**
     * Adding more than one item to the order
     */
    @Test
    public void testPlaceOrder_withMoreThanOneItem() throws OrderException {
        List<Item> items = new ArrayList<>();
        Item item1 = createItem(2, ItemType.CHOCOLATE_PASTRY);
        items.add(item1);
        Item item2 = createItem(3, ItemType.COFFEE);
        items.add(item2);
        Order order = new Order();
        order.setItems(items);
        order.setTableNumber(1);
        Assert.assertEquals(1, orderService.placeOrder(order).size());
    }

    @Test(expected = OrderException.class)
    public void testPlaceOrder_noItemsInOrder() throws OrderException {
        List<Item> items = new ArrayList<>();
        Order order = new Order();
        order.setItems(items);
        order.setTableNumber(1);
        orderService.placeOrder(order);
    }

    @Test
    public void testPlaceOrder_withMoreThanOneOrders() throws OrderException {
        List<Item> items = new ArrayList<>();
        Item item1 = createItem(2, ItemType.CHOCOLATE_PASTRY);
        items.add(item1);
        Order order1 = new Order();
        order1.setItems(items);
        order1.setTableNumber(1);
        Item item2 = createItem(2, ItemType.CHOCOLATE_PASTRY);
        items.add(item2);
        Order order2 = new Order();
        order2.setItems(items);
        order2.setTableNumber(1);
        orderService.placeOrder(order1);
        Assert.assertEquals(2, orderService.placeOrder(order2).size());
    }

    @Test(expected = OrderException.class)
    public void testPlaceOrder_withNullItems() throws OrderException {
        List<Item> items = null;
        Order order = new Order();
        order.setItems(items);
        order.setTableNumber(1);
        orderService.placeOrder(order);
    }
}