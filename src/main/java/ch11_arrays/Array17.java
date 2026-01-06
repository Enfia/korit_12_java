package ch11_arrays;

import java.util.Arrays;

/*
선생님께서의 원리
int round = 5;  // 그냥 5 게임으로 가정하겠습니다.
그리고 round를 이용하여 2차 배열을 만들어도 되죠
int[][] lottoNumsSet = new int[round][6];
중복이 되었을 때 true로 바꿔서 다시 번호를 뽑을 예정
그러면 초기화가 여기서 처음 이루어졌다는 것을 알 수 있습니다.
왜 temp에 넣었냐면 이 변수의 값이 배열 내부의 element 값과 다르면 집어넣는 과정을
추가하기 위해서입니다.
만약에 반복문이 진행되어서 i가 3인 상황이라고 가정하겠습니다. 그러면 이전 반복까지 해서
0 1 2 번지에 난수가 대입되어있을겁니다.
그러면 0 1 2 번지의 각각의 int 값이 temp의 값과 일치하는지를 확인하고, 만약에
일치하지 않으면 -> 3 번지에 temp값을 대입
일치하는 게 있으면 -> 다시 난수 생성 후 temp에 값 대입하고 다시 확인
하는 과정을 거쳐야만 합니다.
이하의 반복문은 3 번지라고 가정했을 때 2 번지까지의 element 값을 확인하는 부분입니다.
어쨌든 0번지부터 i-1 번지까지 전체 다 확인을할건데 한 번 true로 바뀌면 중복이 되었겠네요
중복이 되면 우리 뭐해야한다? -> 다시 뽑아서 temp에 저장해야한다. 그리고 또 확인해야한다.
*/

/*
나의 풀이
int[] lottoNums = new Int[6] 배열을 선언 6칸으로 한다
int roundNum =5; 라운드 5번 할거임
int temp = 0; 중복되는 숫자인지 확인하기 위해서 선언
boolean duplicate; //중복이 됐을 때 true로 바꿔서 다시 번호를 뽑는다
*/

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