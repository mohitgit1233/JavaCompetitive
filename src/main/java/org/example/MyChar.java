package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyChar {

    //Abstract methods cannot be defined inside non-abstract classes
    private char ch;

    public MyChar(char ch) {
        this.ch = ch;
    }
    public char getCh() {
        return ch;
    }

    public boolean isVowel(){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'  ){
            return true;
        }
        return false;
    }

    //this sees if it is between 0 and 9
    public boolean isDigit(){
       if(ch >= 48 && ch <= 57)
        return true;

       return false;
    }

    public boolean isAlphabet(){
        if(ch >= 97 && ch <= 122)
            return true;
        if(ch >= 65 && ch <= 90)
            return true;

        return false;
    }

    //Get last digit of a number: modulo by 10 -> remainder is last digit
    int ab = 344;
    int c = ab%10;




    //Get number of digits in an integer

    public int getNumberOfDigits(int number) {
        // Step 1: Handle edge cases
        if (number == 0) {
            return 1; // zero has one digit
        }
        if (number < 0) {
            return -1; // not counting digits of negative numbers
        }

        // Step 2: Initialize the count of digits
        int numberOfDigits = 1; // start counting from 1

        // Step 3: Count the digits
        while (number >= 10) {
            number /= 10; // remove the last digit from the number
            numberOfDigits++; // increment the count of digits
        }

        // Step 4: Return the result
        return numberOfDigits;
    }

    // Calculate sum of all digits of a number
    public int getSumOfDigits(int number) {
        // Write your code here

        int length = Integer.toString(number).length();
        int result = 0;

        if(length == 1){
            result = number;
        }
        if(number<0){
            result = -1;
        }
        if(number>0 && length >1)
        {

            int sum = 0;

            while(number >0)
                {
//              System.out.println(number);
                sum = sum + number%10;
                number = number/10;
                }

            result = sum;
            }

        return result;
        }

        //Reverse a number
    public int reverseNumber(int number) {
        // TODO: Write your code here
        if(number==0){
            return 0;
        }
        if(number<0){
            return -1;
        }

        if(number>0){
            String nums = "";
            while(number > 0){
                nums = nums + Integer.toString(number%10);
                number = number/10;

                // Multiply the reversed number by 10 and add the last digit
               // reversedNumber = reversedNumber * 10 + digit; -> This is another way
            }

            int result = Integer.parseInt(nums);
            return result;
        }

        return 0;
    }



    //calculate HCF of 2 numbers:
    public int calculateGCD(int number1, int number2) {
        // Write your code here

        if(number1 < 0 || number2 < 0){
            return 1;
        }
        if(number1 == 0 || number2 == 0){
            return 0;
        }
        if(number1 == number2){
            return number1;
        }

        int smaller = Math.min(number1,number2);

        for(int i = smaller;i>=1;i--){
            if(number2 % i == 0 && number1 % i == 0 ){
                return i;
            }
        }

        return -1;
    }



    // Count uppercase letters :
    public int countUppercaseLetters(String str) {
        // TODO: Write your code here
        int resut=0;

        if(str.length() == 0){
            return 0;
        }

        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                resut++;
            }
        }

        if(resut == 0){
            return 0;
        }
        return resut;
    }




    //@return true if the string has CONSECUTIVE DUPLICATES, false otherwise.

    public boolean hasConsecutiveDuplicates(String str) {

        // TODO: Write your code here
        if(str.length() == 0){
            return false;
        }

        for(int i =1;i<str.length();i++){
            if(str.charAt(i-1) == str.charAt(i)){
                return true;
            }
        }

        return false;
    }

    //  * @return The rightmost digit in the string. If no digit is found, return -1.

    public int getRightmostDigit(String str) {

        // TODO: Write your code here

        if(str.isEmpty()){
            return -1;
        }

        for(int i=(str.length()-1);i>=0;i--){
            if(Character.isDigit(str.charAt(i))){
                return Character.getNumericValue(str.charAt(i));
            }
        }
        return -1;
    }




     //* @return The longest word in the sentence. If sentence is empty, return an empty string.

    public String findLongestWord(String sentence) {

        // Edge Case: If the sentence is empty, return an empty string
        if (sentence.isEmpty()) {
            return "";
        }

        // Split the sentence into words using space as the separator
        String[] words = sentence.split(" ");

        // Initialize variables to keep track of the longest word and its length
        String longestWord = "";
        int maxLength = 0;

        // Iterate over each word in the words array
        for (String word : words) {

            // If the length of the current word is more than maxLength, update longestWord and maxLength
            if (word.length() > maxLength) {
                longestWord = word;
                maxLength = word.length();
            }
        }

        // Return the longest word found in the sentence


        return longestWord;

    }



    // * @return True if there's an element greater than the given number in the array, false otherwise.

    public boolean doesHaveElementGreaterThan(int[] array, int number) {

        // TODO: Write your code
        if(array.length == 0){
            return false;
        }

        for(int num:array){
            if(num > number){
                return true;
            }

        }
        return false;
    }




    //  * @return the second-largest element in the array

    public int findSecondLargestElement(int[] array) {
        //TODO: Write your code here

        if (array.length < 2) {
            return -1;  // Return -1 if the array has less than 2 elements.
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int element : array) {
            if (element > largest) {
                secondLargest = largest;
                largest = element;
            } else if (element > secondLargest && element != largest) {
                secondLargest = element;
            }
        }

        // If there is no second largest element (all elements in the array are the same), return -1
        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLargest;
    }



     // * @return true if the array is sorted, false otherwise

    public boolean isSorted(int[] array) {

        // TODO: Write code here
        boolean flag = true;
        if(array.length <= 1){
            return true;
        }

        for(int i=array.length-1;i>=1;i--){
            if(array[i-1] < array[i] || array[i-1] == array[i]){
                continue;
            }else{
                flag = false;
            }
        }

        return flag;
    }


      //  * @return a new array with elements in reverse order

    public int[] reverseArray(int[] array) {

        // TODO: Write your code here
        int len = array.length;
        int index = 0;
        int[] arrayFinal = new int[len];

        if(array.length<=1){
            return array;
        }

        for(int i=array.length-1;i>=0;i--){

            arrayFinal[index] = array[i];
            index = index +1;
        }

        return arrayFinal;
    }


     // * @return a List of factors of the number

    public java.util.List<Integer> determineAllFactors(int number) {

        List<Integer> factors = new ArrayList<Integer>();

        // TODO: Write your code here
        if(number<=0){
            return factors;
        }

        for(int i=1;i<=number;i++){
            if(number%i==0){
                factors.add(i);
            }

        }
        return factors;
    }


   //  * @return a List of multiples of the number less than the limit

    public List<Integer> determineMultiples(int number, int limit) {

        // TODO: Write your code here
        int multiple;
        int i = 1;

        List<Integer> allMultiples = new ArrayList<>();
        if(number<=0){
            return allMultiples;
        }

        for(i=1;i>0;i++){
            multiple = number*i;
            if(multiple<limit){
                allMultiples.add(multiple);
            }else{
                break;
            }
        }

        return allMultiples;
    }

    public String sumOfOddandEvens(int nums){

        if(nums<=0){
            return Integer.toString(-1);
        }
        if(nums>=1 && nums<10){
            return Integer.toString(nums);
        }

        String result = "";
        int oddSum = 0;
        int evenSum = 0;



        while(nums>0)
        {
//              System.out.println(number);
            if((nums%10)%2 == 0){
                evenSum = evenSum + nums%10;
            }else{
                oddSum = oddSum + nums%10;
            }
            nums = nums/10;
        }
        result = Integer.toString(evenSum) + " " + Integer.toString(oddSum);
        return result;
    }

        // Anagram checker
//            Convert the strings to lowercase.
//            Check if the lengths of the strings are different. If so, return false.
//             Convert the strings to character arrays.
//            Sort the character arrays.
//             If the sorted arrays are equal, return true. Otherwise, return false.

    public boolean areAnagrams(String str1, String str2) {
        // Handle null strings
        if (str1 == null || str2 == null) {
            return false;
        }

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Check if the lengths of the strings are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the char arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Check if the sorted char arrays are the same
        return Arrays.equals(charArray1, charArray2);
    }


    // Reverse all the words of a String

    public String reverseWordsInSentence(String sentence) {
        // Edge case: if the sentence is null, return "INVALID"
        if (sentence == null) {
            return "INVALID";
        }

        // Edge case: if the sentence is empty, return an empty string
        if (sentence.isEmpty()) {
            return "";
        }

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Initialize a StringBuilder to store the reversed sentence
        StringBuilder reversedSentence = new StringBuilder();

        // Iterate over each word and reverse it
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedSentence.append(reversedWord).append(" ");
        }

        // Trim any trailing whitespace and return the reversed sentence
        return reversedSentence.toString().trim();
    }

    public String reverseString(String sentence){

        if(sentence.isEmpty() || sentence == null){
            return "INVALID";
        }

        StringBuilder reverseString = new StringBuilder();
//        reverseString = reverseString.reverse();

        String[] strArray = sentence.split(" ");

        for(int i=strArray.length-1;i>=0;i--){
            reverseString.append(strArray[i]).append(" ");
        }

        return reverseString.toString().trim();
    }
}
