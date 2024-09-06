package org.example.domain;

public class RFNMarket implements MarketFactory {
    @Override
    public Market createMarket() {
        return new DomesticMarket();
    }
}
