package guru.springframework;

public class Money {

    protected int amount;
    protected String currency;
    protected double relativeValue;

    public static Money dollar(int amount) {
        return new Money(amount, 1, "USD");
    }

    public static Money franc(int amount) {
        return new Money(amount, .5, "CHF");
    }

    protected Money(int amount, double relativeValue, String currency) {
        this.amount = amount;
        this.relativeValue = relativeValue;
        this.currency = currency;
    }

    public Money times(int multiplier) {
        return new Money(this.amount * multiplier, this.relativeValue, this.currency);
    }

    public boolean equals(Object o) {
        if (o == null) return false;
        if (o == this) return true;
        if (o instanceof Money) {
            Money other = (Money) o;
            return other.amount * other.relativeValue == this.amount * this.relativeValue;
        }
        return false;
    }

    protected String getCurrency() {
        return currency;
    }
}
