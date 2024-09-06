package org.example.domain;

public class BMWWagon extends BMW {
    private CargoCover cargoCover;

    public BMWWagon(BMWModel model, CargoCover cargoCover) {
        super(model);
        this.cargoCover = cargoCover;
    }
}
