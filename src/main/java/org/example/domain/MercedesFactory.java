package org.example.domain;

public class MercedesFactory implements CarFactory {

    @Override
    public Car createSedan(Model model, TrunkDivider trunkDivider) {
        return new MercedesSedan((MercedesModel) model, trunkDivider);
    }

    @Override
    public Car createHatchback(Model model, FoldingRearSeatsConfig foldingRearSeatsConfig) {
        return new MercedesHatchback((MercedesModel) model, foldingRearSeatsConfig);
    }

    @Override
    public Car createWagon(Model model, CargoCover cargoCover) {
        return new MercedesWagon((MercedesModel) model, cargoCover);
    }
}
