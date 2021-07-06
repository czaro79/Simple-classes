package models;

import java.util.ArrayList;

public class Drawer {
    ArrayList<Item> items;

    public Drawer() {
        this.items = new ArrayList<Item>();
    }

    public Item getItem(int index) {
        if (this.items.isEmpty()) {
            throw new IllegalStateException("Cannot get Item from an empty Drawer.");
        }
        return new Item(this.items.get(index));
    }

    public void add(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Cannot add null.");
        }

        this.items.add(item);
    }

    public void setItem(int index, Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Cannot set null to Drawer.");
        }
        this.items.add(index, item);
    }

    public String toString() {
        if (this.items.isEmpty()) {
            throw new IllegalStateException("Cannot show Items of an empty Drawer.");
        }
        int count = 1;
        String temp = "Drawer:\n";
        for (Item item : items) {
            temp += "\t(" + count + ") " + item + "\n";
            count++;
        }
        return temp + "\n";
    }

}
