package pl.kurs.exchangerateapp.services;

import pl.kurs.exchangerateapp.exceptions.InvalidInputDataException;

public interface IUrlStringBuilder {
    String buildUrl(String currencyParameter) throws InvalidInputDataException;
}
