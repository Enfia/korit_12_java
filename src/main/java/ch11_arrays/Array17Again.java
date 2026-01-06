package ch11_arrays;

import java.util.Random;

public class Array17Again {

    public static void main(String[] args) {
        int round = 5;
        int[][] lottoNums = new int[round][6];
        Random rd = new Random();
        int temp;
        boolean duplicate;
        for (int j = 0; j < round; j++) {
            for (int i = 0; i < lottoNums[j].length; i++) {
                duplicate = false;
                temp = rd.nextInt(45) + 1;
                for (int k = 0; k < i; k++) {
                    if (lottoNums[j][k] == temp) {
                        duplicate = true;
                        break;
                    }
                }
                if (!duplicate) {
                    lottoNums[j][i] = temp;
                } else {
                    i--;
                }
            }
        }
        for (int j = 0; j < round; j++) {
            for (int i = 0; i < 6; i++) {
                System.out.print(lottoNums[j][i] + " ");
            }
            System.out.println();
        }
    }
}
