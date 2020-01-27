package main.java;

import java.util.Arrays;

public class Palindrome {

    public static void main(String[] args){
        for(String word : Arrays.asList(
                "arara",
                "banana",
                "socorram me subi no onibus em marrocos",
                "My gym",
                "Red rum, sir, is murder",
                "Step on no pets",
                "Top spot",
                "Was it a cat I saw?",
                "Eva, can I see bees in a cave?",
                "No lemon, no melon"
        )){
            System.out.println("is " + word + " palindrome? " + isPalindrome(word));
        }
    }

    private static boolean isPalindrome(String word){
        String tempWord = word
                .trim()
                .replaceAll(" ", "")
                .replaceAll("(,|.|;|!)", "")
                .toLowerCase();
        char[] array = tempWord.toCharArray();
        int begin = 0, end = array.length - 1;
        while(begin < array.length){
            if(array[begin] != array[end]){
                return  false;
            }
            begin++;
            end--;
        }
        return true;
    }
}
