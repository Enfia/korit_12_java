package ch22_lambda;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenNums = new ArrayList<>();
        for(Integer num : nums){
            if(num%2 == 0){
                evenNums.add(num);
            } else{
                System.out.println(num+"은 홀수임");
            }
        }
        System.out.print(evenNums);
        nums.stream().filter(n -> n%2==0).forEach(System.out::println);
    }
}
