package ru.courses;
import ru.courses.geometry.*;
import ru.courses.mathematics.Fraction;
import ru.courses.mathematics.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void printObject(Measurable measurableObject) {
        System.out.println(measurableObject.getLength());
    }

    public static void main(String[] args) {
        Dot dot1 = new Dot(1, 3);
        Dot dot2 = new Dot(1, 3);
        Dot dot3 = new Dot(5, 8);
        Dot dot4 = new Dot(10, 11);
        Dot dot5 = new Dot(15, 19);

        System.out.println("Задание 1");
        System.out.println("Dot1" + dot1);
        System.out.println("Dot2" + dot2);
        System.out.println("Dot3" + dot3);

        System.out.println(dot1.equals(dot2));
        System.out.println(dot1.equals(dot3));
        System.out.println(dot2.equals(dot3));

        //Задача 2
        Line line1 = new Line(dot1, dot3);
        Line line2 = new Line(dot4, dot5);
        Line line3 = new Line(dot3, dot4);
        System.out.println(" ");
        System.out.println("Задание 2");
        System.out.println("Линия 3 " + line1);

        dot3.x = 20;
        dot3.y = 25;
        dot4.x = 30;
        dot4.y = 35;
        System.out.println("Линия 3 после изменений " + line3);

        double lenghtAllLines = line1.getLength() + line2.getLength() + line3.getLength();
        System.out.println("Длина всех линий: " + lenghtAllLines);

        //Задание 3
        Dot dot6 = new Dot(1, 5);
        Dot dot7 = new Dot(2, 8);
        Dot dot8 = new Dot(5, 3);
        Dot dot9 = new Dot(8, 9);

        PolyLine polyLine = new PolyLine();
        polyLine.addDots(dot6);
        polyLine.addDots(dot7);
        polyLine.addDots(dot8);
        polyLine.addDots(dot9);
        System.out.println(" ");
        System.out.println("Задание 3");
        System.out.println(polyLine);

        double lenghtPolyLines = polyLine.getLength();
        System.out.println("Длина Ломаной: " + lenghtPolyLines);

        List<Line> lines = polyLine.getLines();
        double massLines = 0;
        for (Line line : lines) {
            massLines += line.getLength();
        }
        System.out.println("Массив ломанной: " + massLines);
        System.out.println("Длины совпадают? " + (Math.abs(lenghtPolyLines - massLines) < 0.0001));

        dot7.x = 12;
        System.out.println(" ");
        System.out.println("Новая точка: " + dot7);
        System.out.println("Ломаная после изменений: " + polyLine);
        System.out.println("Конец первой линии массива: " + lines.get(0).endDot.toString());
        System.out.println("Начало второй линии массива: " + lines.get(1).startDot.toString());
        System.out.println("Длина ломанной после изменений: " + polyLine.getLength());

        System.out.println("-------------");
        System.out.println("Задание ООП 2");
        ClosedPolyLine closedPolyLine = new ClosedPolyLine(polyLine.dots);
        System.out.println(closedPolyLine.getLength());

        printObject(polyLine);
        printObject(closedPolyLine);

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