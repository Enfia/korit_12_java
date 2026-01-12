package ch08_classes;

public class Car {

    // 필드 변수 선언함
    String color;
    int speed;

    // 함수 정의
    // 이건 당연히 이해됨
    public void drive() {
        System.out.println(color + " 자동차가 주행중입니다.");
    }
    public void brake() {
        System.out.println(color + " 자동차가 " + "멈췄습니다.");
    }
    public void displayInfo() {
        System.out.println("이 차의 색깔은 " +
                color + "색이고,");
        System.out.println("최고 속도는 " + speed + "km/h입니다.");
    }
}
