package operationsUnitTesting;

import org.junit.jupiter.api.Test;

import operationsLibrary.TemperatureConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureUnitTesting {

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0.0));
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32.0));
    }
}
