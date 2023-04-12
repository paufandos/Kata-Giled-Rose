package com.gildedrose;

public class BackstagePasses implements ItemUpdateInterface {
    
    private Quality quality;
    private SellIn sellIn;

    public Quality getQuality() {
        return quality;
    }

    public SellIn getSellIn() {
        return sellIn;
    }

    public BackstagePasses(Item item) {
        this.quality = new Quality(item.quality);
        this.sellIn = new SellIn(item.sellIn);
    }

    @Override
    public void updateQuality() {
        this.quality.increaseInOne();
        updateIfSellInLessThan10();
        updateIfSellInLessThan5();
        updateIfSellInLessThan0();
    }

    public void updateIfSellInLessThan10() {
        if (!Checker.sellInIsLessThan10(sellIn)) {
            return;
        }
        this.quality.increaseInOne();
    }

    public void updateIfSellInLessThan5() {
        if (!Checker.sellInIsLessThan5(sellIn)) {
            return;
        }
        this.quality.increaseInOne();
    }

    public void updateIfSellInLessThan0() {
        if (!Checker.sellInIsLessThan0(sellIn)) {
            return;
        }
        this.quality.decreaseToZero();
    }

    @Override
    public void updateSellIn() {
        this.sellIn.decreaseInOne();
    }

}
