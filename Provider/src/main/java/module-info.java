import org.currency.exchange.ExchangeRate;
import org.currency.provide.amount.Amount;
import org.currency.provide.sek.ToUSD;

module org.currency.provider {
    exports org.currency.provide.amount;
    exports org.currency.provide.sek;
    requires org.currency.currencies;
    provides ExchangeRate with ToUSD;
    provides Amount with Amount;
}