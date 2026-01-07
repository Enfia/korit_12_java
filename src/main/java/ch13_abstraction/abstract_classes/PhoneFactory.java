package ch13_abstraction.abstract_classes;

// 부모 클래스가 Factory 클래스인 자식 클래스
// 필수로 하는 produce 함수와 manage 함수가 꼭 꼭 꼭 필요함.

public class PhoneFactory extends Factory{

    @Override
    public void produce(String model) {
        System.out.println("모바일 폰 공장 : " + this.getName() + "에서 [" + model + "]을 생산합니다.");
    }

    @Override
    public void manage() {
        System.out.println("모바일 폰 공장을 관리합니다.");
    }

}
