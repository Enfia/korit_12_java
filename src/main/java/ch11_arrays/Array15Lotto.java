package ch11_arrays;

import java.util.Arrays;
import java.util.Random;

public class Array15Lotto {
    public static void main(String[] args) {
        int[] lottoNumber = new int[6];
        Random rd = new Random();

        for(int j= 0; j < 10; j++){
            for (int i = 0; i < lottoNumber.length; i++){
                lottoNumber[i] = rd.nextInt(45) + 1;
            }
            System.out.println(Arrays.toString(lottoNumber));
        }


//        for (int i : lottoNumber){
//            int asd = rd.nextInt(45) + 1;
//            if (i == asd){
//                break;
//            }
//            System.out.print(asd + " ");
//        }
    }
}
