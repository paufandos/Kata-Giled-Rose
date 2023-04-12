package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConjuredTest {
    @Test
    void testUpdateQualityMustreturnQualityValueDecreasedTwice() {
        final int SELL_IN_AMOUNT_ALLOWED_TO_DECREASE_QUALITY_IN_TWO = 0;
        final int QUALITY_TO_BE_DECREASED = 2;
        Item item = new Item(Helpers.CONJURED, SELL_IN_AMOUNT_ALLOWED_TO_DECREASE_QUALITY_IN_TWO, QUALITY_TO_BE_DECREASED);
        Conjured conjured = new Conjured(item);

        conjured.updateQuality();

        final int EXPECTED_QUALITY_RESULT = 0;
        assertEquals(EXPECTED_QUALITY_RESULT, conjured.getQuality().getValue());
    }

    @Test
    void testUpdateQualityWhenSellInLessThan0MustreturnQualityValueDecreasedInFour() {
        final int SELL_IN_AMOUNT_ALLOWED_TO_DECREASE_QUALITY_IN_FOUR = -2;
        final int QUALITY_TO_BE_DECREASED = 4;
        Item item = new Item(Helpers.CONJURED, SELL_IN_AMOUNT_ALLOWED_TO_DECREASE_QUALITY_IN_FOUR, QUALITY_TO_BE_DECREASED);
        Conjured conjured = new Conjured(item);

        conjured.updateQuality();

        final int EXPECTED_QUALITY_RESULT = 0;
        assertEquals(EXPECTED_QUALITY_RESULT, conjured.getQuality().getValue());
    }

    @Test
    void testUpdateSellInMustReturnSellInValueDecreasedInOne() {
        final int SELL_IN_AMOUNT_TO_DECREASE_IN_ONE = 2;
        final int INITIAL_QUALITY = 5;
        Item item = new Item(Helpers.CONJURED, SELL_IN_AMOUNT_TO_DECREASE_IN_ONE, INITIAL_QUALITY);
        Conjured conjured = new Conjured(item);

        conjured.updateSellIn();

        final int EXPECTED_QUALITY_INCREASED = 1;
        assertEquals(EXPECTED_QUALITY_INCREASED, conjured.getSellIn().getValue());
    }
}
