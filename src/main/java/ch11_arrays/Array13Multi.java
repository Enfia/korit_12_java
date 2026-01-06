package ch11_arrays;

import java.util.Arrays;

public class Array13Multi {
    public static void main(String[] args) {
        int[][] arr03 = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

/*        for(int i = 0; i < arr03.length; i++){
            for (int j= 0; j < arr03[i].length; j++){
                System.out.print(arr03[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr03.length; i++){
            System.out.println(Arrays.toString(arr03[i]));
        }*/

        for(int i = 0; i < arr03.length; i++){
            for (int num : arr03[i]){
                System.out.print(num+ " - ");
            }
            System.out.println();
        }

        for(int[] num : arr03){
            for(int i : num){
                System.out.print(i+ " - ");
            }
            System.out.println();
        }


    }
}
