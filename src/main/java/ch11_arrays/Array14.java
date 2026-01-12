package ch11_arrays;

import java.util.Arrays;

// 쉬움
public class Array14 {
    public static void main(String[] args) {
        int[][] nums = new int[20][5];

        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                nums[i][j] = (i*5) + j + 1;  // 선생님 풀이임
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int num = 1;
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                nums[i][j] = num++;
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(nums));
    }
}
