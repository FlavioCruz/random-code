package main.java;

public class Balanced{

    public static void main(String[] args){

        System.out.println(balanced("xxxyyy"));
        System.out.println(balanced("xxxxyyy"));
        System.out.println(balanced("xxxyyyy"));
        System.out.println(balanced("yyyxxx"));
        System.out.println(balanced("x"));
        System.out.println(balanced(null));
    }

    public static Boolean balanced(String sequence){
        if(sequence == null){
            return false;
        }
        int size = sequence.length();
        if(size % 2 != 0){
            return false;
        }
        char[] array = sequence.toCharArray();
        int begin = 0;
        int end = size - 1;
        char predecessorBegin = array[begin];
        char predecessorEnd = array[end];
        while(begin < end){
            char currentBegin = array[begin];
            char currentEnd = array[end];
            if(currentBegin == currentEnd){
                return false;
            }
            if(currentBegin != predecessorBegin || currentEnd != predecessorEnd){
                return false;
            }
            predecessorBegin = currentBegin;
            predecessorEnd = currentEnd;
            begin++;
            end--;
        }
        return true;
    }
}
