package org.example;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int id;
    private List<Integer> grades;

    public Student(String name, int id, List<Integer> grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    // Method to print student information
    public void printInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Grades: " + grades);
    }
}

class GradeAnalyzer {
    private List<Integer> grades;

    public GradeAnalyzer(List<Integer> grades) {
        this.grades = grades;
    }

    // Method to calculate average grade
    public double calculateAverage() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    // Method to print grade summary
    public void printSummary() {
        System.out.println("Grade Summary:");
        System.out.println("Grades: " + grades);
        System.out.println("Average Grade: " + calculateAverage());
    }
}
public class l2 {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        List<Integer> gradesList = new ArrayList<>();
        gradesList.add(90);
        gradesList.add(85);
        gradesList.add(92);
        GradeAnalyzer gradeAnalyzer = new GradeAnalyzer(gradesList);
Student s=new Student("ajla",2,gradesList);
    Field[] f=s.getClass().getDeclaredFields();
    for(Field i:f){
        if(i.getName().equals("name")){
            i.setAccessible(true);
            i.set(s,"amir");
        }
        System.out.println(i);
    }
    Method[] m=s.getClass().getDeclaredMethods();
    for(Method me:m){
        if(me.getName().startsWith("print") || me.getName().startsWith("calculate")){
            me.setAccessible(true);
            me.invoke(s);
        }

        System.out.println(me.getName());
    }
    }
}
