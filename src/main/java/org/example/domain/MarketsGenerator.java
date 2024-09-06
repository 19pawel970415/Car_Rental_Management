package org.example.domain;

import org.example.db.MarketsRepo;

import java.util.Arrays;

public class MarketsGenerator {
    private static final PolishMarketCreator POLISH_FACTORY = new PolishMarketCreator();
    private static final FrenchMarketCreator FRENCH_FACTORY = new FrenchMarketCreator();
    private static final NRDMarketCreator NRD_FACTORY = new NRDMarketCreator();
    private static final RFNMarketCreator RFN_FACTORY = new RFNMarketCreator();

    public static void generateMarkets() {
        Market polishMarket = POLISH_FACTORY.createMarket();
        Market frenchMarket = FRENCH_FACTORY.createMarket();
        Market NRDMarket = NRD_FACTORY.createMarket();
        Market RFNMarket = RFN_FACTORY.createMarket();

        MarketsRepo.getInstance().setMarkets(
                Arrays.asList(
                        polishMarket,
                        frenchMarket,
                        NRDMarket,
                        RFNMarket
                )
        );
    }
}
