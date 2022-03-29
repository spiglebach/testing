package guru.springframework;

public class Sum implements Expression {
    Money first;
    Money second;

    public Sum(Money first, Money second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public Money reduce(Bank bank, String toCurrency) {
        return new Money(first.reduce(bank, toCurrency).amount + second.reduce(bank, toCurrency).amount, toCurrency);
    }
}
