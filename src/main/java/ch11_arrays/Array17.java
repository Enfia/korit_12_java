package ch11_arrays;

import java.util.Arrays;

public class Array17 {
    public static void main(String[] args) {
        int[] lottoNums = new int[6];
        int roundNum = 5;
        int temp = 0;
        boolean duplicate;// 중복이 됐을 때 true로 바꿔서 다시 번호를 뽑을 예정

        // int[][] lottoNumSet = new int [round][6]; 자습시간에 해보기, 로또 다시 만들어보기
        for (int j = 0; j < roundNum; j++ ) {
            int cnt = 1; // count
            for (int i = 0; i < lottoNums.length; i++) {
                duplicate = false;  // 초기화함
                temp = (int) (Math.random() * 45) + 1; //element 값과 다르면 집어넣는 과정을 추가

                for (int k = 0; k < i; k++) {
                    if (lottoNums[k] == temp) {
                        duplicate = true; // 0번지부터 i - 1 번지까지 전체 다 확인 -> true가 되면 중복임
                    }
                }

                if (!duplicate) {
                    lottoNums[i] = temp;
                }

                else {
                    i--; // ??????
                }

                cnt++;
            }
            Arrays.sort(lottoNums);
            System.out.println(Arrays.toString(lottoNums));
            System.out.println("반복 횟수 : " + cnt);
        }
    }
}