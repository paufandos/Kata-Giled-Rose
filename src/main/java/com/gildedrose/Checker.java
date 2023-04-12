package com.gildedrose;

public class Checker {
    public final static int SELL_IN_LESS_10 = 10;
    public final static int SELL_IN_LESS_5 = 5;
    public final static int SELL_IN_LESS_0 = 0;

    public static boolean isAgedBrie(Item item) {
        return item.name.contains(Helpers.AGED_BRIE);
    }

    public static boolean isBackstagePasses(Item item) {
        return item.name.contains(Helpers.BACKSTAGE_PASSES);
    }

    public static boolean isSulfuras(Item item) {
        return item.name.contains(Helpers.SULFURAS);
    }

    public static boolean isConjured(Item item) {
        return item.name.contains(Helpers.CONJURED);
    }

    public static boolean isSpecialItem(Item item) {
        return Checker.isAgedBrie(item) || Checker.isBackstagePasses(item);
    }

    public static boolean sellInIsLessThan10(SellIn sellIn) {
        return sellIn.getValue() <= SELL_IN_LESS_10;
    }

    public static boolean sellInIsLessThan5(SellIn sellIn) {
        return sellIn.getValue() <= SELL_IN_LESS_5;
    }

    public static boolean sellInIsLessThan0(SellIn sellIn) {
        return sellIn.getValue() < SELL_IN_LESS_0;
    }

}
