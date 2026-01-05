package ch11_arrays;

public class Array05 {
    public static void main(String[] args) {
        String[] scores = {"A","B", "C", "D", "F"};
        Array05 array05 = new Array05();
        array05.addPlus(scores);
    }

    public void addPlus(String[] scores){
        // scores.length - 1;
        for (int i = 0; i < scores.length; i++){
            if (i < 4){
                System.out.print(scores[i] + "+ / ");
            } else {
                System.out.print(scores[4]);
            }
        }
    }
}
