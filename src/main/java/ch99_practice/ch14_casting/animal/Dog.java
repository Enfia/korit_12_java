package ch99_practice.ch14_casting.animal;

public class Dog extends Animal{
    private String breed;
    private boolean vaccination;

    public Dog(String name, int age, String breed, boolean vaccination) {
        super(name, age);
        this.breed = breed;
        this.vaccination = vaccination;
    }

    public void run(){
        System.out.println("개가 뛰어다닙니다.");
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("품종 : " + this.breed);
        System.out.println("예방접종 여부 : " + this.vaccination);
    }
}
