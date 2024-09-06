package org.example.domain;

public class NRDMarket implements MarketFactory {
    @Override
    public Market createMarket() {
        return new DomesticMarket();
    }
}
