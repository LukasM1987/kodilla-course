package com.kodilla.good.paterns.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightRepository {

    private Set<Flight> flights = new HashSet<>();

    public FlightRepository() {
        flights.add(new Flight(City.WARSAW.getCity(), City.BERLIN.getCity()));
        flights.add(new Flight(City.NEW_YORK.getCity(), City.LONDON.getCity()));
        flights.add(new Flight(City.BERLIN.getCity(), City.NEW_YORK.getCity()));
        flights.add(new Flight(City.OSLO.getCity(), City.WROCLAW.getCity()));
        flights.add(new Flight(City.LONDON.getCity(), City.OSLO.getCity()));
        flights.add(new Flight(City.PARIS.getCity(), City.WARSAW.getCity()));
        flights.add(new Flight(City.NEW_YORK.getCity(), City.PARIS.getCity()));
        flights.add(new Flight(City.WARSAW.getCity(), City.WROCLAW.getCity()));
        flights.add(new Flight(City.PARIS.getCity(), City.BERLIN.getCity()));
    }

    public Set<Flight> getFlights() {
        return flights;
    }
}
