package com.gildedrose.refactored;

import com.gildedrose.refactored.model.Item;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private final ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<>();
        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void setItems(List<Item> updatedItems) {
        items.clear();
        items.addAll(updatedItems);
    }

    public Item getItem(int i) {
        return items.get(i);
    }

    public Item getLastItem() {
        return items.get(items.size() -1);
    }
}
