package com.kodilla.testing.Weather.mock;


import com.kodilla.testing.Weather.Temperatures;
import com.kodilla.testing.Weather.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {
    private Temperatures temperatures;

    //@Mock
    //private Temperatures temperaturesMock;

    @Test
    void testCalculateForecastWithMock(Object map) {
        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);


        class ListOfCity {
            private String rzeszow;
            private String krakow;
            private String wroclaw;
            private String warszawa;
            private String gdansk;

            public ListOfCity(String rzeszow, String krakow, String wroclaw, String warszawa, String gdansk) {
                this.rzeszow = rzeszow;
                this.krakow = krakow;
                this.wroclaw = wroclaw;
                this.warszawa = warszawa;
                this.gdansk = gdansk;
            }

            public String getRzeszow() {
                return rzeszow;
            }

            public String getKrakow() {
                return krakow;
            }

            public String getWroclaw() {
                return wroclaw;
            }

            public String getWarszawa() {
                return warszawa;
            }

            public String getGdansk() {
                return gdansk;
            }

            public String toString() {
                return rzeszow + " + " + krakow + " + " + wroclaw + " + " + warszawa + "+" + gdansk;
            }
        }

       // for (HashMap.Entry<WeatherForecastTestSuite, ListOfCity> entry : map.entrySet()) {
        


         /*   String rzeszow = entry.getValue().getRzeszow();
            String krakow = entry.getValue().getKrakow();
            String wroclaw = entry.getValue().getWroclaw();
            String warszawa = entry.getValue().getWarszawa();
            String gdansk = entry.getValue().getGdansk();   */




            //Map<Double> temperaturesMap = new HashMap<>();

          /*  WeatherForecast temperature1 = new WeatherForecast(25.5, temperatures);
            WeatherForecast temperature2 = new WeatherForecast(26.2, temperatures);
            WeatherForecast temperature3 = new WeatherForecast(24.8, temperatures);
            WeatherForecast temperature4 = new WeatherForecast(25.2, temperatures);
            WeatherForecast temperature5 = new WeatherForecast(26.1, temperatures);  */


            //WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

           /* Map<WeatherForecast, String> loopTemp = new HashMap<>();

            loopTemp.put(temperature1, rzeszow);
            loopTemp.put(temperature2, krakow);
            loopTemp.put(temperature3, wroclaw);
            loopTemp.put(temperature4, warszawa);
            loopTemp.put(temperature5, gdansk);   */

            //when(temperaturesMock.getTemperatures()).thenReturn(loopTemp);

         /*   int sum = Integer.parseInt(rzeszow + krakow + wroclaw + warszawa + gdansk);

            double avg = sum / 5;

            System.out.println("Sum: " + sum);
            System.out.println("Avg: " + avg);


            System.out.println("Name: " + entry.getKey() + " Grades: " + entry.getValue());


            //When

            int quantityOfSensors = weatherForecast.calculateForecast().size();

            //Then
            Assertions.assertEquals(5, quantityOfSensors);
        }*/
    }
}

