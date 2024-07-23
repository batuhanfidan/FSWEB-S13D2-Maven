package org.example;

public class Main {
    public static void main(String[] args) {
        isPalindrome(121);
        isPerfectNumber(6);
    }
    public static boolean isPalindrome (int number) {
        int original = number;
        int reversed = 0;

        for(;number != 0; number /= 10) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
        }

        if(reversed == original) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isPerfectNumber (int number) {
        if (number<0) {
            return false;
        }

        String seperateNumber = String.valueOf(number);
        char[] numbers = seperateNumber.toCharArray();

        int sum =0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

       if (sum == number) {
          return true;
       } else {
           return false;
       }
    }

    public static String numberToWords(int number) {
        String[] oneDigit = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        if (number < 0) {
            return "Invalid Value";
        }

        StringBuilder result = new StringBuilder();
        String words = String.valueOf(number);
        char[] numbers = words.toCharArray();

        for (int i = 0; i < numbers.length; i++) {
            int digit = numbers[i] - '0';
            result.append(oneDigit[digit]);
            if (i < numbers.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
