package org.example.domain;

public class MercedesSedan extends Mercedes {
    private TrunkDivider trunkDivider;

    public MercedesSedan(MercedesModel model, TrunkDivider trunkDivider) {
        super(model);
        this.trunkDivider = trunkDivider;
    }
}
