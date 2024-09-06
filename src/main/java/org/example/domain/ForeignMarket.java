package org.example.domain;

public class ForeignMarket implements Market{
    private Country country;

    public ForeignMarket(Country country) {
        this.country = country;
    }
}
