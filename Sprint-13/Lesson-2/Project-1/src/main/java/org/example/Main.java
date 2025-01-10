package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean  isPalindrome(int sayi) {
        String[] sayiStr = String.valueOf(Math.abs(sayi)).split("");

        for (int i = 0; i < sayiStr.length / 2; i++) {
            if (!sayiStr[i].equals(sayiStr[sayiStr.length - i - 1])) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] numberStr = String.valueOf(number).split("");
        StringBuilder result = new StringBuilder();

        for (String s : numberStr) {
            result.append(words[Integer.parseInt(s)]).append(" ");
        }

        return result.toString().trim();
    }
}
