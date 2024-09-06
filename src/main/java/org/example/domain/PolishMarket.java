package org.example.domain;

public class PolishMarket implements MarketFactory {
    @Override
    public Market createMarket() {
        return new ForeignMarket();
    }
}
