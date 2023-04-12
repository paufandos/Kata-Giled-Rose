package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CheckerTest {
    @Test
    void testIsAgedBrieMustReturnTrue() {
        Item item = new Item(Helpers.AGED_BRIE, 0, 0);
        assertTrue(Checker.isAgedBrie(item));
    }

    @Test
    void testIsAgedBrieWhitNotAgedBrieItemMustReturnFalse() {
        final String NOT_AGED_BRIE_ITEM = "Not aged brie item";
        Item item = new Item(NOT_AGED_BRIE_ITEM, 0, 0);
        assertFalse(Checker.isAgedBrie(item));
    }

    @Test
    void testIsBackstagePassesMustReturnTrue() {
        Item item = new Item(Helpers.BACKSTAGE_PASSES, 0, 0);
        assertTrue(Checker.isBackstagePasses(item));
    }

    @Test
    void testIsBackstagePassesWithNotBackstagePassesItemMustReturnFalse() {
        final String NOT_BACKSTAGE_PASSES_ITEM = "Not backstage passes item";
        Item item = new Item(NOT_BACKSTAGE_PASSES_ITEM,0, 0);
        assertFalse(Checker.isBackstagePasses(item));
    }

    @Test
    void testIsSulfurasMustReturnTrue() {
        Item item = new Item(Helpers.SULFURAS, 0, 0);
        assertTrue(Checker.isSulfuras(item));
    }

    @Test
    void testIsSulfurasWithNotSulfurasItemMustReturnFalse() {
        final String NOT_SULFURAS_ITEM = "Not sulfuras item";
        Item item = new Item(NOT_SULFURAS_ITEM,0, 0);
        assertFalse(Checker.isSulfuras(item));
    }

    @Test
    void testIsSpecialItemMustReturnTrue() {
        Item item = new Item(Helpers.AGED_BRIE, 0, 0);
        assertTrue(Checker.isSpecialItem(item));
    }

    @Test
    void testIsSpecialItemWithNotSpecialItemMustReturnFalse() {
        final String NOT_SPECIAL_ITEM = "Not special item";
        Item item = new Item(NOT_SPECIAL_ITEM,0, 0);
        assertFalse(Checker.isSpecialItem(item));
    }

    
    @Test
    void testsSellInLessThan10MustReturnTrue() {
        final int SELL_IN_LESS_10 = 10;
        SellIn sellIn = new SellIn(SELL_IN_LESS_10);

        assertTrue(Checker.sellInIsLessThan10(sellIn));
    }

    @Test
    void testSellInLessThan10WithSellInOver10MustReturnFalse() {
        final int SELL_IN_OVER_10 = 11;
        SellIn sellIn = new SellIn(SELL_IN_OVER_10);

        assertFalse(Checker.sellInIsLessThan10(sellIn));
    }

    @Test
    void testsSellInLessThan5MustReturnTrue() {
        final int SELL_IN_LESS_5 = 5;
        SellIn sellIn = new SellIn(SELL_IN_LESS_5);

        assertTrue(Checker.sellInIsLessThan5(sellIn));
    }

    @Test
    void testSellInLessThan5WithSellInOver5MustReturnFalse() {
        final int SELL_IN_OVER_5 = 6;
        SellIn sellIn = new SellIn(SELL_IN_OVER_5);

        assertFalse(Checker.sellInIsLessThan5(sellIn));
    }

    @Test
    void testsSellInLessThan0MustReturnTrue() {
        final int SELL_IN_LESS_0 = -1;
        SellIn sellIn = new SellIn(SELL_IN_LESS_0);

        assertTrue(Checker.sellInIsLessThan0(sellIn));
    }

    @Test
    void testSellInLessThan0WithSellInOver0MustReturnFalse() {
        final int SELL_IN_OVER_0 = 0;
        SellIn sellIn = new SellIn(SELL_IN_OVER_0);

        assertFalse(Checker.sellInIsLessThan0(sellIn));
    }

    @Test
    void testIsConjuredItemMustReturnTrue() {
        Item item = new Item(Helpers.CONJURED, 0, 0);
        assertTrue(Checker.isConjured(item));
    }

    @Test
    void testIsConjuredlItemWithNotConjuredlItemMustReturnFalse() {
        final String NOT_CONJURED_ITEM = "Not conjured item";
        Item item = new Item(NOT_CONJURED_ITEM,0, 0);
        assertFalse(Checker.isConjured(item));
    }
    
}
