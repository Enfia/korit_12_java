package ch11_arrays;

public class Array06 {
    int sum = 0;
    double avg = 0;

    public static void main(String[] args) {
        int[] scores = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        Array06 array06 = new Array06();
        array06.calcSum(scores);
        array06.calcAvg(scores);
        array06.printSumAndAvg();
    }
    public void calcSum(int[] scores){
        for(int i = 0; i < scores.length; i ++){
            sum += scores[i];
        }
    }
    public void calcAvg(int[] scores){
        avg = ((double) sum/scores.length);
    }
    public void printSumAndAvg(){
        System.out.println("총점 : " + sum + "점");
        System.out.println("평균 : " + avg + "점");
    }
}
