package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SellInTest {
    @Test
    void testDecreaseInOneMustReturnSellInValueDecreased() {
        final int SELL_IN_AMOUNT_ALLOWED_TO_BE_DECREASED = 10;
        SellIn sellIn = new SellIn(SELL_IN_AMOUNT_ALLOWED_TO_BE_DECREASED);

        sellIn.decreaseInOne();
        final int EXPECTED_DECREASED_SELL_IN = 9;

        assertEquals(EXPECTED_DECREASED_SELL_IN, sellIn.getValue());
    }
}
