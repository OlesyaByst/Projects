package ru.courses.mathematics;

import java.util.List;

public class Fraction  extends Number{
    private final int numerator;
    private final int denominator;

    @Override
    public int intValue() {

        return (int) ((double) numerator/ denominator);
    }

    @Override
    public long longValue() {
        return (long) ((double) numerator/ denominator);
    }

    @Override
    public float floatValue() {
        return (float) ((double) numerator/ denominator);
    }

    @Override
    public double doubleValue() {
        return (double) numerator/ denominator;
    }

    public Fraction(int numerator, int denominator) {
        if (denominator <= 0) throw new IllegalArgumentException();
   this.numerator = numerator;
   this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
@Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    public Fraction sum(Fraction other) {
        int newNumerator = this.numerator * other.denominator + this.denominator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction minus(Fraction other) {
        int newNumerator = (this.numerator * other.denominator) - this.denominator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction plusWhole(int whole) {
        Fraction wholeNumber = new Fraction(whole, 1);
        return this.sum(wholeNumber);
    }

    public Fraction minusWhole(int whole) {
        Fraction wholeNumber = new Fraction(whole, 1);
        return this.minus(wholeNumber);
    }

    //Задание ООП 2.6 Сложение
    public static double sumAll(List<Number> values) {
        double sumAll = 0;
        Number num = 0;
        for (int i = 0; i < values.size(); i++) {
            num = values.get(i);
            sumAll += num.doubleValue();
        }
        return sumAll;
    }
}