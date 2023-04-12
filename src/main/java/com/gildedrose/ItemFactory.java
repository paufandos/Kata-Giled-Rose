package com.gildedrose;

public class ItemFactory {

    public static ItemUpdateInterface getItemType(Item item) {
        if (Checker.isAgedBrie(item)) {
            return new AgedBrie(item);
        }
        if (Checker.isBackstagePasses(item)) {
            return new BackstagePasses(item);
        }
        if (Checker.isSulfuras(item)) {
            return new Sulfuras(item);
        }
        if (Checker.isConjured(item)) {
            return new Conjured(item);
        }
        return new NormalItem(item);
    }

}
