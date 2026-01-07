package ch13_abstraction.abstract_classes;

public class FactoryMain {
    public static void main(String[] args) {
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
        PhoneFactory phoneFactory1 = new PhoneFactory();
        phoneFactory1.setName("애플 스마트폰 공장");
        phoneFactory1.produce("아이폰 에어2");
        phoneFactory1.manage();
        phoneFactory1.showInfo();
    }
}
