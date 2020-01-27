package main.java;

import java.util.Arrays;

public class IntegerPalindrome {

    public static void main(String[] args){
        for(int number : Arrays.asList(
                1001, //true
                1234, //false
                1221, //true
                3333, //true
                4554, //true
                4567, //false
                5432, //false
                5665, //true
                7887, //true
                1211  //false
        )){
            System.out.println("is " + number + " palindrome? " + isIntegerPalindrome(number));
        }
    }

    private static boolean isIntegerPalindrome(int number) {
        int numberCopy = number, aux = 0;
        while(numberCopy >= 10){
            int i = numberCopy % 10;
            numberCopy /= 10;
            aux = (aux * 10) + i;
        }
        aux = (aux * 10) + numberCopy;
        return number == aux;
    }
}
