package com.gildedrose;

import org.approvaltests.Approvals;
import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void should_update_quality() {
        String name = "foo";
        int sellIn = 0;
        int quality = 0;

        CombinationApprovals.verifyAllCombinations(
            this::doUpdateQuality,
            new String[] {name},
            new Integer[] {sellIn},
            new Integer[] {quality}
        );
    }

    private String doUpdateQuality(String name, int sellIn, int quality) {
        Item[] items = new Item[] { new Item(name, sellIn, quality) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return app.items[0].toString();
    }
}
