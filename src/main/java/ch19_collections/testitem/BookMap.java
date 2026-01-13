package ch19_collections.testitem;

import java.util.*;


// ch14_casting 부터 복습하시오
public class BookMap {
    public static void main(String[] args) {
        Map<String, Integer> bookMap1 = new HashMap<>();
        String name;
        Integer bookNum;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. 도서 추가 \n2. 재고 수정 \n3. 재고 목록 \n4. 종료 ");
            System.out.print("메뉴를 선택하세요 >>> ");
            int switchNum = sc.nextInt();
            sc.nextLine();
            switch (switchNum) {
                case 1:
                    System.out.print("새 도서명을 입력하세요 >>> ");
                    name = sc.nextLine();
                    if(bookMap1.containsKey(name)){
                        System.out.println("이미 재고에 있는 도서입니다.");
                    } else {
                        System.out.print("재고 수량을 입력하세요 >>> ");
                        bookNum = sc.nextInt();
                        bookMap1.put(name, bookNum);
                        System.out.println(name + "도서가 "+ bookNum + "권 추가되었습니다.");
                        continue;
                    }
                    continue;
                case 2:
                    System.out.println("재고를 변경할 도서명을 입력하세요 >>>");
                    name = sc.nextLine();
                    if (bookMap1.containsKey(name)){
                        System.out.println("새로운 재고 수량을 입력하세요 >>>");
                        bookNum = sc.nextInt();
                        bookMap1.put(name, bookNum);
                        System.out.println(name + " 도서가 "+ bookNum + "권으로 추가되었습니다.");
                    } else{
                        System.out.println("해당 도서가 재고에 없습니다.");
                        continue;
                    }
                    continue;
                case 3:
                    for (Map.Entry<String, Integer> entrySet : bookMap1.entrySet()) {
                        System.out.println("도서명 : " + entrySet.getKey() + " 재고 수량 : " +entrySet.getValue());
                    }
                    continue;
                case 4:
                    System.out.println("종료");
                    return;
            }
        }
    }
}
