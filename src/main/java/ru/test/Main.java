package ru.test;
import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        System.out.println("Задание ООП. Инкапсуляция #1. Дробь ");
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
        System.out.println("Задание ООП. Инкапсуляция #3. Студент");
        Student student1 = new Student("Стас");
        student1.addGrade(2);
        student1.addGrade(3);
        student1.addGrade(1);
        student1.addGrade(5);
        System.out.println(student1.toString());

        List<Integer> stas = student1.getGrades();//получение оценок через геттер
        System.out.println(stas.toString());

        System.out.println("---------");
        System.out.println("Задание ООП. Полиморфизм #5. Дробь это число");
        Fraction f4 = new Fraction(10, 3);
        System.out.println(f4.intValue());
        System.out.println(f4.doubleValue());
        System.out.println(f4.floatValue());
        System.out.println(f4.longValue());

        System.out.println("---------");
        System.out.println("Задание ООП. Полиморфизм #6. Сложение");
        Number num1=2.3;
        Number num2=3.6;
        Number num3=num1.intValue(); //2
        Number num4=num2.intValue(); //3
        Number num5=1;

        Fraction f5 = new Fraction(num2.intValue(), 5); // 3/5
        Fraction f6 = new Fraction(49, 12);
        Fraction f7 = new Fraction(num4.intValue(),num3.intValue()); // 3/2
        Fraction f8 = new Fraction(num5.intValue(),num4.intValue()); // 1/3

        List<Number> numbers1 = new ArrayList<>();
        numbers1.add(num1);
        numbers1.add(f5);
        numbers1.add(num3);
        System.out.println("Первый результат сложения = "+Fraction.sumAll(numbers1));

        List<Number> numbers2 = new ArrayList<>();
        numbers2.add(f7);
        numbers2.add(num4);
        numbers2.add(num2);
        numbers2.add(f6);
        System.out.println("Второй результат сложения = "+Fraction.sumAll(numbers2));

        List<Number> numbers3 = new ArrayList<>();
        numbers3.add(num5);
        numbers3.add(f8);
        System.out.println("Третий результат сложения = "+Fraction.sumAll(numbers3));
    }
}