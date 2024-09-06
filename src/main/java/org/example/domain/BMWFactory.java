package org.example.domain;

public class BMWFactory implements CarFactory {

    @Override
    public Car createSedan() {
        return new BMWSedan();
    }

    @Override
    public Car createHatchback() {
        return new BMWHatchback();
    }

    @Override
    public Car createWagon() {
        return new BMWWagon();
    }
}
