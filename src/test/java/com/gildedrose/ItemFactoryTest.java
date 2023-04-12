package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import org.junit.jupiter.api.Test;

public class ItemFactoryTest {
    @Test
    void testGetItemTypeWhenTypeIsAgedBrieMustReturnAgedBrieItem() {
        Item item = new Item(Helpers.AGED_BRIE, 0, 0);
        
        assertInstanceOf(AgedBrie.class, ItemFactory.getItemType(item));
    }

    @Test
    void testGetItemTypeWhenTypeIsBackstageMustReturnBackstagePassesItem() {
        Item item = new Item(Helpers.BACKSTAGE_PASSES, 0, 0);
        
        assertInstanceOf(BackstagePasses.class, ItemFactory.getItemType(item));
    }

    @Test
    void testGetItemTypeWhenTypeIsSulfurasMustReturnSulfurasItem() {
        Item item = new Item(Helpers.SULFURAS, 0, 0);
        
        assertInstanceOf(Sulfuras.class, ItemFactory.getItemType(item));
    }

    @Test
    void testGetItemTypeWhenTypeIsNormalMustReturnNormalItem() {
        Item item = new Item(Helpers.NORMAL_ITEM, 0, 0);
        
        assertInstanceOf(NormalItem.class, ItemFactory.getItemType(item));
    }
}
