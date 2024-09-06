package org.example.db;

import org.example.domain.Market;

import java.util.ArrayList;
import java.util.List;

public class MarketsRepo {
    private List<Market> markets;

    public MarketsRepo(List<Market> markets) {
        this.markets = markets;
    }

    private static MarketsRepo MARKETS_REPO_INSTANCE = new MarketsRepo(new ArrayList<>());

    public static MarketsRepo getInstance() {
        return MARKETS_REPO_INSTANCE;
    }
}
