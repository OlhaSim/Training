package com;

import java.util.ArrayList;
import java.util.List;

/**
This class is for building confidence in solving recursion tasks
*/
public class Recursion {



    public static int factorial (int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        else {
            return n * factorial(n - 1);
        }
    }


    public static int fibonacci (int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }




    public static int countChar(String s, char target) {

        if (s.isEmpty()) {
            return 0;
        }

        else {
            if (s.charAt(0) == target) {
                return 1 + countChar(s.substring(1), target);
            }
            else {
                return countChar(s.substring(1), target);
            }

        }
    }




    public static int sumDigits(int n) {

        if (n == 0) {
            return 0;
        }
        else {
            return n%10 + sumDigits(n/10);
        }
    }


    public static boolean isPalindrome(String str) {
        if (str.isEmpty() || str.length() == 1) {
            return true;
        }

        else {
            return str.charAt(0) == str.charAt(str.length() - 1) && isPalindrome(str.substring(1, str.length() - 1));
        }
    }



    public static void flipListRecursion(List<Integer> list, int start, int end) {
        if (start >= end) return;

        // swap elements
        Integer temp = list.get(start);
        list.set(start, list.get(end));
        list.set(end, temp);

        flipListRecursion(list, start + 1, end - 1);
    }








    public static void main(String[] args) {

        System.out.println(factorial(3));
        System.out.println(fibonacci(4));
        System.out.println(countChar("Ballerina cappuchina", 'a'));
        System.out.println(sumDigits(111));
        System.out.println(isPalindrome("level"));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        flipListRecursion(list, 0, list.size() - 1);
        System.out.println(list);

    }
}
