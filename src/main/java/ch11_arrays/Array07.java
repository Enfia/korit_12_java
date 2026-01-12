package ch11_arrays;


// 쉬움
public class Array07 {
    public static void main(String[] args) {
        int[] scores = {100, 97, 83, 85, 77, 76, 64, 58, 59, 92, 100};
        int[] grades = {0, 0, 0, 0, 0 };

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

        System.out.println("A는 " + grades[0] + "명");
        System.out.println("B는 " + grades[1] + "명");
        System.out.println("C는 " + grades[2] + "명");
        System.out.println("D는 " + grades[3] + "명");
        System.out.println("F는 " + grades[4] + "명");

    }


}