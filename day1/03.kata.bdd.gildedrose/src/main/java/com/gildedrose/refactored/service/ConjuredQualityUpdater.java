package com.gildedrose.refactored.service;

import com.gildedrose.refactored.model.Item;

public class ConjuredQualityUpdater implements ItemQualityUpdater {

    @Override
    public Item updateQuality(Item item) {

        if (item.getSellIn() > 0) {
            item.updateQuality(-2);
        } else {
            item.updateQuality(-4);
        }
        item.updateSellIn(-1);
        return item;
    }
}
