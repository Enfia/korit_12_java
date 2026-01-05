package ch11_arrays;

public class Array07 {
    public static void main(String[] args) {
        int[] scores = {100, 97, 83, 85, 77, 76, 64, 58, 59, 92, 100};
        int peopleA = 0;
        int peopleB = 0;
        int peopleC = 0;
        int peopleD = 0;
        int peopleF = 0;

        for(int i = 0; i < scores.length; i++){
            if(scores[i] >= 90){
                peopleA++;
            }
            else if(scores[i] >= 80 ){
                peopleB++;
            }
            else if(scores[i] >= 70){
                peopleC++;
            }
            else if(scores[i] >= 60){
                peopleD++;
            }
            else {
                peopleF++;
            }
        }
        System.out.println("A는 " + peopleA+"명");
        System.out.println("B는 " + peopleB+"명");
        System.out.println("C는 " + peopleC+"명");
        System.out.println("D는 " + peopleD+"명");
        System.out.println("F는 " + peopleF+"명");

        int[] grades = {0, 0, 0, 0, 0 };
    }
}