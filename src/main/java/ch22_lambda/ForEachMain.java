package ch22_lambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ForEachMain {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("사과", "딸기", "블루베리");

        for(int i = 0; i < fruits.size(); i++){
            System.out.println("과일명 : " + fruits.get(i));
        }
        System.out.println();
        for(String fruit : fruits){
            System.out.println("과일명 : " + fruit);
        }
        System.out.println();
        fruits.forEach(fruit -> System.out.println("과일명 : " + fruit));
        System.out.println();
        fruits.stream().map(fruit -> "과일명 : "+ fruit).forEach(System.out::println);

        List<Integer> nums = List.of(1,2,3,4,5);
        System.out.println(nums);
        nums.forEach(num -> System.out.println((num*2) + " "));
        System.out.println(nums); // 원본 자체가 바뀐 것이 아님
    }
}
