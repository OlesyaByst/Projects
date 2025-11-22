package ru.test;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        Fraction f1 = new Fraction(-1, 3);
        Fraction f2 = new Fraction(2, 5);
        Fraction f3 = new Fraction(7, 8);
        int whole = 5;
        System.out.println("Дробь 1: " + f1);
        System.out.println("Дробь 2: " + f2);
        System.out.println("Дробь 3: " + f3);

        Fraction sumFraction = f1.sum(f2).sum(f3).minusWhole(whole);
        System.out.println("Результат операций=" + sumFraction);

        System.out.println("---------");
        System.out.println("Задание 2");
        Student student1 = new Student("Стас");
        student1.addGrade(2);
        student1.addGrade(3);
        student1.addGrade(1);
        student1.addGrade(5);
        System.out.println(student1.toString());

        List<Integer> stas = student1.getGrades();//получение оценок через геттер
        System.out.println(stas.toString());
    }
}