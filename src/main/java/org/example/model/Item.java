package org.example.model;

import org.example.enums.ItemType;

public class Item {
    ItemType item;
    int count;

    public Item(ItemType key, Integer value) {
    }

    public Item() {
    }

    public ItemType getItem() {
        return item;
    }

    public void setItem(ItemType item) {
        this.item = item;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        if(item !=null) {
            return item.getValue() * count;
        }
        return 0;
    }

}
