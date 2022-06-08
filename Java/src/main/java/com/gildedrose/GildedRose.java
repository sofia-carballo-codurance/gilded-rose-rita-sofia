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
                    if (item.name.equals("Aged Brie")
                        || item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.quality < 50) {
                            upgradeQuality(item);

                            if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
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
                        }
                    }

                    if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                        item.sellIn = item.sellIn - 1;
                    }

                    if (!item.name.equals("Aged Brie")) {
                        if (item.sellIn < 0) {
                            if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                                item.quality = 0;
                            }
                        }
                    }
                    break;

                default:
                    if (item.name.equals("Aged Brie")
                        || item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.quality < 50) {
                            upgradeQuality(item);

                            if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
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
                        }
                    }

                    if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                        item.sellIn = item.sellIn - 1;
                    }

                    if (!item.name.equals("Aged Brie")) {
                        if (item.sellIn < 0) {
                            if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                                item.quality = 0;
                            }
                        }
                    }
            }
        }
    }

    private void upgradeQuality(Item item) {
        item.quality += 1;
    }
}
