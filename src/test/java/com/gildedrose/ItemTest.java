package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTest {
    @Test
    void getNameTestMustRreturnItemName() {
        final String EXPECTED_RESULT = "item";
        Item item = new Item("item", 10, 20);
        assertEquals(EXPECTED_RESULT, item.getName());
    }

    @Test
    void getSellInTestMustRreturnHowManyDaysLeftForItemSale() {
        final int EXPECTED_RESULT = 10;
        Item item = new Item("item", 10, 20);
        assertEquals(EXPECTED_RESULT, item.getSellIn());
    }

    @Test
    void getQualityTestMustRreturnTheCurrentValueOfTheItem() {
        final int EXPECTED_RESULT = 20;
        Item item = new Item("item", 10, 20);
        assertEquals(EXPECTED_RESULT, item.getQuality());
    }
}
