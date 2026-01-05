package ch11_arrays;

public class Array08 {
    public static void main(String[] args) {
        int[] nums = new int[200];
        //왜 주석을 풀면 1~200까지가 나오고 주석을 풀지 않으면 0만 200번 나오는가?
        //nums[i] += i + 1; 얘 때문에 주석을 하지 않으면 1~200이 나옴
//        for(int i = 0; i < nums.length; i++){
//            nums[i] += i + 1;
//            System.out.print(nums[i] + " ");
//        }
//        System.out.println();
        int i = 0;
        for(int number : nums){
            System.out.print((number + ++i)+ " ");
        }
//        System.out.println();
//        String[] names = {"김일", "김이", "김삼", "김사", "김오"};
//
//        for (int i= 0; i < names.length; i++){
//            System.out.print(names[i] + " / ");
//        }
//        System.out.println();
//
//        for (String name : names){
//            System.out.print(name + " / ");
//        }
    }
}
