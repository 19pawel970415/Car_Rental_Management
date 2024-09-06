package org.example.domain;

import java.util.Arrays;

public class NRDMarketCreator implements MarketFactory {
    @Override
    public Market createMarket() {
        return new DomesticMarket(
                Arrays.asList(
                        Bundesland.BERLIN,
                        Bundesland.BRANDENBURG,
                        Bundesland.MECKLENBURG_VORPOMMERN,
                        Bundesland.SAXONY,
                        Bundesland.SAXONY_ANHALT,
                        Bundesland.THURINGIA
                )
        );
    }
}
