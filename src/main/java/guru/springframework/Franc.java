package guru.springframework;

public class Franc extends Money {

    public Franc(int amount) {
        super(amount, 0.5);
    }

    @Override
    protected String currency() {
        return "CHF";
    }

    @Override
    public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

}
