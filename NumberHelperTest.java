package unittesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberHelperTest {

    @Test
    void addNumbers() {
        NumberHelper numberHelper = new NumberHelper();
        assertEquals(1,numberHelper.addNumbers(0,1));
        assertEquals(5,numberHelper.addNumbers(3,2));
        assertEquals(9,numberHelper.addNumbers(3,6));
        assertEquals(8,numberHelper.addNumbers(5,3));
    }
}