package guru.springframework;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    Map<CurrencyPair, Integer> rates = new HashMap<>();

    Money reduce(Expression source, String toCurrency) {
        return source.reduce(this, toCurrency);
    }

    public void addRate(String from, String to, int rate) {
        rates.put(new CurrencyPair(from, to), rate);
    }

    public int rate(String from, String to) {
        return from.equals(to) ? 1 : rates.getOrDefault(new CurrencyPair(from, to), 1);
    }
}
