public class CurrencyPair {
    private String fromCurrency;
    private String toCurrency;

    public CurrencyPair(String fromCurrency, String toCurrency) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public static CurrencyPair fromChoice(int choice) {
        switch (choice) {
            case 1: return new CurrencyPair("USD", "EUR");
            case 2: return new CurrencyPair("EUR", "USD");
            case 3: return new CurrencyPair("USD", "BRL");
            case 4: return new CurrencyPair("BRL", "USD");
            case 5: return new CurrencyPair("EUR", "BRL");
            case 6: return new CurrencyPair("BRL", "EUR");
            default: return null;
        }
    }
}