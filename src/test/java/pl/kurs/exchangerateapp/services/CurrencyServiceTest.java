package pl.kurs.exchangerateapp.services;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.OngoingStubbing;
import pl.kurs.exchangerateapp.exceptions.InvalidInputDataException;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class CurrencyServiceTest {

    @Test
    public void shouldReturn450PlnFrom100Usd() throws InvalidInputDataException {
        String currencyFrom = "USD";
        String currencyTo = "PLN";
        IRateService rateServiceMock = Mockito.mock(IRateService.class);

        Mockito.when(rateServiceMock.getExchangeRate(currencyFrom, currencyTo)).thenReturn(BigDecimal.valueOf(4.50));

        CurrencyService currencyService = new CurrencyService(rateServiceMock);
        BigDecimal exchange = currencyService.exchange(currencyFrom, currencyTo, BigDecimal.valueOf(100));

        assertEquals(BigDecimal.valueOf(450.00), BigDecimal.valueOf(exchange.doubleValue()));

    }
}