package com.kodilla.good.paterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Searcher {

    private static final FlightRepository flightRepository = new FlightRepository();

    private List<Flight> arrivalFlights = new ArrayList<>();
    private List<Flight> departureFlights = new ArrayList<>();
    private List<Flight> viaFlightsDeparture = new ArrayList<>();
    private List<Flight> viaFlightsArrival = new ArrayList<>();

    public void findByArrival(String arrival) {
        arrivalFlights = flightRepository.getFlights().stream()
                .filter(f -> f.getArrivalCity().equals(arrival))
                .collect(Collectors.toList());
        printArrival();
    }

    public void findByDeparture(String departure) {
        departureFlights = flightRepository.getFlights().stream()
                .filter(f -> f.getDepartureCity().equals(departure))
                .collect(Collectors.toList());
        printDeparture();
    }

    public void findByVia(String via) {
        viaFlightsDeparture = flightRepository.getFlights().stream()
                .filter(f -> f.getArrivalCity().equals(via))
                .collect(Collectors.toList());
        viaFlightsArrival = flightRepository.getFlights().stream()
                .filter(f -> f.getDepartureCity().equals(via))
                .collect(Collectors.toList());
        printVia();
    }

    private void printArrival() {
        try {
            if (arrivalFlights.size() > 0) {
                System.out.println("ARRIVAL:");
                for (Flight flight : arrivalFlights) {
                    System.out.println(flight);
                }
            } else {
                throw new FlightNotExistException("Connection does not exist");
            }
        } catch (FlightNotExistException ignored) {

        }
    }

    private void printDeparture() {
        try {
            if (departureFlights.size() > 0) {
                System.out.println("\nDEPARTURE:");
                for (Flight flight : departureFlights) {
                    System.out.println(flight);
                }
            } else {
                throw new FlightNotExistException("Connection does not exist");
            }
        } catch (FlightNotExistException ignored) {

        }
    }

    private void printVia() {
        try {
            System.out.println("\nVIA:");
            if (viaFlightsDeparture.size() > 0 && viaFlightsArrival.size() > 0) {
                for (Flight departure : viaFlightsDeparture) {
                    System.out.println(departure);
                }
                for (Flight arrival : viaFlightsArrival) {
                    System.out.println(arrival);
                }
            } else {
                throw new FlightNotExistException("Connection does not exist");
            }
        } catch (FlightNotExistException ignored) {

        }
    }
}
