package ch08_classes.products;

// 메인 부분임
public class ProductMain {
    public static void main(String[] args){


        // 객체를 product1로 했고 기본 생성자를 사용했고
        // productNum에 123456 넣고 / productName에 LG엘패드를 넣음
        // 그래서 showInfo하면 123456, LG엘패드가 출력 될거임
        Product product1 = new Product();
        product1.productNum = 123456;
        product1.productName = "LG엘패드";
        product1.showInfo();

        // 이하는 생략...
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
