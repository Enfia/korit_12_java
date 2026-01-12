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

    //필드 변수 선언
    int productNum;
    String productName;

    //생성자
    public Product(){

    }

    // 생성자인데 오버로딩 덕분에 매개변수를 int로 받으면 이게 실행됨
    // productNum에다가 num을 넣음
    public Product(int num){
        this.productNum = num;
    }

    // 생성자인데 오버로딩 덕분에 매개변수를 String으로 받으면 이게 실행됨
    // productName에다가 name을 넣음
    public Product(String name){
        this.productName = name;
    }

    // 생성자인데 오버로딩 덕분에 매개변수를 int, String으로 받으면 이게 실행됨
    // productNum에다가 num 넣고 productName에다가 name넣음
    public Product(int num, String name){
        this.productNum = num;
        this.productName = name;
    }

    // 고유 함수인데 객체명.showInfo하면 생성자에 넣은 name과 num이 들어가서 productNum과 productName이 잘 출력 될거임
    public void showInfo(){
        System.out.println("시리얼 넘버 : " + productNum + " 제품명 : " + productName);
    }
}
