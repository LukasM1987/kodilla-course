package com.kodilla.good.paterns.flights;

public enum City {

    WARSAW ("WARSAW"),
    PARIS ("PARIS"),
    BERLIN ("BERLIN"),
    WROCLAW ("WROCLAW"),
    LONDON ("LONDON"),
    OSLO ("OSLO"),
    NEW_YORK ("NEW YORK");

    private String city;

    City(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}
