package pl.kurs.exchangerateapp.services;

import pl.kurs.exchangerateapp.exceptions.InvalidInputDataException;

import java.math.BigDecimal;

public class CurrencyService implements ICurrencyService {

    private IRateService rateService;

    public CurrencyService(IRateService rateService) {
        this.rateService = rateService;
    }

    @Override
    public BigDecimal exchange(String currencyFrom, String currencyTo, BigDecimal amount) throws InvalidInputDataException {
        if (currencyFrom.isEmpty() || currencyTo.isEmpty())
            throw new InvalidInputDataException("Przekazano błędne dane!");
        if (amount.doubleValue() < 0)
            throw new InvalidInputDataException("Wartość nie może być ujemna!");

        BigDecimal rate = rateService.getExchangeRate(currencyFrom, currencyTo);
        return rate.multiply(amount);
    }
}
