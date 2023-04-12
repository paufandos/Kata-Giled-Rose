package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BackstagePassesTest {
    @Test
    void testUpdateMustReturnQualityValueIncreasedInOne() {
        final int SELL_IN_AMOUNT_ALLOWED_TO_INCREASE_QUALITY_IN_ONE = 11;
        final int QUALITY_AMOUNT_TO_BE_INCREASED = 5;
        Item item = new Item(Helpers.BACKSTAGE_PASSES, SELL_IN_AMOUNT_ALLOWED_TO_INCREASE_QUALITY_IN_ONE, QUALITY_AMOUNT_TO_BE_INCREASED);
        BackstagePasses backstagePasses = new BackstagePasses(item);

        backstagePasses.updateQuality();

        final int EXPECTED_QUALITY_INCREASED = 6;
        assertEquals(EXPECTED_QUALITY_INCREASED, backstagePasses.getQuality().getValue());
    }

    @Test
    void testUpdateIfSellInLessThan0MustReturnQualityValueTo0() {
        final int SELL_IN_AMOUNT_ALLOWED_TO_DECREASED_QUALITY_TO_ZERO = -1;
        final int QUALITY_AMOUNT_TO_BE_DECREASED = 5;
        Item item = new Item(Helpers.BACKSTAGE_PASSES, SELL_IN_AMOUNT_ALLOWED_TO_DECREASED_QUALITY_TO_ZERO, QUALITY_AMOUNT_TO_BE_DECREASED);
        BackstagePasses backstagePasses = new BackstagePasses(item);

        backstagePasses.updateQuality();

        final int EXPECTED_QUALITY_DECREASED = 0;
        assertEquals(EXPECTED_QUALITY_DECREASED, backstagePasses.getQuality().getValue());
    }

    @Test
    void testUpdateIfSellInLessThan10MustReturnQualityValueIncreasedInTwo() {
        final int SELL_IN_AMOUNT_ALLOWED_TO_INCREASE_QUALITY_IN_TWO = 10;
        final int QUALITY_AMOUNT_TO_BE_INCREASED = 5;
        Item item = new Item(Helpers.BACKSTAGE_PASSES, SELL_IN_AMOUNT_ALLOWED_TO_INCREASE_QUALITY_IN_TWO, QUALITY_AMOUNT_TO_BE_INCREASED);
        BackstagePasses backstagePasses = new BackstagePasses(item);

        backstagePasses.updateQuality();

        final int EXPECTED_QUALITY_INCREASED = 7;
        assertEquals(EXPECTED_QUALITY_INCREASED, backstagePasses.getQuality().getValue());
    }

    @Test
    void testUpdateIfSellInLessThan5MustReturnQualityValueIncreasedInThree() {
        final int SELL_IN_AMOUNT_ALLOWED_TO_INCREASE_QUALITY_IN_THREE = 5;
        final int QUALITY_AMOUNT_TO_BE_INCREASED = 5;
        Item item = new Item(Helpers.BACKSTAGE_PASSES, SELL_IN_AMOUNT_ALLOWED_TO_INCREASE_QUALITY_IN_THREE, QUALITY_AMOUNT_TO_BE_INCREASED);
        BackstagePasses backstagePasses = new BackstagePasses(item);

        backstagePasses.updateQuality();

        final int EXPECTED_QUALITY_INCREASED = 8;
        assertEquals(EXPECTED_QUALITY_INCREASED, backstagePasses.getQuality().getValue());

    }
}
