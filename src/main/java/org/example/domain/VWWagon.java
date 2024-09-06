package org.example.domain;

public class VWWagon extends VW {
    private CargoCover cargoCovers;

    public VWWagon(VWModel model, CargoCover cargoCovers) {
        super(model);
        this.cargoCovers = cargoCovers;
    }
}
