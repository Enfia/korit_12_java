package ch11_arrays;

import java.util.Arrays;

public class Array09EnhancedFor {
    public static void main(String[] args) {
        String[] persons = {"김일", "김이", "김삼", "김사", "김오"};

        for(int i =0; i < persons.length; i++) {
            int num = i + 1;
            System.out.println(num + "번 : "+ persons[i]);
        }
        System.out.println("--------------");

        int i = 0;
        for(String person : persons){
            System.out.println((i+1) + "번 : " + person);
            i++;
        }


//          내풀이
//        for(String person : persons){
//            int i = 0;
//            while(i < 5){
//                System.out.println(i);
//                i++;
//            }
//        }
    }
}
