package ch10_access_modifier;

class Character{
    public String name; // 공개 가능
    private int health; // 읽기 전용
    int power; //같은 패키지만
    protected String skill; //자식 클래스
    private int exp; // 완전 차단

    public Character() {
    }

    public Character(String name, int power, String skill) {
        this.name = name;
        this.power = power;
        this.skill = skill;

        this.exp = 0;
        this.health = 100;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getPower() {
        return power;
    }

    public String getSkill() {
        return skill;
    }

    public int getExp() {
        return exp;
    }
// 이건 그냥 add 이므로 return은 필요없다
//    public int getExp(int amount) {
//        this.exp = exp + amount;
//        System.out.println(name + "가 "+  amount + " 경험치를 얻음");
//        System.out.println(name + "의 경험치 : " + this.exp);
//        return exp;
//    }
    // 수정 버전
    private void gainExp(int amount){
        this.exp = exp + amount;
        System.out.println(name + "가 "+  amount + " 경험치를 얻음");
        System.out.println(name + "의 경험치 : " + this.exp);
    }
    public void attack(){
        System.out.println(name + "가 "+ power + "으로 공격 !");
        gainExp(10);
    }

    public void heal(){
        this.health = health + 10;
        System.out.println(10 +"체력을 회복하고 현재 체력 : "+this.health);
    }
}

public class CharacterMain {
    public static void main(String[] args) {
        Character warrior = new Character();
        warrior.setName("전사");
        warrior.setHealth(100);
        warrior.setPower(200);
        warrior.setSkill("세로 베기");
        warrior.setExp(30);
        warrior.attack();
        warrior.heal();
        Character healer = new Character("힐러", 100,"치료");
        System.out.println(healer.name + healer.getExp());
        healer.attack();
        healer.attack();
        healer.attack();
        healer.attack();
        healer.attack();
        healer.attack();
    }
}
