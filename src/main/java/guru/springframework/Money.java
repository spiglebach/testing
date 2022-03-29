package guru.springframework;

public class Money implements Expression {

    protected int amount;
    protected String currency;

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    protected Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money times(int multiplier) {
        return new Money(this.amount * multiplier, this.currency);
    }

    public Expression plus(Money added) {
        return new Sum(this, added);
    }

    public boolean equals(Object o) {
        if (o == null) return false;
        if (o == this) return true;
        if (o instanceof Money) {
            Money other = (Money) o;
            return other.amount == this.amount && this.currency.equals(other.currency);
        }
        return false;
    }

    protected String getCurrency() {
        return currency;
    }

    @Override
    public Money reduce(String to) {
        return this;
    }
}
