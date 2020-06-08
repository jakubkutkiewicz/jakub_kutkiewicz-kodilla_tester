package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolDirectory = new HashMap<>();
        Principal adam = new Principal("Adam", "Kowalski");
        Principal jurek = new Principal("Jerzy", "Nowak");
        Principal stefan = new Principal("Stefan", "Wąs");

        School zs12 = new School("zs12", 12, 12, 12);
        School zs13 = new School("zs13", 13, 13, 13);
        School zs8 = new School("zs8", 8, 8, 8);

        schoolDirectory.put(jurek, zs8);
        schoolDirectory.put(adam, zs13);
        schoolDirectory.put(stefan, zs12);


        for (Map.Entry<Principal, School> principalSchoolEntry : schoolDirectory.entrySet()) {
            System.out.println(principalSchoolEntry.getKey().getDirectorName() + " "
                    + principalSchoolEntry.getKey().getDirectorSurname() + principalSchoolEntry.getValue().getNameSchool() +
                    " liczba uczniów " + principalSchoolEntry.getValue().getSumofStudents());
        }
    }
}
