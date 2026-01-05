package ch11_arrays;

public class Array08 {
    public static void main(String[] args) {
        int[] nums = new int[200];

        for(int i = 0; i < nums.length; i++){
            nums[i] += i + 1;
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        for(int number : nums){
            System.out.print(number + " ");
        }
        System.out.println();
        String[] names = {"김일", "김이", "김삼", "김사", "김오"};

        for (int i= 0; i < names.length; i++){
            System.out.print(names[i] + " / ");
        }
        System.out.println();

        for (String name : names){
            System.out.print(name + " / ");
        }
    }
}
