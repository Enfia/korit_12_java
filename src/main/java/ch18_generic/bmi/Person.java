package ch18_generic.bmi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


// Getter / ToString / AllArgsConstructor
@Getter
@AllArgsConstructor
@ToString
public class Person {
    // getter setter로 값 대입하거나 AllArgsConstructor이기 때문에 생성자 만들어짐 그래서 객체 만들 때 다 넣어줘야함
    private String name;
    private double height;
    private double weight;
}
