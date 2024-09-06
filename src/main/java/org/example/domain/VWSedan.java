package org.example.domain;

public class VWSedan extends VW {
    private TrunkDivider trunkDivider;

    public VWSedan(VWModel model, TrunkDivider trunkDivider) {
        super(model);
        this.trunkDivider = trunkDivider;
    }
}
