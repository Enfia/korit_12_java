package ch18_generic.woldcard;

import lombok.AllArgsConstructor;
import lombok.Data;

// AnimalData의 필드 변수인 animal에 Animal 클래스의 상속 받은 Tiger Human 객체를 필드에 대입
// T에는 어떠한 클래스도 들어갈 수 있기 때문에 현재 상황에서는 Car 클래스의 객체도 animal에 들어갈 수 있다고 해석할 수 있음
// 이번 목표는 특정 클래스라면 해당 클래스에 맞는 객체 정보를 출력할거임
// Data
@AllArgsConstructor
@Data
public class AnimalData<T> {
    private T animal;

    public void showData(){
        ((Animal) animal).move();
        if(animal.getClass() == Human.class){
            ((Human) animal).read(); // 다운캐스팅
            // 객체의 클래스를 확인하여 Human이라면 고유 함수인 read() 호출
        } else if(animal.getClass() == Tiger.class){
            ((Tiger) animal).hurt();
        } else{
            System.out.println("아직 고유 함수가 없거나 Animal의 서브 클래스가 아닙니다.");
        }
    }

}
