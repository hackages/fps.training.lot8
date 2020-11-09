package com.gildedrose;

import com.gildedrose.refactored.Inventory;
import com.gildedrose.refactored.model.Item;
import com.gildedrose.refactored.service.ItemQualityUpdater;
import com.gildedrose.refactored.factory.UpdaterFactory;

import java.util.List;
import java.util.stream.Collectors;

public class GildedRose {

    private Inventory inventory = new Inventory();

    public GildedRose() {
        updateQuality();
    }

    public GildedRose(Inventory inventory) {
        this.inventory = inventory;
    }

    public void updateQuality() {
        List<Item> updatedItems = inventory.getItems().stream().map(item -> updateQuality(item)).collect(Collectors.toList());
        inventory.setItems(updatedItems);
    }

    private Item updateQuality(Item item) {
        ItemQualityUpdater itemQualityUpdater = UpdaterFactory.getQualityUpdater(item);
        return itemQualityUpdater.updateQuality(item);
    }

    public Inventory getInventory() {
        return inventory;
    }
}