package ru.courses.geometry;

import java.util.ArrayList;
import java.util.List;

public class PolyLine implements Measurable {
    public List<Dot> dots;

    public PolyLine() {
        this.dots = new ArrayList<>();
    }

    public PolyLine(List<Dot> dots) {
        this.dots = dots;
    }

    public void addDots(Dot d) {
        this.dots.add(d);
    }

    //массив линий
    public List<Line> getLines() {
        List<Line> lines = new ArrayList<>();
        for (int i = 0; i < dots.size() - 1; i++) {
            lines.add(new Line(dots.get(i), dots.get(i + 1)));
        }
        return lines;
    }

    //  вернуть  длину
    @Override
    public double getLength() {
        double totalLength = 0;
        for (int i = 0; i < dots.size() - 1; i++) {
            Line segment = new Line(dots.get(i), dots.get(i + 1));
            totalLength += segment.getLength();
        }
        return totalLength;
    }

    public String toString() {
        return "Линия [" + dots.toString() + "]";
    }
}
