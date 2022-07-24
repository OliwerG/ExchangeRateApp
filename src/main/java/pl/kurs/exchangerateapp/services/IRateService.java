package pl.kurs.exchangerateapp.services;

import pl.kurs.exchangerateapp.exceptions.InvalidInputDataException;

import java.math.BigDecimal;

public interface IRateService {

    BigDecimal getExchangeRate(String fromCurrencyMark, String toCurrencyMark) throws InvalidInputDataException;
}
