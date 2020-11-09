package com.gildedrose.refactored.factory;

import com.gildedrose.refactored.model.Item;
import com.gildedrose.refactored.service.ItemQualityUpdater;
import com.gildedrose.refactored.service.BackstageQualityUpdater;
import com.gildedrose.refactored.service.BrieQualityUpdater;
import com.gildedrose.refactored.service.DefaultQualityUpdater;
import com.gildedrose.refactored.service.SulfurasQualityUpdater;

public class UpdaterFactory {

    public static ItemQualityUpdater getQualityUpdater(Item item) {
        ItemQualityUpdater instanceToReturn;

        switch (item.getName()) {
            case "Sulfuras, Hand of Ragnaros" :
                instanceToReturn = new SulfurasQualityUpdater();
                break;
            case "Aged Brie" :
                instanceToReturn = new BrieQualityUpdater();
                break;
            case "Backstage passes to a TAFKAL80ETC concert" :
                instanceToReturn = new BackstageQualityUpdater();
                break;
            default:
                instanceToReturn = new DefaultQualityUpdater();
                break;
        }
        return instanceToReturn;
    }
}
