package org.example.domain;

public class MercedesHatchback extends Mercedes {
    private FoldingRearSeatsConfig foldingRearSeatsConfig;

    public MercedesHatchback(MercedesModel model, FoldingRearSeatsConfig foldingRearSeatsConfig) {
        super(model);
        this.foldingRearSeatsConfig = foldingRearSeatsConfig;
    }
}
