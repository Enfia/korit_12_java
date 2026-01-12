package ch17_static.singleton.Factory;

import lombok.Getter;

public class Samsung {
    // 정적 변수
    private static Samsung instance;

    // 일반 변수
    @Getter
    private String company;
    private int serialNumber; // 정적 변수로 serialNumber를 선언하지 않고 일반 변수로 선언한 이유는 그냥 객체 하나만 생성된다고 보여주기 위해서

    private Samsung(){
        company = getClass().getSimpleName(); // 결과값이 Samsung
        serialNumber = 20260000;
        System.out.println("삼성 객체가 생성되었습니다.");
    }

    // 정적 함수
    public static Samsung getInstance(){
        if(instance == null){
            instance = new Samsung();
        }
        return instance;
    }

    //일반 함수
    public String createSerialNumber(String model){
        return model + "_" + (++serialNumber);
    }
}
