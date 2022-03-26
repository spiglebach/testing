package guru.springframework;

public class Dollar extends Money {

    public Dollar(int amount) {
        super(amount, 1);
    }

    @Override
    public Money times(int multiplier) {
        return new Dollar (amount * multiplier);
    }
}
