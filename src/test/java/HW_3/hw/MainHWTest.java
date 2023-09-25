package HW_3.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainHWTest {
    MainHW hw;

    @BeforeEach
    void setUp() {
        hw = new MainHW();
    }

    @Test
    void test_evenNumber_2() {
        assertTrue(hw.evenOddNumber(2));
    }

    @Test
    void test_evenNumber_0() {
        assertTrue(hw.evenOddNumber(0));
    }

    @Test
    void test_evenNumber_minus_2() {
        assertTrue(hw.evenOddNumber(-2));
    }

    @Test
    void test_oddNumber_1() {
        assertFalse(hw.evenOddNumber(1));
    }

    @Test
    void test_oddNumber_minus_1() {
        assertFalse(hw.evenOddNumber(1));
    }

    @Test
    void test_numberInInterval_25() {
        assertTrue(hw.numberInInterval(25));
    }

    @Test
    void test_numberInInterval_50() {
        assertTrue(hw.numberInInterval(50));
    }

    @Test
    void test_numberInInterval_100() {
        assertTrue(hw.numberInInterval(100));
    }

    @Test
    void test_numberInInterval_24() {
        assertFalse(hw.numberInInterval(24));
    }

    @Test
    void test_numberInInterval_101() {
        assertFalse(hw.numberInInterval(101));
    }
}