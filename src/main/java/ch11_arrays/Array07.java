package ch11_arrays;

public class Array07 {
    public static void main(String[] args) {
        int[] scores = {100, 97, 83, 85, 77, 76, 64, 58, 59, 92, 100};
        int[] grades = {0, 0, 0, 0, 0 };

        // 나누기 10해서 9면 A, 8이면 B... F까지 해보기

/*        for(int i = 0; i < scores.length; i++){
            int avg10 = scores[i]/10;
            if(avg10 > 10 || avg10 < 0 ){
                break;
            } else{
                if (avg10 >= 9){
                    grades[0]++;
                } else if(avg10 == 8){
                    grades[1]++;
                } else if (avg10 == 7){
                    grades[2]++;
                } else if(avg10 == 6){
                    grades[3]++;
                } else{
                    grades[4]++;
                }
            }
        }*/

        for(int i = 0; i < scores.length; i++){
            if(scores[i] > 100 || scores[i] < 0 ){
                break;
            } else {
                if(scores[i] >= 90){
                    grades[0]++;
                } else if(scores[i] >= 80){
                    grades[1]++;
                } else if(scores[i] >= 70){
                    grades[2]++;
                } else if(scores[i] >= 60){
                    grades[3]++;
                } else {
                    grades[4]++;
                }
            }
        }

        /*int peopleA = 0;
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
        System.out.println("F는 " + peopleF+"명");*/

        System.out.println("A는 " + grades[0] + "명");
        System.out.println("B는 " + grades[1] + "명");
        System.out.println("C는 " + grades[2] + "명");
        System.out.println("D는 " + grades[3] + "명");
        System.out.println("F는 " + grades[4] + "명");

    }


}