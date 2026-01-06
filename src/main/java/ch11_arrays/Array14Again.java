package ch11_arrays;
/*
int[][] nums = new int[20][5];
1부터 100까지 해보셈
이해 완료
이중 for문 생각 좀 하기
*/
public class Array14Again {
    public static void main(String[] args) {
        int[][] nums = new int[20][5];
        for(int i = 0; i < nums.length; i++){
            for (int j = 0; j< nums[i].length; j++){
                nums[i][j] = (i*5)+j+1;
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
