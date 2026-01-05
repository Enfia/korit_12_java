package ch11_arrays;

import java.util.Scanner;

public class Array03Method2 {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    String[] humans = new String[count];

    public void writeAndScore(){
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        count = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i< humans.length; i++){
            System.out.println((i + 1)+"번 학생의 이름을 입력해주세요 >>>");
            humans[i] = sc.nextLine();
        }
    }
}
