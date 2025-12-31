package ch11_arrays;

public class Array01 {
    public static void main(String[] args) {
        int[] arr04 = new int[40];
        for(int i= 0; i < arr04.length; i++){
            arr04[i] = 41 + i;
            System.out.print(arr04[i]+ " ");
        }
//        String[] arr05 = new String[5];
//        arr05[0] = "안";
//        arr05[1] = "녕";
//        arr05[2] = "하";
//        arr05[3] = "세";
//        arr05[4] = "요";
        String[] arr05 = {"안", "녕", "하", "세", "요"};
        for(int i=0; i < arr05.length; i++){
            System.out.print(arr05[i]);
        }
//        int[] arr03 = new int[10];
//        System.out.println(arr03[0]);
//        arr03[0] = 1000;
//        System.out.println(arr03[0]);
//        int[] arr01 = {1,2,3,4,5};
//
//        for(int i= 0; i < arr01.length; i++){
//            System.out.print(arr01[i] + " ");
//        }
//        for (int i = 0; i < 5; i++){
//            System.out.print(arr01[i]+" ");
//        }
    }
}
