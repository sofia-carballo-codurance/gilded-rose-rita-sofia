package com.gildedrose;

class GildedRose {
  Item[] items;

  public GildedRose(Item[] items) {
    this.items = items;
  }

  void updateQuality() {
    for (Item item : items) {
      new ItemStrategy(item).updateQuality();
    }
  }
}
