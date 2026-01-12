package ch17_static.singleton.Factory;



public class FactoryMain {
    public static void main(String[] args) {
        Factory factory1 = new Factory("제 1 공장");
        Factory factory2 = new Factory("제 2 공장");
        Factory factory3 = new Factory("제 3 공장");
        Factory factory4 = new Factory("제 4 공장");

//        SmartPhone smartPhone1 = new SmartPhone("임의의 공장", "임의의 스마트폰 객체", "임시 넘버");
//        System.out.println(smartPhone1); // 공장을 통하지 않고 스마트폰 객체를 생성할 수 있음 이유는 AllArgsConstructor 때문에

        SmartPhone smartPhone1 = factory1.produceSmartPhone();
        SmartPhone smartPhone2 = factory2.produceSmartPhone();
        SmartPhone smartPhone3 = factory3.produceSmartPhone();
        SmartPhone smartPhone4 = factory4.produceSmartPhone();

        System.out.println(smartPhone1);
        System.out.println(smartPhone2);
        System.out.println(smartPhone3);
        System.out.println(smartPhone4);
    }
}

// 알 수 있는 점은 어떤 공장에서 함수를 호출했는ㄱ나와는 상관없이
// createSerialNumber() 함수를 호출한 결과가 하나의 객체에서 비롯됨(싱글톤 때문에)
// 호출하다라도 일원화된 시리얼 넘버 부여가 가능함