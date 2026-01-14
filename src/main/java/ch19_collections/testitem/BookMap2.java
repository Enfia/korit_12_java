package ch19_collections.testitem;

import java.util.*;

public class BookMap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> bookInventory = new HashMap<>();
        bookInventory.put("Java프로그래밍 입문", 2);
        boolean enfOfProgram = false;
        String bookTitle = "";
        while(!enfOfProgram){
            System.out.println("--- 도서 재고 관리 프로그램 ---");
            System.out.println("1. 도서추가\n2.재고 수정\n3. 재고 목록\n4. 종료");
            System.out.print("메뉴를 선택하세요 >>> ");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option){
                case 1:
                    System.out.println("새 도서명을 입력하세요 >>> ");
                    bookTitle = sc.nextLine();
                    if (bookInventory.containsKey(bookTitle)){
                        System.out.println("이미 재고에 있는 도서입니다.");
                    } else{
                        System.out.print("재고 수량을 입력하세요 >>> ");
                        int stock = sc.nextInt();
                        sc.nextLine();
                        bookInventory.put(bookTitle, stock);
                        System.out.println(bookTitle + " 도서가 " + stock + "권 추가되었습니다.");
                    }
                    break;
                case 2:
                    System.out.print("수량을 변경할 도서명을 입력하세요 >>> ");
                    bookTitle = sc.nextLine();
                    if (bookInventory.containsKey(bookTitle)){
//                        System.out.println("\n새로운 재고 수량을 입력하세요 >>> ");
//                        int stock = sc.nextInt();
//                        sc.nextLine();
//                        System.out.println(bookTitle + " 도서가 " + stock + "권으로 변경되었습니다");
//                        bookInventory.replace(bookTitle, stock);
                        System.out.println("새로운 재고 수량을 입력하세요 >>> ");
                        int temp = sc.nextInt();
                        int stock = bookInventory.get(bookTitle) + temp;
                        sc.nextLine();
                        System.out.println(bookTitle + " 도서가 " + stock + "권으로 변경되었습니다");
                        bookInventory.put(bookTitle, stock);
                        // 이상의 코드에서의 추가 수정 사항 : 책이 팔리면 내가 -1로 입력해야 함.
                    } else{
                        System.out.println("해당 도서가 재고에 없습니다.");
                    }
                break;
                case 3:
                    Set<String> bookTitleSet = bookInventory.keySet();
                    List<String> bookTtiles = new ArrayList<>();
                    bookTtiles.addAll(bookTitleSet);
                    for(String book : bookTtiles){
                        System.out.println("도서명 : "+book+ ", 현재 재고 : " + bookInventory.get(book));
                    }
                case 4:
                    System.out.println("프로그램 종료합니다.");
                    enfOfProgram = true; // 둘 다 있어야함
                    break; // <----
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
