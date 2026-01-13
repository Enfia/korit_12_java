package ch13_abstraction.abstract_classes;

// 쉬움
public class TabletFactory extends Factory {
    @Override
    public void produce(String model) {
    }

    @Override
    public void manage() {
    }

    // 고유 함수임
    public void upgrage(String model){
        System.out.println( model +"로 업그레이드합니다.");
    }
}
