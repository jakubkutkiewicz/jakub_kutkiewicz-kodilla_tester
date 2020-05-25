package com.kodilla.abstracts;

public abstract class Animal {
    private int numberOflegs;

    public Animal(int numberOflegs) {
        this.numberOflegs = numberOflegs;
    }

    public int getNumberOflegs() {
        return numberOflegs;
    }

    public abstract void getVoice();
}

