package org.example.domain;

public class FrenchMarket implements MarketFactory {
    @Override
    public Market createMarket() {
        return new ForeignMarket();
    }
}
