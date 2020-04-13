package org.palfoldesi.structural.flyweight;

import java.util.Objects;

public class Size {
    private final double length;
    private final double height;
    private final String unit;

    public Size(double length, double height, String unit) {
        this.length = length;
        this.height = height;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Size size = (Size) o;
        return Double.compare(size.length, length) == 0 &&
                Double.compare(size.height, height) == 0 &&
                unit.equals(size.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, height, unit);
    }

    @Override
    public String toString() {
        return "length=" + length +
                ", height=" + height +
                ", unit='" + unit + '\'';
    }
}
