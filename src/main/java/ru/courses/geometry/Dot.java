package ru.courses.geometry;

import java.util.Objects;

public class Dot implements Cloneable {
    public int x;
    public int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "{" + x + ";" + y + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dot dot = (Dot) o;
        return this.x == dot.x && this.y == dot.y;

    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public Dot clone() throws CloneNotSupportedException {
        return (Dot) super.clone();
    }
}