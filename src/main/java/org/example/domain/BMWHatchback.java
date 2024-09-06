package org.example.domain;

public class BMWHatchback extends BMW {
    private FoldingRearSeatsConfig foldingRearSeatsConfig;

    public BMWHatchback(BMWModel model, FoldingRearSeatsConfig foldingRearSeatsConfig) {
        super(model);
        this.foldingRearSeatsConfig = foldingRearSeatsConfig;
    }
}
