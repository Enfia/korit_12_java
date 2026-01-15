package ch99_practice.ch14_casting.game.system;

import ch99_practice.ch14_casting.game.items.Bow;
import ch99_practice.ch14_casting.game.items.Staff;
import ch99_practice.ch14_casting.game.items.Sword;
import ch99_practice.ch14_casting.game.items.Weapon;

public class Inventory {
    private Weapon[] weaponSlots;

    // 기억이 잘 안남
    public Inventory(Weapon[] weaponSlots) {
        this.weaponSlots = weaponSlots;
        System.out.println("객체를 생성함");
    }

    public void addWeapon(Weapon weapon){
        // 로직 작성
        for(int i = 0; i < weaponSlots.length; i++){
            if(weaponSlots[i] == null){
                this.weaponSlots[i] = weapon;
                System.out.println((i + 1) + "번지에 "+ weapon.getClass().getSimpleName()+ "을 넣음");
                return;
            }
        }
        System.out.println("무기를 넣을 수 없음");
        // 이상의 코드에서 비어있는 칸에 무기를 넣고 비어있지 않으면 무기를 넣을 수 없다고 작성하고 싶지만
        // 0번지에 무기를 넣으면 1번지에 무기를 넣을 수 있는게 아니라 무기를 넣을 수 없음이라고 뜸
        // 어디에서 break 해야 되는지 잘모르겠음
        // 답지 봤음 근데 로직을 설명해보라고 하면 웨폰 0번지에 무기를 넣고 나면 리턴을 해서 if문을 탈출함
        // 그래서 다시 1번지가 시작됨 null이면 웨폰을 넣음 근데 weaponSlots의 크기만큼 반복이 됨
        // 근데 만약에 0번지가 null이 아니라면 어떻게 되지? 바로 for문 탈출해서 무기를 넣을 수 없음이라고 뜨긴할텐데
        // 그러면 그다음 무기를 넣을 수 없지 않나?
        // 아 이 메서드가 Main에서 여러번 호출되기 때문에 그다음 무기를 넣을 수가 있는거임
        // null이 아니면은 무기를 넣을 수 없음이 출력이 되는거고
        // null이면은 메서드 리턴해서 멈추고 다음 실행문이 실행되니까
        // null이면 무기 넣고 아니면은 무기를 넣을 수 없음이라고 출력하고
    }
    public void attackAll(){
        for(Weapon weapon: weaponSlots){
            if(weapon == null){
                System.out.println("무기가 없어 공격할 수 없습니다.");
            } else{
                weapon.attack();
            }

        }
    }
    public void useSpecialAbilities(){
        for(Weapon weapon: weaponSlots){
            if(weapon instanceof Sword){
                Sword sword = (Sword) weapon;
                sword.parry();
            } else if (weapon instanceof Bow){
                Bow bow = (Bow) weapon;
                bow.snipe();
            } else if (weapon instanceof Staff){
                Staff staff = (Staff) weapon;
                staff.castSpell();
            }
        }
    }

}
