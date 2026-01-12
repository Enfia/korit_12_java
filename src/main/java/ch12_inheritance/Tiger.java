package ch12_inheritance;


// extends 는 상속 받는 거긴 한데 그대로 복사 해온게 아니라 부모 클래스에 있는 것을 사용한다

// 쉬움 부모 클래스가 Animal이고 자식 클래스가 Tiger임
public class Tiger extends Animal{
    private double weight;

    public Tiger() {
    }

    public Tiger(String animalName, int animalAge, double weight) {
        super(animalName, animalAge);  // super 키워드가 있음
        this.weight = weight;
    }

    public void hunt(){
        System.out.println(getAnimalName() + "이가 사냥을 합니다");
    }

    public void hunt(String prey){
        System.out.println(getAnimalName() + "이가 " + prey + "을 사냥합니다");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void move() {
        System.out.print("호랑이가 ");
        super.move(); // super.함수명() / super 키워드 - 부모 클래스의 임의의 인서턴스를 의미함
    }
}
