package org.example.domain;

import java.util.List;

public class DomesticMarket implements Market{
    private List<Bundesland> bundeslands;

    public DomesticMarket(List<Bundesland> bundeslands) {
        this.bundeslands = bundeslands;
    }
}
