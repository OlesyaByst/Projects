package ru.test;

public class Main {
    public static void main(String[] args) {
        Fraction f1=new Fraction(-1,3);
        Fraction f2=new Fraction(2,5);
        Fraction f3=new Fraction(7,8);
        int whole=5;
        System.out.println("Дробь 1: "+f1);
        System.out.println("Дробь 2: "+f2);
        System.out.println("Дробь 3: "+f3);

        Fraction sumFraction=f1.sum(f2).sum(f3).minusWhole(whole);
        System.out.println("Результат операций="+sumFraction);

    }
}