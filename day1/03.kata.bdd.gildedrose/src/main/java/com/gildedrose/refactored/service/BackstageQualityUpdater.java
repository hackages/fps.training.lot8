package com.gildedrose.refactored.service;

import com.gildedrose.refactored.model.Item;

public class BackstageQualityUpdater implements ItemQualityUpdater {
    @Override
    public Item updateQuality(Item item) {

        if (item.getSellIn() <= 0) {
            item.setQuality(0);
        } else if (item.getSellIn() <= 5) {
            item.updateQuality(3);
        } else if (item.getSellIn() <= 10) {
            item.updateQuality(2);
        } else {
            item.updateQuality(1);
        }

        if (item.getQuality() > 50) {
            item.setQuality(50);
        }

        item.updateSellIn(-1);
        return item;
    }
}
