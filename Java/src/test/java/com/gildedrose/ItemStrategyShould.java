package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemStrategyShould {

  @Test
  void updateItemQuality_when_updateQuality() {

    Item item = new Item("test", 1, 1);
    ItemStrategy itemStrategy = new ItemStrategy(null, item);
    itemStrategy.increaseQuality();
    assertEquals(2, itemStrategy.item.quality);
  }
}
