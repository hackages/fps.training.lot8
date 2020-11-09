package com.gildedrose.refactored.service;

import com.gildedrose.refactored.model.Item;

public class BrieQualityUpdater implements ItemQualityUpdater {

    @Override
    public Item updateQuality(Item item) {

        if (item.getSellIn() > 0) {
            item.updateQuality(1);
        } else {
            item.updateQuality(2);
        }

        if (item.getQuality() > 50) {
            item.setQuality(50);
        }

        item.updateSellIn(-1);
        return item;
    }
}
