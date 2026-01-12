package ch17_static.singleton.Factory;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.ToString;

// 매개변수를 다 요구하는 생성자를 생성하는데 private임
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@ToString
public class SmartPhone {
    private String company;
    private String model;
    private String serial;
}
