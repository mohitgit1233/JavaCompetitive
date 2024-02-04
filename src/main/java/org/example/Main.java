package org.example;

import java.math.BigDecimal;
import java.sql.Array;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        MyChar myChar = new MyChar('!');
        System.out.println(myChar.isAlphabet());

        System.out.println(myChar.getSumOfDigits(12345));

        String nums = "";
        int number = 243;
        while(number > 0){
            nums = nums + Integer.toString(number%10);
            number = number/10;
        }

        int result = Integer.parseInt(nums);
//        System.out.println(result);

        String name = "Mohit is a coder";

        System.out.println("Done ==>" +myChar.sumOfOddandEvens(123456));

        name.charAt(5);
        name.contains("is");
        name.indexOf("c");
        name.lastIndexOf("c");
//        name.startsWith("") ; name.endsWith("")
        name.isEmpty();
        System.out.println(name.equals("Mohit is a coder"));// ----> true
        name.toLowerCase();
        name.toUpperCase();


       String name2 = String.valueOf(name);

        StringBuffer str = new StringBuffer();

        // String buffer is a synchronised class and is thread safe
        // , string builder is good for single threaded app

        //Wrapper classes give methods to manipulate primitive type value
        // and these classes are used in collections

        Integer in = Integer.parseInt("33");

        // '==' will compare the address of objects and not value
        // .equals compares the values of the object


        Character.isDigit(name.charAt(4));

        //Array
          int[] marks = {75,60,56,34};

          int sum =0;
          for(int mark:marks){
              sum = sum + mark;
          }

          boolean[] isTrue = new boolean[5];
          isTrue[1] = false;

        System.out.println(Arrays.toString(marks)); // --> gives actual array
        System.out.println(marks); //--> gives array location

        Arrays.sort(marks); // --> sort arrays
        System.out.println("marks : " + marks[marks.length-2]);

        Student student = new Student("Mohit",marks);

        int number1 = student.getNumberOfMarks();
        int sum1 = student.getTotalMarks();
        int maxMark = student.getMaximumMarks();
        int minMark = student.getMinimumMarks();
        BigDecimal avgMarks = student.getAvgMarks();

        System.out.println(number1 + " " + sum1 + " " + maxMark + " " + minMark + " " + avgMarks);

        //Variable arguments -->  (int... values) allows flexible arrays only at creation



        List<Character> charList = List.of('A','R','J','P','A','J');

        Set<Character> charSet = new TreeSet<>(charList);

        System.out.println(charSet); // ->  Unique and Sorted using TREE SET




        System.out.println(myChar.reverseString("Mohit is a coder"));

        List<Integer> list = List.of(2,4,5,3,7,6,8,9);

        list.stream().filter(element -> element%2!=0).sorted().forEach(System.out::println);



    }

}