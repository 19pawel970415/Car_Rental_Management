package org.example.domain;

public class PolishMarketCreator implements MarketFactory {
    @Override
    public Market createMarket() {
        return new ForeignMarket(Country.POLAND);
    }
}
