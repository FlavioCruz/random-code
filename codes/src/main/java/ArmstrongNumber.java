package main.java;

import java.util.Arrays;

public class ArmstrongNumber {

    public static void main(String[] args){
        for(int number : Arrays.asList(
                153, //true
                0,   //true
                1,   //true
                370, //true
                371, //true
                407, //true
                123  //false
        )){
            System.out.println("is " + number + " palindrome? " + isAmrstrongNumber(number));
        }
    }

    private static boolean isAmrstrongNumber(int number) {
        int numberCopy = number, aux = 0;
        while(numberCopy > 0){
            int i = numberCopy % 10;
            numberCopy /= 10;
            aux +=  Math.pow(i, 3);
        }
        return number == aux;
    }
}
