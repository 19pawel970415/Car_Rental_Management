package org.example.domain;

public enum InsurenceType {

    OC (1),
    AC (2),
    ASS(3);

    private int nuberOfType;

    InsurenceType(int nuberOfType) {
        this.nuberOfType = nuberOfType;
    }

    public static InsurenceType getValueBasedOnNumber(int nuberOfType) {
        return values()[nuberOfType % values().length];
    }
}
