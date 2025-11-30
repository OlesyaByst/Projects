package ru.courses.geometry;

public class Line implements Measurable {
    public final Dot startDot;
    public final Dot endDot;

    public Line(Dot startDot, Dot endDot) {
        this.startDot = startDot;
        this.endDot = endDot;
    }

    public String toString() {
        return "{" + startDot + endDot + ";";
    }

    public double getLength() {
        double deltaX = endDot.x - startDot.x;
        double deltaY = endDot.y - startDot.y;
        double length = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        return Math.sqrt(length);
    }
}