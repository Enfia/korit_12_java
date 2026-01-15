package ch22_lambda;

public class CalculatorMain {
    public static int operate(int a, int b, Calculator c){
        return c.compute(a, b);
    }

    public static void main(String[] args) {
        Calculator add = (x, y) -> x + y; // 객체명이 add 내부 메소드는 compute() 추상 메소드를 x+y로 구현함
        Calculator sub = (x, y) -> x - y;
        Calculator mul = (x, y) -> x * y;
        Calculator div = (x, y) -> x / y;

        System.out.println("2 + 3 = " + operate(2,3, add));
        /*
            operate의 세 번째 매개변수는 Calculator 인터페이스의 서브 클래스를 받음
            그리고 operate() 메소드의 return 값은 기본적으로 compute()를 리턴하는 것을 알 수 있음
            그런데 인터페이스는 추상 메소드 밖에 없으니까 구현부가 있는 객체값을 확인해야함
         */
        System.out.println(sub.compute(3,4));
        System.out.println("2 X 3 = " + operate(2,3, mul));
        /*
           클래스들 간의 일반 메소드 정적 메소드 뿐만 아니라 어디서 빠져나온 함수형 인터페이스의 추상 메소드를 구현한 어떤 버전을 일반 표현식으로 썼든 람다식으로 썼든 다 해석해서
           어떻게 호출할지까지 알 필요가 있다는 의미가 됨
         */
    }
}
