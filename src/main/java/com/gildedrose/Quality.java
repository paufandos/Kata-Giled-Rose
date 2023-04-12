package com.gildedrose;

public class Quality {

    public int value;
    public static final int MAX_LIMIT = 50;
    public static final int MIN_LIMIT = 0;

    public Quality(int quality) {
        this.value = quality;
    }

    public int getValue() {
        return this.value;
    }

    public void increaseInOne() {
        final int INCREMENT = 1;
        if (this.value + INCREMENT > MAX_LIMIT) {
            this.value = MAX_LIMIT;
            return;
        }
        this.value = this.value + INCREMENT;
    }
    

    public void decrease(int decrease) {
        if ((this.value - decrease) < 0) {
            decreaseToZero();
            return;
        }
        this.value = this.value - decrease;
    }

    public void decreaseToZero() {
        this.value = MIN_LIMIT;
    }
}
