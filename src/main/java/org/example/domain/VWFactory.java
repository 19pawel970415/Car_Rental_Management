package org.example.domain;

public class VWFactory implements CarFactory {
    @Override
    public Car createSedan() {
        return new VWSedan();
    }

    @Override
    public Car createHatchback() {
        return new VWHatchback();
    }

    @Override
    public Car createWagon() {
        return new MercedesWagon();
    }
}
