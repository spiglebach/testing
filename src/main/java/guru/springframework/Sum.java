package guru.springframework;

public class Sum implements Expression {
    Expression first;
    Expression second;

    public Sum(Expression first, Expression second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public Expression times(int multiplier) {
        return new Sum(first.times(multiplier), second.times(multiplier));
    }

    @Override
    public Expression plus(Expression added) {
        return new Sum(this, added);
    }

    @Override
    public Money reduce(Bank bank, String toCurrency) {
        int amount = first.reduce(bank, toCurrency).amount + second.reduce(bank, toCurrency).amount;
        return new Money(amount, toCurrency);
    }
}
