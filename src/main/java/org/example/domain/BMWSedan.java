package org.example.domain;

public class BMWSedan extends BMW {
    private TrunkDivider trunkDivider;

    public BMWSedan(BMWModel model, TrunkDivider trunkDivider) {
        super(model);
        this.trunkDivider = trunkDivider;
    }
}
