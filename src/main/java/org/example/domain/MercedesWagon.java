package org.example.domain;

public class MercedesWagon extends Mercedes {
    private CargoCover cargoCovers;

    public MercedesWagon(MercedesModel model, CargoCover cargoCovers) {
        super(model);
        this.cargoCovers = cargoCovers;
    }
}
