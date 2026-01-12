package ch11_arrays;

// 쉬움
public class Array05 {

    // 같은 클래스여도 객체를 생성해주고 메서를 사용해야함?
    // static 이면 객체를 생성해줘야함 하지만 static이 아니라면 객체 생성X
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
