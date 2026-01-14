package ch19_collections.testitem;

import java.util.*;

public class BookMap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> bookInventory = new HashMap<>();
        bookInventory.put("자바", 2);
        boolean enfOfProgram = false;
        String bookTitle = "";
        while(!enfOfProgram){
            System.out.println("--- 도서 재고 관리 프로그램 ---");
            System.out.println("1. 도서추가\n2. 재고 입고\n3. 재고 출고\n4. 재고 목록\n5. 종료");
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
                        System.out.println("새로운 재고 수량을 입력하세요 >>> ");
                        int temp = sc.nextInt();
                        int stock = bookInventory.get(bookTitle) + temp;
                        sc.nextLine();
                        System.out.println(bookTitle + " 도서가 " + stock + "권으로 변경되었습니다");
                        bookInventory.put(bookTitle, stock);
                    } else{
                        System.out.println("해당 도서가 재고에 없습니다.");
                    }
                    break;
                case 3:
                    System.out.print("출고할 도서명을 입력하세요 >>> ");
                    bookTitle = sc.nextLine();
                    if (bookInventory.containsKey(bookTitle)){
                        System.out.println("츨고분을 입력하세요 >>> ");
                        int temp = sc.nextInt();
                        if (bookInventory.get(bookTitle) >= temp){
                            int stock = bookInventory.get(bookTitle) - temp;
                            sc.nextLine();
                            System.out.println(bookTitle + " 도서가 " + stock + "권으로 변경되었습니다");
                            bookInventory.put(bookTitle, stock);
                        } else{
                            System.out.println("재고가 충분하지 않습니다.");
                        }
                        break;
                    } else{
                        System.out.println("해당 도서가 재고에 없습니다.");
                    }
                    break;
                case 4:
                    Set<String> bookTitleSet = bookInventory.keySet();
                    List<String> bookTtiles = new ArrayList<>();
                    bookTtiles.addAll(bookTitleSet);
                    for(String book : bookTtiles){
                        System.out.println("도서명 : "+book+ ", 현재 재고 : " + bookInventory.get(book));
                    }
                    break;
                case 5:
                    System.out.println("프로그램 종료합니다.");
                    enfOfProgram = true;
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
/*
    ch20_j
 */