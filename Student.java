package com.hello.world.home;

public class Student {
    public String name;
    public String surname;
    public int[] grade;

    public Student() {
    }

    public Student(String name, String surname, int[] grade) {
        super();
        this.name = name;
        this.surname = surname;
        this.grade = grade;

    }


    public double getAvg() {

        double sumAvg = 0;

        for (int i = 0; i < grade.length; i++) {
            //sumAvg += grade[i];
            sumAvg = sumAvg + grade[i];
        }
        return sumAvg / grade.length;
    }

    public int getMax() {
        int max = grade[0];

        for (int i = 1; i < grade.length; i++) {
            if (max < grade[i]) {
                max = grade[i];
            }
        }
        return max;
    }

    public int getMin() {
        int min = grade[0];

        for (int i = 1; i < grade.length; i++) {
            if (min > grade[i]) {
                min = grade[i];
            }
        }
        return min;
    }
}
