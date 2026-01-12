package ch11_arrays;

// Array는 배열임
public class Array01 {
    public static void main(String[] args) {

        // int로 arr04라는 객체를 만듦 칸은 40칸
        int[] arr04 = new int[40];
        // arr04[0]부터 시작해서 41더하고 i 만큼 더해줌
        // 그러면 41부터 출력이 됨
        // 예시) arr04[0] = 41, arr04[1] = 42 ... arr04[40]칸 까지
        for(int i= 0; i < arr04.length; i++){
            arr04[i] = 41 + i;
            System.out.print(arr04[i]+ " ");
        }

        // String으로 arr05라는 객체를 만듦 칸은 5칸
        String[] arr05 = new String[5];
        arr05[0] = "안";
        arr05[1] = "녕";
        arr05[2] = "하";
        arr05[3] = "세";
        arr05[4] = "요";

        // arr05[0]부터 arr05[5]까지 차례대로 출력함
        for(int i=0; i < arr05.length; i++){
            System.out.print(arr05[i]);
        }
    }
}
