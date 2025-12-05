package ru.courses.geometry;

import java.util.Objects;

public class Line implements Cloneable {
    public Dot startDot;
    public Dot endDot;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(startDot, line.startDot) && Objects.equals(endDot, line.endDot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startDot, endDot);
    }

    @Override
    public Line clone() throws CloneNotSupportedException {
        Line line = (Line) super.clone(); //глубокое копирование
        Line lineClone = new Line(startDot, endDot);
        lineClone.startDot = this.startDot.clone();
        lineClone.endDot = this.endDot.clone();
        return lineClone;
    }
}