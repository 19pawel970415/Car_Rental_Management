package org.example.domain;

public class BMWFactory implements CarFactory {

    @Override
    public Car createSedan(Model model, TrunkDivider trunkDivider) {
        return new BMWSedan((BMWModel) model, trunkDivider);
    }

    @Override
    public Car createHatchback(Model model, FoldingRearSeatsConfig foldingRearSeatsConfig) {
        return new BMWHatchback((BMWModel) model, foldingRearSeatsConfig);
    }

    @Override
    public Car createWagon(Model model, CargoCover cargoCover) {
        return new BMWWagon((BMWModel) model, cargoCover);
    }
}
