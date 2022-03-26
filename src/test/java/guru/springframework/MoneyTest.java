package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class MoneyTest {

    @Test
    void testDollarMultiplication() {
        Dollar five = Money.dollar(5);

        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    void testDollarEquality() {
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(5), Money.dollar(8));
        assertNotEquals(null, Money.dollar(8));
        assertNotEquals(new Object(), Money.dollar(10));
    }

    @Test
    void testFrancMultiplication() {
        Franc five = Money.franc(5);

        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    void testFrancEquality() {
        assertEquals(Money.franc(5), Money.franc(5));
        assertNotEquals(Money.franc(5), Money.franc(8));
        assertNotEquals(null, Money.franc(8));
        assertNotEquals(new Object(), Money.franc(10));
    }

    @Test
    void testDollarFrancEquality() {
        assertNotEquals(Money.dollar(5), Money.franc(5));
        assertEquals(Money.dollar(5), Money.franc(10));
    }
}
