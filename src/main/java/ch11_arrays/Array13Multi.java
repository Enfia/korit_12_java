package ch11_arrays;

// 쉬움
public class Array13Multi {
    public static void main(String[] args) {

        // 2차 배열임
        int[][] arr03 = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        // 이중 for문 사용하면 됨
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
