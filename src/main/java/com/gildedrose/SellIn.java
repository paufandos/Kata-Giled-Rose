package com.gildedrose;

public class SellIn {

    private int value;
    final static int DECREMENT = 1;

    public SellIn(int sellIn) {
        this.value = sellIn;
    }

    public int getValue() {
        return this.value;
    }

    public void decreaseInOne() {
        this.value = this.value - DECREMENT;
    }
}
