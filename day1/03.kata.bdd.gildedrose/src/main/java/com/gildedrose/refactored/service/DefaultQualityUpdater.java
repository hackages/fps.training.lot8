package com.gildedrose.refactored.service;

import com.gildedrose.refactored.model.Item;

public class DefaultQualityUpdater implements ItemQualityUpdater {
    @Override
    public Item updateQuality(Item item) {

        if (item.getQuality() >= 10) {
            item.updateQuality(-1);
        }
        item.updateSellIn(-1);

        if (item.getSellIn() < 0 && item.getQuality() > 0) {
            item.setQuality(0);
        }
        return item;
    }
}
