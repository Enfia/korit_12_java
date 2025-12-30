package ch08_classes.products;
/*
    Product 클래스에 여러 가지 생성자를 정의하시오.
    field는
    int productNum;
    String productName;

    method는
    showInfo() -> productNum과 productName 정보가 콘솔에 출력되도록할것


 */
public class Product {
    int productNum;
    String productName;

    public Product(){

    }

    public Product(int num){
        this.productNum = num;
    }
    public Product(String name){
        this.productName = name
        ;
    }
    public Product(int num, String name){
        this.productNum = num;
        this.productName = name;
    }

    public void showInfo(){
        System.out.println("시리얼 넘버 : " + productNum + " 제품명 : " + productName);
    }
}
