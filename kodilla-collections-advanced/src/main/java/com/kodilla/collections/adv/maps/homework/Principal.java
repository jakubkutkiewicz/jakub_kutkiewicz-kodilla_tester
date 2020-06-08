package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String directorName;
    private String directorSurname;

    public Principal(String directorName, String directorSurname) {
        this.directorName=directorName;
        this.directorSurname=directorSurname;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "directorName='" + directorName + '\'' +
                ", directorSurname='" + directorSurname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(directorName, principal.directorName) &&
                Objects.equals(directorSurname, principal.directorSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(directorName, directorSurname);
    }

    public String getDirectorSurname() {
        return directorSurname;
    }

    public String getDirectorName() {
        return directorName;
    }
}
