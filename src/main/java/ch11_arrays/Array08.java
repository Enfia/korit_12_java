package ch11_arrays;

// 쉬움
public class Array08 {
    public static void main(String[] args) {
        int[] nums = new int[200];
        int i = 0;
        for(int number : nums){
            System.out.print((number + ++i)+ " ");
        }
    }
}
