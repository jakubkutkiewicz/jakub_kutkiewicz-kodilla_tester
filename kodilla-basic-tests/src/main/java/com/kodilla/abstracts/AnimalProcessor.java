package com.kodilla.abstracts;

public class AnimalProcessor {
    public void process(Animal animal) {
        System.out.println("Animal has" + animal.getNumberOflegs() + "legs.");
        animal.getVoice();
    }
}
