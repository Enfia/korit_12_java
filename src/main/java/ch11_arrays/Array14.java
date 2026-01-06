package ch11_arrays;

import java.util.Arrays;

public class Array14 {
    public static void main(String[] args) {
        // 자습시간에 공부하기
        // 1 2 3 4 5
        // 6 7 8 9 10
        // 11 12 13 14 15
        // 16 17
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
