package com.gildedrose;

class GildedRose {
  Item[] items;

  public GildedRose(Item[] items) {
    this.items = items;
  }

  void updateQuality() {
    IUpdateQuality updater;
    for (Item item : items) {
      switch (item.name) {
        case "Backstage passes to a TAFKAL80ETC concert":
          updater = new UpdaterForBackstagePasses();
          break;

        case "Sulfuras, Hand of Ragnaros":
          updater = new UpdaterForSulfuras();
          break;

        default:
            updater = new UpdaterForAgedBrie();
      }

      new ItemStrategy(item).updateQuality(updater);
    }
  }
}
