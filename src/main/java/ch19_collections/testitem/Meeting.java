package ch19_collections.testitem;

import java.util.*;

public class Meeting {
    public static void main(String[] args) {
        Set<String> strSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("--- 모임 참석자 명단 관리 ---\n" + "[ 종료 ] 라고 입력하면 프로그램을 종료합니다.");
        while(true){
            System.out.print("참석자 이름을 입력하세요 >>> ");
            String result = sc.nextLine();
            if(result.equals("종료")){
                System.out.println("프로그램이 종료되었습니다.");
                break;
            } else{
                strSet.add(result);
            }
        }
        // set을 list로 형변환 가능
        System.out.println("--- 최종 참석자 명단 ---");
        for ( String str1 : strSet ) {
            System.out.print(str1 +", ");
        }

    }
}
