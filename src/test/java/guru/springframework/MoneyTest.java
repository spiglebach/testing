package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class MoneyTest {

    @Test
    void testMultiplication() {
        Money fiveDollar = Money.dollar(5);

        assertEquals(Money.dollar(10), fiveDollar.times(2));
        assertEquals(Money.dollar(15), fiveDollar.times(3));

        Money fiveFranc = Money.franc(5);
        assertEquals(Money.franc(10), fiveFranc.times(2));
        assertEquals(Money.franc(15), fiveFranc.times(3));
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

    @Test
    void testCurrency() {
        assertEquals("USD", Money.dollar(1).getCurrency());
        assertEquals("CHF", Money.franc(1).getCurrency());
    }
}
