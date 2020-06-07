package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
      Set<Stamp>stamps = new HashSet<>();
      stamps.add(new Stamp("motyl",10,"ostemplownay"));
      stamps.add(new Stamp("motyl",10,"ostemplownay"));
      stamps.add(new Stamp("ptak",2,"ostemplownay"));
      stamps.add(new Stamp("ptak",2,"ostemplownay"));
      stamps.add(new Stamp("ptak",2,"ostemplownay"));


        for (Stamp stamp: stamps)
            System.out.println(stamp);
    }
}
