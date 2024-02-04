package org.example;

import java.math.BigDecimal;
import java.util.Arrays;

public class Student {

    private final String name;
    private int[] marks;

    public Student(String name, int[] marks) {
        this.name=name;
        this.marks = marks;
    }

    public int getNumberOfMarks() {
        return marks.length;
    }

    public int getTotalMarks() {
        int sum = 0;
        for(int mark:marks){
            sum = sum + mark;
        }
        return sum;
    }


    public int getMaximumMarks() {
        Arrays.sort(marks);
        int mark = marks[marks.length - 1];
        return mark;
    }

    public int getMinimumMarks() {
        Arrays.sort(marks);
        int mark = marks[0];
        return mark;
    }

    public BigDecimal getAvgMarks() {
        int sum = 0;
        for(int mark:marks){
            sum = sum + mark;
        }
        return BigDecimal.valueOf((sum/marks.length));

    }
}
