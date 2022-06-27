package com.gildedrose;

public class ItemStrategy {

  Item item;

  ItemStrategy(Item item) {
    this.item = item;
  }

  void updateQuality(IUpdateQuality qualityUpdater) {
      qualityUpdater.updateQuality(item);
  }
}
