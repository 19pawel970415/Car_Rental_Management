package org.example.domain;

public class FrenchMarketCreator implements MarketFactory {
    @Override
    public Market createMarket() {
        return new ForeignMarket(Country.FRANCE);
    }
}
