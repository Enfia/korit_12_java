package ch18_generic.bmi;

public class Bmi {

    // 필드 변수 선언
    private double result;

    // 객체를 매개변수로 받고 getter 사용해서 값 들고 옴 계산 끝나면 result 리턴함
    private double calcBmi(Person person){
        result = person.getWeight() / ((person.getHeight()/ 100) * (person.getHeight() / 100));
        return result;
    }

    // 객체를 매개변수로 받고 calcBmi를 실행하고 result의 결과값에 따라서 bmi를 저체중 / 정상 ... 으로 하고 print 해줌
    public void printResult(Person person){
        calcBmi(person);
        String bmi;
        if(result < 18.5){
            bmi = "저체중";
        } else if(result < 22.9){
            bmi = "정상";
        } else if(result < 24.9){
            bmi = "비만전단계";
        } else if(result < 29.9){
            bmi = "1단계 비만";
        }else if(result < 34.9){
            bmi = "2단계 비만";
        }else if(result >= 35){
            bmi = "3단계 비만";
        } else{
            bmi = "에러";
        }
        System.out.println(person.getName() + "님의 키는 "+ (int) person.getHeight() + "cm 몸무게는 " + (int) person.getWeight() + "kg으로 bmi 지수는 " + bmi +"입니다.");
    }
}
