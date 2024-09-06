package org.example.domain;

public class VWFactory implements CarFactory {

    @Override
    public Car createSedan(Model model, TrunkDivider trunkDivider) {
        return new VWSedan((VWModel) model, trunkDivider);
    }

    @Override
    public Car createHatchback(Model model, FoldingRearSeatsConfig foldingRearSeatsConfig) {
        return new VWHatchback((VWModel) model, foldingRearSeatsConfig);
    }

    @Override
    public Car createWagon(Model model, CargoCover cargoCover) {
        return new VWWagon((VWModel) model, cargoCover);
    }
}
