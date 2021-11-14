package com.kodilla.good.paterns.flights;

public class FlightRunner {

    public static void main(String[] args) {
        Searcher searcher = new Searcher();

        searcher.findByArrival(City.LONDON.getCity());

        searcher.findByDeparture(City.WARSAW.getCity());

        searcher.findByVia(City.PARIS.getCity());
    }
}
