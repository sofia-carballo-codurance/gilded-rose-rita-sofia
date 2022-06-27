package com.gildedrose;

public class UpdaterForAgedBrie implements IUpdateQuality {
    @Override
    public void updateQuality(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }

        item.sellIn -= 1;

        if (item.quality < 50 && item.sellIn < 0) {
            item.quality++;
        }
    }
}
