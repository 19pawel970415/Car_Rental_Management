package org.example.domain;

public class MercedesFactory implements CarFactory{

    @Override
    public Car createSedan() {
        return new MercedesSedan();
    }

    @Override
    public Car createHatchback() {
        return new MercedesHatchback();
    }

    @Override
    public Car createWagon() {
        return new MercedesWagon();
    }
}
