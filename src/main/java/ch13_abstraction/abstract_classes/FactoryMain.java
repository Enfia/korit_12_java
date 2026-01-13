package ch13_abstraction.abstract_classes;

public class FactoryMain {
    public static void main(String[] args) {

        // 객체 생성했을 때 무조건 선언해줘야 하는 함수 다 선언해줬음
        Factory factory1 = new Factory() {
            @Override
            public void produce(String model) {
                System.out.println(this.getName() + "에서 ["+ model + "] 을 생산합니다");
            }

            @Override
            public void manage() {
                System.out.println("가전 제품 공장을 관리합니다");

            }
        };
        factory1.setName("임시 공장");
        factory1.produce("모니터");

        // 폰공장 객체 만듦 근데 얘네는 이미 폰공장 클래스에 필수 함수 다 선언해줬음
        PhoneFactory phoneFactory1 = new PhoneFactory();
        phoneFactory1.setName("애플 스마트폰 공장");
        phoneFactory1.produce("아이폰 에어2");
        phoneFactory1.manage();
        phoneFactory1.showInfo();

        // 테블릿공장 객체 만듦 이상이랑 똑같음
        TabletFactory tabletFactory1 = new TabletFactory();
        tabletFactory1.setName("애플 태블릿");
        tabletFactory1.setName("구글 태블릿");
        System.out.println("현재 공장은 " + tabletFactory1.getName() + " 공장으로 변경되었습니다.");
        tabletFactory1.produce("구글 태블릿");
        tabletFactory1.manage();
        tabletFactory1.upgrage("구글 태블릿 10인치 2세대");

        // 공장2 객체 만듦
        Factory factory2  = new Factory() {
            @Override
            public void produce(String model) {
                System.out.println(model + "컴퓨터를 생산합니다.");
            }

            @Override
            public void manage() {
                System.out.println("컴퓨터 공장을 관리합니다.");

            }
        };
        factory2.setName("삼성 컴퓨터 공장");
        factory2.showInfo();
//        PhoneFactory phoneFactory1 = new PhoneFactory();
//        phoneFactory1.showInfo(); // 테스트함
    }
}
