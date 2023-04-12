package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NormalItemTest {
    @Test
    void testUpdateQualityMustReturnQualityDecreasedInOne() {
        final int INITIAL_SELL_IN = 2;
        final int QUALITY_AMOUNT_TO_BE_DECREASED = 5;
        Item item = new Item(Helpers.NORMAL_ITEM, INITIAL_SELL_IN, QUALITY_AMOUNT_TO_BE_DECREASED);
        NormalItem normalItem = new NormalItem(item);

        normalItem.updateQuality();

        final int EXPECTED_QUALITY_DECREASED = 4;
        assertEquals(EXPECTED_QUALITY_DECREASED, normalItem.getQuality().getValue());
    }

    @Test
    void testUpdateSellInMustreturnSellInDecreasedInOne() {
        final int SELL_IN_AMOUNT_TO_DECREASE_IN_ONE = 2;
        final int INITIAL_QUALITY = 5;
        Item item = new Item(Helpers.NORMAL_ITEM, SELL_IN_AMOUNT_TO_DECREASE_IN_ONE, INITIAL_QUALITY);
        NormalItem normalItem = new NormalItem(item);

        normalItem.updateSellIn();

        final int EXPECTED_QUALITY_INCREASED = 1;
        assertEquals(EXPECTED_QUALITY_INCREASED, normalItem.getSellIn().getValue());
    }
}
