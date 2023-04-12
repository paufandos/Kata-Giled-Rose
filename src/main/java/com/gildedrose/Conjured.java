package com.gildedrose;

public class Conjured implements ItemUpdateInterface{
    
    private Quality quality;
    private SellIn sellIn;

    public Quality getQuality() {
        return quality;
    }

    public SellIn getSellIn() {
        return sellIn;
    }

    public Conjured(Item item) {
        this.quality = new Quality(item.quality);
        this.sellIn = new SellIn(item.sellIn);
    }

    @Override
    public void updateQuality() {
        final int DECREASE_AMOUNT_IN_TWO = 2;
        this.quality.decrease(DECREASE_AMOUNT_IN_TWO);
        updateAfeterSellIn();
    }

    @Override
    public void updateSellIn() {
        this.sellIn.decreaseInOne();
    }

    public void updateAfeterSellIn() {
        if (!Checker.sellInIsLessThan0(sellIn)) {
            return;
        }
        final int DECREASE_AMOUNT_IN_FOUR = 4;
        this.quality.decrease(DECREASE_AMOUNT_IN_FOUR);
    }
    
}
