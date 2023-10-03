package seminars.third.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {

    @Test
    void evenOddNumberTrueTest() {
        assertTrue(MainHW.evenOddNumber(2));
    }

    @Test
    void evenOddNumberFalseTest() {
        assertFalse(MainHW.evenOddNumber(3));
    }

    @Test
    void numberInIntervalTrueTest() {
        assertTrue(MainHW.numberInInterval(50));
    }

    @Test
    void numberInIntervalFalseTest() {
        assertFalse(MainHW.numberInInterval(5));
    }
}