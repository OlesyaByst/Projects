package ru.courses.geometry;

public class Point3D extends Dot {
    int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}