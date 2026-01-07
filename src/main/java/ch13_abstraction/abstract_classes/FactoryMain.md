# 추상 클래스(Abstract Class)

# 정의
1. 추상 함수가 하나라도 포함되면 해당 클래스는 추상 클래스로 정의 돼야 함
2. 추상 클래스는 객체를 생성할 수 없음 -> 일반 클래스와의 차이
3. 그 외의 다른 특징은 일반 클래스와 동일함
- 추상 함수 - 선언만 있고 구현은 없는 함수
- 추상 함수 - 추상 함수가 하나 이상인 클래스
- 일반 함수 vs 추상 함수 구조 차이

```java
// 일반 함수
public void showInfo(){
    System.out.println("제 이름은 " + name + "입니다. ");
}

public double calcAvg(double[] socres){
    double sum = 0;
    for (double score : scores){
        sum += score;
    }
    double avg = sum / scores.length;
    return avg;
}

// 추상 함수
public abstract void showInfo();
public abstract double calcAvg(double[] scores);

// 자식 클래스에서 로직 작성
```

## 추상 클래스의 장점
- 코드의 재사용성을 높이고 설계를 보다 명확하게 할 수 있도록 도와준다.

## 추상 클래스의 목적
1. 공통된 기능 제공 : 여러 클래스에서 공통적으로 사용하는 기능을 추상 클래스에서 정의 가능
2. 구체적인 구현 강제 : 추상 함수를 통해 자식 클래스가 반드시 특정 함수를 구현하도록 강제할 수 있음.

## 주의사항
- 객체 생성을 못함.