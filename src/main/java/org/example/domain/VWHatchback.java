package org.example.domain;

public class VWHatchback extends VW {
    private FoldingRearSeatsConfig foldingRearSeatsConfig;

    public VWHatchback(VWModel model, FoldingRearSeatsConfig foldingRearSeatsConfig) {
        super(model);
        this.foldingRearSeatsConfig = foldingRearSeatsConfig;
    }
}
