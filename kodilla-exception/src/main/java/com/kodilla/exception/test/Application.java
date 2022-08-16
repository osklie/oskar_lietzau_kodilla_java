package com.kodilla.exception.test;

public class Application {
    public static void main(String[] args) {
        Flight berLon = new Flight("BER", "LON");
        Flight romNyc = new Flight("ROM", "NYC");
        Flight parWar = new Flight("PAR", "WAR");

        FlightSearcher flightSearcher = new FlightSearcher();

        try {
            boolean existBerLon = flightSearcher.findFlight(berLon);
            System.out.println("Flight Berlin - London: " + existBerLon);
        } catch (RouteNotFoundException e) {
            System.out.println("Please input correct airport name.");
        }

        try {
            boolean existRomNyc = flightSearcher.findFlight(romNyc);
            System.out.println("Flight Rome - New York City: " + existRomNyc);
        } catch (RouteNotFoundException e) {
            System.out.println("Please input correct airport name.");
        }

        try {
            boolean existParWar = flightSearcher.findFlight(parWar);
            System.out.println("Flight Paris - Warsaw: " + existParWar);
        } catch (RouteNotFoundException e) {
            System.out.println("Please input correct airport name.");
        }

    }
}