package guru.springframework;

public class Dollar {

    public Dollar(int amount) {
        this.amount = amount;
    }

    public int amount;

    public void times(int multiplier) {
        amount *= multiplier;
    }
}
