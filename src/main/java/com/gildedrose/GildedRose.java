package com.gildedrose;

import java.util.Arrays;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        Arrays.stream(items).forEach((item) -> {
            ItemUpdateInterface itemTyped = ItemFactory.getItemType(item);

            itemTyped.updateQuality();
            item.quality = itemTyped.getQuality().getValue();

            itemTyped.updateSellIn();
            item.sellIn = itemTyped.getSellIn().getValue();
        });
    }

}