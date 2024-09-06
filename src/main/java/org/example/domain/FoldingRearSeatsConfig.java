package org.example.domain;

public enum FoldingRearSeatsConfig {
    FORTY,
    FIFTY,
    SIXTY;

    public int getValue() {
        switch (this) {
            case FORTY:
                return 40;
            case FIFTY:
                return 50;
            case SIXTY:
                return 60;
            default:
                throw new IllegalArgumentException("Unexpected value: " + this);
        }
    }
}
