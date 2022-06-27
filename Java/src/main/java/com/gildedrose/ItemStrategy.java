package com.gildedrose;

public class ItemStrategy {

  Item item;
  IUpdateQuality qualityUpdater;

  ItemStrategy(IUpdateQuality qualityUpdater, Item item) {
    this.item = item;
    this.qualityUpdater = qualityUpdater;
  }


    public void increaseQuality() {
        this.item.quality++;
    }
}
