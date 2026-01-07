package ch13_abstraction.abstract_classes;

public class FactoryMain {
    public static void main(String[] args) {
//        Factory factory1 = new Factory() {
//            @Override
//            public void produce(String model) {
//                System.out.println(this.getName() + "에서 ["+ model + "] 을 생산합니다");
//            }
//
//            @Override
//            public void manage() {
//                System.out.println("가전 제품 공장을 관리합니다");
//
//            }
//        };
//        factory1.setName("임시 공장");
//        factory1.produce("모니터");
//        PhoneFactory phoneFactory1 = new PhoneFactory();
//        phoneFactory1.setName("애플 스마트폰 공장");
//        phoneFactory1.produce("아이폰 에어2");
//        phoneFactory1.manage();
//        phoneFactory1.showInfo();

        TabletFactory tabletFactory1 = new TabletFactory();
        tabletFactory1.setName("구글 태블릿");
        System.out.println("현재 공장은 " + tabletFactory1.getName() + " 공장으로 변경되었습니다.");
        tabletFactory1.produce("구글 태블릿");
        tabletFactory1.manage();
        tabletFactory1.upgrage("구글 태블릿 10인치 2세대");

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
    }
}
