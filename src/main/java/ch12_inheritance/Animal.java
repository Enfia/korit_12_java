package ch12_inheritance;

// 상속임
public class Animal {

    // 변수  선언
    private String animalName;
    private int animalAge;

    // 생성자
    public Animal() {
    }

    // 매개변수가 필요한 생성자
    public Animal(String animalName) {
        this.animalName = animalName;
    }

    // 매개변수가 필요한 생성자
    public Animal(int animalAge) {
        this.animalAge = animalAge;
    }

    // AllArgsConstructor임
    public Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }

    //getter임
    public String getAnimalName() {
        return animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    // setter임
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    // 함수임
    public void move(){
        System.out.println("움직입니다.");
    }
}
