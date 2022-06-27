package com.gildedrose;

public class ItemStrategy {

  Item item;
  IUpdateQuality qualityUpdater;

  ItemStrategy(Item item) {
    switch (item.name) {
      case "Backstage passes to a TAFKAL80ETC concert":
        this.qualityUpdater = new UpdaterForBackstagePasses();
        break;
      case "Sulfuras, Hand of Ragnaros":
        this.qualityUpdater = new UpdaterForSulfuras();
        break;
      default:
        this.qualityUpdater = new UpdaterForAgedBrie();
    }

    this.item = item;
  }

  void updateQuality() {
    qualityUpdater.updateQuality(item);
  }
}
