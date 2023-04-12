package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AgedBrieTest {
    @Test
    void testUpdateBeforSellInMustReturnQualityValueIncreasedInOne() {
        final int SELL_IN_AMOUNT_ALLOWED_TO_INCREASE_QUALITY_IN_ONE = 2;
        final int QUALITY_AMOUNT_TO_BE_INCREASED = 5;
        Item item = new Item(Helpers.AGED_BRIE, SELL_IN_AMOUNT_ALLOWED_TO_INCREASE_QUALITY_IN_ONE, QUALITY_AMOUNT_TO_BE_INCREASED);
        AgedBrie agedBrie = new AgedBrie(item);

        agedBrie.updateQuality();

        final int EXPECTED_QUALITY_INCREASED = 6;
        assertEquals(EXPECTED_QUALITY_INCREASED, agedBrie.getQuality().getValue());
    }

    @Test
    void testUpdateAfeterSellInMustReturnQualityValueIncreasedInTwo() {
        final int SELL_IN_AMOUNT_ALLOWED_TO_INCREASE_QUALITY_IN_TWO = -1;
        final int QUALITY_AMOUNT_TO_BE_INCREASED = 5;
        Item item = new Item(Helpers.AGED_BRIE, SELL_IN_AMOUNT_ALLOWED_TO_INCREASE_QUALITY_IN_TWO, QUALITY_AMOUNT_TO_BE_INCREASED);
        AgedBrie agedBrie = new AgedBrie(item);

        agedBrie.updateQuality();

        final int EXPECTED_QUALITY_INCREASED = 7;
        assertEquals(EXPECTED_QUALITY_INCREASED, agedBrie.getQuality().getValue());
    }
}
