package ch19_collections.testitem;

import java.util.*;

/*
    모임 참석자 명단 관리 프로그램 작성
    지시 사항
    1. Set을 사용해서 참석자 명단(String)을 저장. (중복 이름 안받기 위해)
    2. 사용자로부터 참석자 이름을 계속해서 입력 받을 예정
    3. 입력 받은 이름을 Set에 추가.
    4. 종료 라고 입력하면 더 이상 이름을 입력받지 않음.
    5. 최종 모임 참석자 명단을 콘솔에 출력
    실행 예
    --- 모임 참석자 명단 관리 ---
    [ 종료 ] 라고 입력하면 프로그램을 종료합니다.
    참석자 이름을 입력하세요 >>> 김일
    참석자 이름을 입력하세요 >>> 김이
    참석자 이름을 입력하세요 >>> 김삼
    참석자 이름을 입력하세요 >>> 종료
    프로그램이 종료되었습니다.

    --- 최종 참석자 명단 ---
    [김일, 김이, 김삼]
 */
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
