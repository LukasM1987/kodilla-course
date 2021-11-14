package com.kodilla.good.paterns.flights;

public class FlightNotExistException extends Exception {

    public FlightNotExistException(final String message) {
        super(message);
    }
}
