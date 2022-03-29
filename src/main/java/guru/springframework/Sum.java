package guru.springframework;

public class Sum implements Expression {
    Money first;
    Money second;

    public Sum(Money first, Money second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public Money reduce(String toCurrency) {
        return new Money(first.amount + second.amount, toCurrency);
    }
}
