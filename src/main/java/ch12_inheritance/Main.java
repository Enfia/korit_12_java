package ch12_inheritance;

// 쉬움
public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.move();
        animal1.setAnimalName("동물");
        animal1.setAnimalAge(12);

        Tiger tiger1 = new Tiger();
        tiger1.setAnimalName("호랑이");
        tiger1.setAnimalAge(1);
        System.out.println("호랑이의 이름은 "+tiger1.getAnimalName()+"이고 나이는 " + tiger1.getAnimalAge() +  "살 입니다.");
        tiger1.move();
        tiger1.hunt();
        tiger1.hunt("날치");

        tiger1.setWeight(1.4);
        System.out.println(tiger1.getAnimalName() + "의 몸무게는 "+tiger1.getWeight() + "t 입니다.");

        Human human1 = new Human();
        human1.move();
        human1.setAnimalAge(21);
        human1.setAnimalName("김상윤");
        System.out.println("안녕하세요, 제 이름은 " + human1.getAnimalName()+ "이고 나이는 " + human1.getAnimalAge()+"살 입니다.");
        System.out.println("내년에는 "+ (human1.getAnimalAge() + 1) + "살이 됩니다.");
        human1.read("자바의 기초");
    }
}