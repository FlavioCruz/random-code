package main.java;

import org.w3c.dom.ls.LSOutput;

public class Fibonacci {

    public static void main(String[] args){
        System.out.println("Fibonacci of 1");
        fibonacci(1, 1);
        System.out.println("Fibonacci of 2");
        fibonacci(2, 1);
        System.out.println("Fibonacci of 4");
        fibonacci(4, 1);
        System.out.println("Fibonacci of 7");
        fibonacci(7,1);
        System.out.println("Fibonacci of 10");
        fibonacci(10, 1);

        System.out.println("Fibonacci of 1");
        fibonacci(1, 2);
        System.out.println("Fibonacci of 2");
        fibonacci(2, 2);
        System.out.println("Fibonacci of 4");
        fibonacci(4, 2);
        System.out.println("Fibonacci of 7");
        fibonacci(7, 2);
        System.out.println("Fibonacci of 10");
        fibonacci(10, 2);
    }

    private static void fibonacci(int size, int mode) {
        for (int i = 1; i <= size; i++){
            if (mode == 1) {
                System.out.println(fibonacciAux(i));
            } else {
                System.out.println(fibonacciIterative(i));
            }
        }
    }

    private static int fibonacciAux(int currNumber){
        if(currNumber == 1 || currNumber == 2){
            return 1;
        }
        return fibonacciAux(currNumber - 1) + fibonacciAux(currNumber - 2);
    }

    private  static int fibonacciIterative(int size){
        if(size == 1 || size == 2){
            return 1;
        }
        int fib1 = 1, fib2 = 1, fibonacci = 1;
        for(int i = 3; i <= size; i++){
            fibonacci = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibonacci;
        }
        return fibonacci;
    }




}
