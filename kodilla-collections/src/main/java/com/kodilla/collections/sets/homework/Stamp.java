package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double stampSize;
    private String stampStamp;

    public Stamp(String stampName, double stampSize, String stampStamp) {
        this.stampName = stampName;
        this.stampSize = stampSize;
        this.stampStamp = stampStamp;
    }

    public String getStampName() {
        return stampName;
    }

    public double getStampSize() {
        return stampSize;
    }

    public String getStampStamp() {
        return stampStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.stampSize, stampSize) == 0 &&
                Objects.equals(stampName, stamp.stampName) &&
                Objects.equals(stampStamp, stamp.stampStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampSize, stampStamp);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampSize=" + stampSize +
                ", stampStamp='" + stampStamp + '\'' +
                '}';
    }
}
