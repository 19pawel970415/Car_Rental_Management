package org.example.domain;

public interface CarFactory {
    Car createSedan(Model model, TrunkDivider trunkDivider);
    Car createHatchback(Model model, FoldingRearSeatsConfig foldingRearSeatsConfig);
    Car createWagon(Model model, CargoCover cargoCover);
}
