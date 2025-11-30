package ru.courses.geometry;

public class Dot {
    public int x;
    public int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "{" + x + ";" + y + "}";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dot dot = (Dot) o;
        return this.x == dot.x && this.y == dot.y;

    }
}