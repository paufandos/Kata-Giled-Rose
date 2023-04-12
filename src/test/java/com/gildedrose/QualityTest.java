package com.gildedrose;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QualityTest {
    @Test
    void testIncreaseInOneMustReturnValueIncreasedInOne() {
        final int QUALITY_AMOUNT_ALLOWED_TO_BE_INCREASED = 30;
        Quality quality = new Quality(QUALITY_AMOUNT_ALLOWED_TO_BE_INCREASED);

        quality.increaseInOne();

        final int EXPECTED_INCREASED_QUALITY = 31;
        assertEquals(EXPECTED_INCREASED_QUALITY, quality.getValue());
    }

    @Test
    void increaseQualityMoreThanLimitReturnLimitTest() {
        final int QUALITY_AMOUNT_NOT_ALLOWED_TO_BE_INCREASED = 50;
        Quality quality = new Quality(QUALITY_AMOUNT_NOT_ALLOWED_TO_BE_INCREASED);

        quality.increaseInOne();

        final int EXPECTED_INCREASED_QUALITY = Quality.MAX_LIMIT;
        assertEquals(EXPECTED_INCREASED_QUALITY, quality.getValue());
    }

    @Test
    void testDecreaseInOneMustReturnValueDecreasedInOne() {
        final int QUALITY_AMOUNT_ALLOWED_TO_BE_DECREASED = 30;
        final int DECREASE_AMOUNT_IN_ONE = 1;
        Quality quality = new Quality(QUALITY_AMOUNT_ALLOWED_TO_BE_DECREASED);

        quality.decrease(DECREASE_AMOUNT_IN_ONE);

        final int EXPECTED_DECREASED_QUALITY = 29;
        assertEquals(EXPECTED_DECREASED_QUALITY, quality.getValue());
    }

    @Test
    void testDecreasedQualityLessThanLimitRetrunMinLimit(){
        final int QUALITY_AMOUNT_NOT_ALLOWED_TO_BE_DECREASED = 0;
        final int DECREASE_AMOUNT_IN_ONE = 1;
        Quality quality = new Quality(QUALITY_AMOUNT_NOT_ALLOWED_TO_BE_DECREASED);

        quality.decrease(DECREASE_AMOUNT_IN_ONE);

        final int EXPECTED_DECREASED_QUALITY = 0;
        assertEquals(EXPECTED_DECREASED_QUALITY, quality.getValue());
    }

    @Test
    void testDecreasedQualityToZeroRetrunMinLimit(){
        final int QUALITY_AMOUNT_ALLOWED_TO_BE_DECREASED_TO_ZERO = 30;
        Quality quality = new Quality(QUALITY_AMOUNT_ALLOWED_TO_BE_DECREASED_TO_ZERO);

        quality.decreaseToZero();

        final int EXPECTED_DECREASED_QUALITY = 0;
        assertEquals(EXPECTED_DECREASED_QUALITY, quality.getValue());
    }
    
}
