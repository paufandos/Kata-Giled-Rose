package com.gildedrose;

public class AgedBrie implements ItemUpdateInterface {

    private Quality quality;
    private SellIn sellIn;

    public Quality getQuality() {
        return quality;
    }

    public SellIn getSellIn() {
        return sellIn;
    }

    public AgedBrie(Item item) {
        this.quality = new Quality(item.quality);
        this.sellIn = new SellIn(item.sellIn);
    }

    @Override
    public void updateQuality() {
        this.quality.increaseInOne();
        updateAfeterSellIn();
    }

    public void updateAfeterSellIn() {
        if (!Checker.sellInIsLessThan0(sellIn)) {
            return;
        }
        this.quality.increaseInOne();
    }

    @Override
    public void updateSellIn() {
        this.sellIn.decreaseInOne();
    }
}
