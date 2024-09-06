package org.example.domain;

import java.util.Arrays;

public class RFNMarketCreator implements MarketFactory {
    @Override
    public Market createMarket() {
        return new DomesticMarket(
                Arrays.asList(
                        Bundesland.BADEN_WUERTTEMBERG,
                        Bundesland.BAVARIA,
                        Bundesland.BREMEN,
                        Bundesland.HAMBURG,
                        Bundesland.HESSE,
                        Bundesland.LOWER_SAXONY,
                        Bundesland.NORTH_RHINE_WESTPHALIA,
                        Bundesland.RHEINLAND_PALATINATE,
                        Bundesland.SAARLAND,
                        Bundesland.SCHLESWIG_HOLSTEIN
                )
        );
    }
}
