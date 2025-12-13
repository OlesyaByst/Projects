package ru.courses.geometry;

import java.util.List;

public class ClosedPolyLine extends PolyLine { //замыкаем кривую линию
    public ClosedPolyLine(List<Point> dots) {
        super(dots);
    }

    @Override
    public double getLength() {
        double polyLineLength = super.getLength();

        Point firstDot = dots.get(0);
        Point lastDot = dots.get(dots.size() - 1);
        Line closingSegmentLenght = new Line(lastDot, firstDot);
        double closedPolyLine = closingSegmentLenght.getLength();
        return polyLineLength + closedPolyLine;
    }
}
