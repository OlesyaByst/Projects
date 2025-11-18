package ru.test;

public class Fraction {
    private final int numerator;
    private final int denominator;

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

    public String toString() {
        return numerator + "/" + denominator;
    }

    public Fraction sum(Fraction other) { //other вторая дробь
        int newNumerator = this.numerator * other.denominator + this.denominator * other.numerator;
        int newDenominator = this.denominator * other.denominator;//перемножение знаменателей
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction minus(Fraction other) {
        int newNumerator = (this.numerator * other.denominator) - this.denominator * other.numerator;
        int newDenominator = this.denominator * other.denominator;//перемножение знаменателей
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction plusWhole(int whole) {
        Fraction wholeNumber = new Fraction(whole, 1);
        return this.sum(wholeNumber); //this вернуть текущий объект класса plus
    }

    public Fraction minusWhole(int whole) {
        Fraction wholeNumber = new Fraction(whole, 1);
        return this.minus(wholeNumber);
    }
}