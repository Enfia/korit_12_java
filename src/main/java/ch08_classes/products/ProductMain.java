package ch08_classes.products;
/* 1. 기본 생성자를 사용하여 객체를 생성하시오.
        product1
productNum 123456
productName LG엘패드
    2. 시리얼 넘버를 기본으로하는 매개변수 생성자를 통해 객체를 생성하시오.
product2
productNum 987654
productName 다이소충전기
    3. 제품명을 기본으로 하는 매개변수 생성자를 통해 객체를 생성하시오.
product3
productNum 159357
productName USB-C 케이블
    4. AllArgsConstructor를 이용하여 객체를 생성하시오.
product4
productNum 951753
productName GFlip6

    5. 정보를 출력하는 showInfo() (call1()유형으로 정의할 것)의 콘솔창
결과는 이하와 같습니다.

실행 예 :
시리얼 넘버 : 951753
제품 타이틀 : GFlip6

    6. 각 객체에 대해서 showInfo()를 호출할 것.*/
public class ProductMain {
    public static void main(String[] args){
        Product product1 = new Product();
        product1.productNum = 123456;
        product1.productName = "LG엘패드";
        product1.showInfo();

        Product product2 = new Product(987654);
        product2.productName = "다이소충전기";
        product2.showInfo();

        Product product3 = new Product("USB-C 케이블");
        product3.productNum = 159357;
        product3.showInfo();

        Product product4 = new Product(951753,"GFlip6");
        product4.showInfo();
    }
}
