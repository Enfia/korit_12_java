package ch08_classes.books;

import java.util.ArrayList;
import java.util.Scanner;

import ch08_classes.books.BookController;
import ch08_classes.books.Book;
import ch08_classes.books.Magazine;

public class LibraryRun {

    public static void main(String[] args) {// 소장책 DB
        ArrayList<Book> bList = new ArrayList<>();
        bList.add(new Book("100", "잃어버린 민준이를 찾아서", "저자 고서준", "도윤 출판사", 8500, "『예준스』, 『르 몽드』 선정 20세기 최고의 책"));
        bList.add(new Book("101", "시우의 자서전", "하준이가 옮김", "빛나는 주원출판사", 8500, "영화배우 민지호가 추천한 젊음에 바치는 영혼의 자서전"));
        bList.add(new Magazine("102", "박지후 과학동아", "편집부 박준우 선생", "준서 사이언스", 8500, "건우의 유튜브에 소개된 과학만화 잡지", 2023,3));
        bList.add(new Book("103", "도현이의 코딩스쿨", "코딩천재 윤현우", "지훈이네 동네", 9900, "제 13회 우진이가 주는 문학상 수상작"));
        bList.add(new Magazine("104", "선우와 서진이의 여행일기", "서울대 이유준 교수", "연우21", 3800, "영화감독 이원종pd가 집필한 영화 전문 잡지", 2023, 4));
        bList.add(new Magazine("105", "민재의 OOTD", "인플루언서 장현준", "은우네 책방", 12000, "핫가이 조정우의 샤라웃을 받은 잡지", 2022,11));
        bList.add(new Book("106", "조시윤의 미라클모닝", "샤이걸 승우찡", "승현 출판사", 6300, "준혁이도 2번이나 성공한 미라클모닝"));
        bList.add(new Book("107", "지환이의 백만가지 요리레시피", "제주도에서 온 윤우", "우리반 출판사", 6300, "제주에서 밥해먹고 사는 일상"));
        printBooks(bList);
    }

    public static void printBooks(ArrayList<Book> bs) {
        // 여기서 메뉴열고 구현 시작
        BookController bc = new BookController();

        for(Book allbs : bs) {
            System.out.println(allbs);
            bc.addBook(allbs);
        }

        boolean flag = true; // 메뉴 스위치

        while (flag == true) { // 메뉴 스위치가 켜져있는 동안 무한반복
            System.out.println("===============================");
            System.out.println("KH 우리반전용 도서관 관리 페이지입니다.");
            System.out.println("1. 조회하기");
            System.out.println("2. 추가하기");
            System.out.println("3. 책 찾기");
            System.out.println("4. 전체책 가격 합계 및 평균 조회");
            System.out.println("5. 프로그램 종료");
            System.out.println("===============================");

            Scanner sc = new Scanner(System.in);
            System.out.print("메뉴번호를 입력해주세요 : ");
            int menu = sc.nextInt(); // 메뉴 번호 입력
            sc.nextLine();

            switch (menu) {
                case 1: // 1. 조회하기
                    System.out.println("===============================");
                    System.out.println("어떤 방법으로 책을 조회하겠습니까?");
                    System.out.println("1. 도서관 전체 소장책 조회하기");
                    System.out.println("2. 일반도서만 조회하기(잡지 제외)");
                    System.out.println("3. 잡지만 조회하기(일반도서 제외)");
                    System.out.println("4. 이전으로");
                    System.out.println("===============================");

                    System.out.print("메뉴번호를 입력해주세요 : ");
                    int search = sc.nextInt();

                    if (search == 1) {
                        ArrayList<Book> selectBook = bc.getAllBook();
                        for(Book b : selectBook) {
                            System.out.println(b);
                        }
                    }
                    else if (search == 2) {
                        ArrayList<Book> bookList = bc.onlySearchBook();
                        for(Book b : bookList) {
                            System.out.println(b);
                        }
                    }
                    else if (search == 3) {
                        ArrayList<Book> magazineList = bc.onlySearchMagazine();
                        for(Book b : magazineList) {
                            System.out.println(b);
                        }
                    }
                    else if (search == 4) {
                        // 이전으로 가야함
                        flag = true;
                        ;
                    }
                    break;

                case 2: // 2. 추가하기
                    System.out.print("bNo을 입력하세요 : ");
                    String bNo = sc.nextLine();

                    System.out.print("책 제목을 입력하세요 : ");
                    String title = sc.nextLine();

                    System.out.print("작가를 입력하세요 : ");
                    String author = sc.nextLine();

                    System.out.print("출판사를 입력하세요 : ");
                    String publisher = sc.nextLine();

                    System.out.print("가격을 입력하세요 : ");
                    int price = sc.nextInt();

                    sc.nextLine();

                    System.out.print("간단한 설명을 입력하세요 : ");
                    String description = sc.nextLine();

                    System.out.print("일반도서이면 true, 잡지이면 false를 입력하세요 : ");
                    Boolean bkOrMaga = sc.nextBoolean();

                    System.out.println("===============================================");

                    Book tmpBook = null;

                    if (bkOrMaga.equals(true)) {
                        tmpBook = new Book(bNo, title, author, publisher, price, description);
                    } else if (bkOrMaga.equals(false)) {
                        System.out.print("출간연도를 입력하세요 : ");
                        int year = sc.nextInt();
                        System.out.print("출간월을 입력하세요 : ");
                        int month = sc.nextInt();
                        tmpBook = new Magazine(bNo, title, author, publisher, price, description, year, month);
                    }

                    boolean duplication = false;

                    for(Book b : bc.list) {
                        if(b.getbNo().equals(tmpBook.getbNo())) {
                            duplication = true;
                        }
                    }

                    if(duplication == false) {
                        bc.addBook(tmpBook);
                        System.out.println("성공적으로 일반도서가 추가되었습니다!");
                    } else {
                        System.out.println("해당 도서는 이미 소장하고 있는 책입니다.");
                    }
                    break;

                case 3:// 3. 책 찾기
                    System.out.println("===============================");
                    System.out.println("어떤 방법으로 책을 찾겠습니까?");
                    System.out.println("1. bNo으로 책 찾기");
                    System.out.println("2. 책 제목으로 책 찾기");
                    System.out.println("3. 출간연도로 잡지 찾기");
                    System.out.println("4. 출판사로 책 찾기");
                    System.out.println("5. 특정 가격 밑으로 책 찾기");
                    System.out.println("6. 이전으로");
                    System.out.println("===============================");
                    System.out.print("메뉴번호를 입력해주세요 : ");
                    search = sc.nextInt();
                    sc.nextLine();

                    if (search == 1) { // bNo으로 책 찾기
                        System.out.print("bNo을 입력하세요 : ");
                        bNo = sc.nextLine();

                        Book b = bc.searchBookBybNo(bNo);

                        if(b == null) {
                            System.out.println("존재하지 않는 책입니다.");
                        } else {
                            System.out.println(b);
                        }

                    } else if (search == 2) { // 책 제목으로 책 찾기
                        System.out.print("책 제목을 입력하세요 : ");
                        title = sc.nextLine();
                        ArrayList<Book> TitleList = bc.searchBookByTitle(title);

                        if(TitleList.isEmpty()) {
                            System.out.println("존재하지 않는 책입니다.");
                        } else {
                            for(Book b : TitleList) {
                                System.out.println(b);
                            }
                        }

                    } else if (search == 3) { // 출간연도로 잡지 찾기
                        System.out.print("출간연도를 입력하세요 : (올해 --> 2022) : ");
                        int year = sc.nextInt();

                        ArrayList<Book> yearList = bc.magazineOfThisYearInfo(year);

                        if(yearList.isEmpty()) {
                            System.out.println("존재하지 않는 책입니다.");
                        } else {
                            for(Book b : yearList) {
                                System.out.println(b);
                            }
                        }

                    } else if (search == 4) { // 4. 출판사로 책 찾기
                        System.out.print("출판사를 입력하세요 : ");
                        publisher = sc.nextLine();

                        ArrayList<Book> publishList =  bc.searchBookByPublisher(publisher);

                        if(publishList.isEmpty()) {
                            System.out.println("존재하지 않는 책입니다.");
                        } else {
                            for(Book b : publishList) {
                                System.out.println(b);
                            }

                        }

                    } else if (search == 5) { // 5. 특정 가격 밑으로 책 찾기
                        System.out.print("가격을 입력하세요 : ");
                        price = sc.nextInt();
                        sc.nextLine();

                        ArrayList<Book> priceList = bc.searchBookByPrice(price);

                        if(priceList.isEmpty()) {
                            System.out.println("존재하지 않는 책입니다.");
                        } else {
                            for(Book b : priceList) {
                                System.out.println(b);
                            }
                        }
                    } else if (search == 6){
                        flag = true; // 6. 이전으로
                    }
                    else
                        System.out.println("잘못 입력하셨습니다.");
                    break;

                case 4:// 4. 전체책 가격 합계 및 평균 조회
                    System.out.println("전체책 가격 합계 : " + bc.getTotalPrice());
                    System.out.println("전체책 가격 평균 : " + bc.getAvgPrice());
                    break;

                case 5:
                    System.out.println("프로그램을 종료합니다");
                    return;
                default:
                    break;
            }
        }
    }
}
