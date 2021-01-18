package com.kodilla.testing.weather.stub;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double averageTemperature() {

        Collection<Double> temps = this.temperatures.getTemperatures().values();

        double sum = 0;
        for (Double i : temps) {
            sum += i;
        }
        return sum / temps.size();
    }

    public double medianTemperature() {

        final double result;
        Double[] tab = new Double[temperatures.getTemperatures().size()];
        int i = 0;

        for (Double temperature : temperatures.getTemperatures().values()) {
            tab[i] = temperature;
            i++;
        }
        Arrays.sort(tab);

        if (tab.length % 2 == 0) {
            result = (tab[tab.length / 2] + tab[tab.length / 2 - 1]) / 2;
        } else {
            result = tab[tab.length / 2];
        }
        return result;
    }
}

