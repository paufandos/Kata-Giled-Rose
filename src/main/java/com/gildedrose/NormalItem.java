package com.gildedrose;

public class NormalItem implements ItemUpdateInterface {

    private Quality quality;
    private SellIn sellIn;

    public Quality getQuality() {
        return quality;
    }

    public SellIn getSellIn() {
        return sellIn;
    }

    public NormalItem(Item item) {
        this.quality = new Quality(item.quality);
        this.sellIn = new SellIn(item.sellIn);
    }

    @Override
    public void updateQuality() {
        final int DECREASE_AMOUNT_IN_ONE = 1;
        this.quality.decrease(DECREASE_AMOUNT_IN_ONE);
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
        final int DECREASE_AMOUNT_IN_ONE = 1;
        this.quality.decrease(DECREASE_AMOUNT_IN_ONE);
    }
}
