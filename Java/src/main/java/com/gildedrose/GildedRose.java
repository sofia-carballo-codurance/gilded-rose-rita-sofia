package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            switch (item.name) {
                case "Aged Brie":
                    if (item.quality < 50) {
                        upgradeQuality(item);
                    }

                    item.sellIn -= 1;

                    if (item.quality < 50) {
                        if (item.sellIn < 0) {
                            upgradeQuality(item);
                        }
                    }
                    break;

                case "Backstage passes to a TAFKAL80ETC concert":
                    if (item.quality < 50) {
                        upgradeQuality(item);

                        if (item.sellIn < 11) {
                            if (item.quality < 50) {
                                upgradeQuality(item);
                            }
                        }

                        if (item.sellIn < 6) {
                            if (item.quality < 50) {
                                upgradeQuality(item);
                            }
                        }
                    }

                    item.sellIn = item.sellIn - 1;

                    if (item.sellIn < 0) {
                        item.quality = 0;
                    }
                    break;

                case "Sulfuras, Hand of Ragnaros":
                    break;

                default:
            }
        }
    }

    private void upgradeQuality(Item item) {
        item.quality += 1;
    }
}
