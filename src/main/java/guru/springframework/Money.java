package guru.springframework;

public abstract class Money {

    protected int amount;
    protected double relativeValue;

    protected abstract String currency();
    protected abstract Money times(int multiplier);

    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    public static Franc franc(int amount) {
        return new Franc(amount);
    }

    protected Money(int amount, double relativeValue) {
        this.amount = amount;
        this.relativeValue = relativeValue;
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
}
