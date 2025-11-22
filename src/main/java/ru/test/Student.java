package ru.test;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String name;
    private final List<Integer> grades;

    public Student(String name){
        this.name=name;
        this.grades=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return List.copyOf(grades);
    }

    public void addGrade(int grade) {
        if(grade>=2 && grade<=5){
            this.grades.add(grade);
        }
    }

    public String toString() {
        return name + grades.toString();
    }



}
