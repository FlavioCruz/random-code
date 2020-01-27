package main.java;

public class Prime {

    public static void main(String[] args){

        System.out.println("is 1 prime?: " + isPrime(1));
        System.out.println("is 2 prime?: " + isPrime(2));
        System.out.println("is 82937 prime?: " + isPrime(82937));
        System.out.println("is 13 prime?: " + isPrime(13));
        System.out.println("is 21 prime?: " + isPrime(21));
        System.out.println("is 37 prime?: " + isPrime(37));
    }

    private static boolean isPrime(int value){
        int sqrRoot = (int) Math.sqrt(value);
        if(value < 2){
            return false;
        } else if(value == 2){
            return true;
        }
        for(int i = 2; i < sqrRoot; i++){
            if(value % i == 0){
                return false;
            }
        }
        return true;
    }
}
