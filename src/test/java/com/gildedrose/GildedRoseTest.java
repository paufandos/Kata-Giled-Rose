package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    private int getFirstItemQuality(Item[] items){
        return items[0].quality;
    }

    private int getFirstItemSellIn(Item[] items){
        return items[0].sellIn;
    }

    @Test
    void reduceSellInTestMustRreturnSellInValueReduced() {
        Item[] items = new Item[] { new Item(Helpers.NORMAL_ITEM, 1, 1) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        final int EXPECTED_RESULT = 0;
        assertEquals(EXPECTED_RESULT, getFirstItemSellIn(items));
    }

    @Test
    void updateQualityTestMustRreturnQualityValueReduced() {
        Item[] items = new Item[] { new Item(Helpers.NORMAL_ITEM, 1, 1) };
        GildedRose app = new GildedRose(items);

        final int EXPECTED_RESULT = 0;
        app.updateQuality();
        
        assertEquals(EXPECTED_RESULT, getFirstItemQuality(items));
    }

    @Test
    void updateQualityAndSellinTestMustRreturnBothValuesReduced() {
        Item[] items = new Item[] { new Item(Helpers.NORMAL_ITEM, 1, 1) };
        GildedRose app = new GildedRose(items);

        final int[] EXPECTED_RESULT = {0, 0};
        app.updateQuality();
        int[] result = {getFirstItemSellIn(items), getFirstItemQuality(items)};

        assertArrayEquals(EXPECTED_RESULT, result);
    }

    @Test
    void updateQualityWhenSellInHasPassedTestMustRreturnQualityReducedTwice() {
        Item[] items = new Item[] { new Item(Helpers.NORMAL_ITEM, -1, 2) };
        GildedRose app = new GildedRose(items);

        final int EXPECTED_RESULT = 0;
        app.updateQuality();

        assertEquals(EXPECTED_RESULT, getFirstItemQuality(items));
    }

    @Test
    void reducQualityWhenQualityIs0TestMustRreturnQualityWithoutReducing() {
        Item[] items = new Item[] { new Item(Helpers.NORMAL_ITEM, 0, 0) };
        GildedRose app = new GildedRose(items);

        final int EXPECTED_RESULT = 0;
        app.updateQuality();

        assertEquals(EXPECTED_RESULT, getFirstItemQuality(items));
    }

    @Test
    void incrementQualityIfItemIsAgedBrieMustRetrunQualityValueIncremented() {
        Item[] items = new Item[] { new Item(Helpers.AGED_BRIE, 1, 0) };
        GildedRose app = new GildedRose(items);

        final int EXPECTED_RESULT = 1;
        app.updateQuality();

        assertEquals(EXPECTED_RESULT, getFirstItemQuality(items));
    }

    @Test
    void incrementQualityIfItemIsAgedBrieAndSellInHasPassedMustRetrunQualityValueIncrementedTwice() {
        Item[] items = new Item[] { new Item(Helpers.AGED_BRIE, -1, 2) };
        GildedRose app = new GildedRose(items);

        final int EXPECTED_RESULT = 4;
        app.updateQuality();

        assertEquals(EXPECTED_RESULT, getFirstItemQuality(items));
    }

    @Test
    void incrementQualityIfItemIsAgedBrieAndQualityIsMoreThan50MustRetrunNoIncrementedQualityValue() {
        Item[] items = new Item[] { new Item(Helpers.AGED_BRIE, 0, 50) };
        GildedRose app = new GildedRose(items);

        final int EXPECTED_RESULT = 50;
        app.updateQuality();

        assertEquals(EXPECTED_RESULT, getFirstItemQuality(items));
    }

    @Test
    void incrementQualityIfItemIsAgedBrieAndQualityIsLessThan50MustRetrunQualityValueIncremented() {
        Item[] items = new Item[] { new Item(Helpers.AGED_BRIE, -1, 48) };
        GildedRose app = new GildedRose(items);

        final int EXPECTED_RESULT = 50;
        app.updateQuality();

        assertEquals(EXPECTED_RESULT, getFirstItemQuality(items));
    }

    @Test
    void updateSellInIfItemIsSulfurasMustRetrunSellInValueWithoutChanges() {
        Item[] items = new Item[] { new Item(Helpers.SULFURAS, 33, 80) };
        GildedRose app = new GildedRose(items);

        final int EXPECTED_RESULT = 33;
        app.updateQuality();

        assertEquals(EXPECTED_RESULT, getFirstItemSellIn(items));
    }

    @Test
    void updateQualityIfItemIsSulfurasMustRetrunQualityValueWithoutChanges() {
        Item[] items = new Item[] { new Item(Helpers.SULFURAS, 33, 80) };
        GildedRose app = new GildedRose(items);

        final int EXPECTED_RESULT = 80;
        app.updateQuality();

        assertEquals(EXPECTED_RESULT, getFirstItemQuality(items));
    }

    @Test
    void updateQualityAndSellInIfItemIsSulfurasMustRetrunQualityAndSellInValuesWithoutChangese() {
        Item[] items = new Item[] { new Item(Helpers.SULFURAS, 33, 80) };
        GildedRose app = new GildedRose(items);

        final int[] EXPECTED_RESULT = {33, 80};
        app.updateQuality();
        int[] result = {getFirstItemSellIn(items), getFirstItemQuality(items)};

        assertArrayEquals(EXPECTED_RESULT, result);
    }

    @Test
    void updateQualityIfItesmIsBacktagePassAndSellInLessThan10DaysMustReturnedQualityValueTwiceIncremented() {
        Item[] items = new Item[] { new Item(Helpers.BACKSTAGE_PASSES, 6, 18) };
        GildedRose app = new GildedRose(items);

        final int EXPECTED_RESULT = 20;
        app.updateQuality();

        assertEquals(EXPECTED_RESULT, getFirstItemQuality(items));
    }
    
    @Test
    void updateQualityIfItesmIsBacktagePassAndSellInLessThan5DaysMustReturnedQualityValueBy3Incremented() {
        Item[] items = new Item[] { new Item(Helpers.BACKSTAGE_PASSES, 5, 18) };
        GildedRose app = new GildedRose(items);

        final int EXPECTED_RESULT = 21;
        app.updateQuality();

        assertEquals(EXPECTED_RESULT, getFirstItemQuality(items));
    }

    @Test
    void updateQualityIfItesmIsBacktagePassAndSellInHasPassedMustReturnedQualityValueTo0() {
        Item[] items = new Item[] { new Item(Helpers.BACKSTAGE_PASSES, -1, 18) };
        GildedRose app = new GildedRose(items);

        final int EXPECTED_RESULT = 0;
        app.updateQuality();

        assertEquals(EXPECTED_RESULT, getFirstItemQuality(items));
    }

    @Test
    void reduceQualityTestInConjuredItemMustRreturnQualityValueReducedTwice() {
        Item[] items = new Item[] { new Item(Helpers.CONJURED, 1, 2) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        final int EXPECTED_RESULT = 0;
        assertEquals(EXPECTED_RESULT, getFirstItemQuality(items));
    }

    @Test
    void reduceQualityTestInConjuredItemWhenSellInLessThan0MustRreturnQualityValueReducedFour() {
        Item[] items = new Item[] { new Item(Helpers.CONJURED, -1, 4) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        final int EXPECTED_RESULT = 0;
        assertEquals(EXPECTED_RESULT, getFirstItemQuality(items));
    }
}
