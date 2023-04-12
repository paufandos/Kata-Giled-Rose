package com.gildedrose;

public class Sulfuras implements ItemUpdateInterface {

    private Quality quality;
    private SellIn sellIn;

    public Quality getQuality() {
        return quality;
    }

    public SellIn getSellIn() {
        return sellIn;
    }

    public Sulfuras(Item item) {
        this.quality = new Quality(80);
        this.sellIn = new SellIn(item.sellIn);
    }

    @Override
    public void updateQuality() {
        return;
    }

    @Override
    public void updateSellIn() {
        return;
    }
}
