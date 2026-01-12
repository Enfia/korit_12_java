package ch14_casting.game.system;

import ch14_casting.game.items.*;

public class Inventory{
    private Weapon[] weaponSlots;

    public Inventory(Weapon[] weapons) {
        this.weaponSlots = weapons;
    }

    public void addWeapon(Weapon weapon){
        int emptyIndex = checkEmpty();
        if(emptyIndex == -1){
            System.out.println("인벤토리가 가득 찼습니다.");
            return;
        }
        weaponSlots[emptyIndex] = weapon;
        System.out.println(weapon.getClass().getSimpleName()+ "무기가 추가 되었습니다.");
    }

    private int checkEmpty(){
        for(int i = 0; i < weaponSlots.length; i++){
            if(weaponSlots[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void attackAll(){
        for(int i = 0; i < weaponSlots.length; i++){
            if (weaponSlots[i] == null){
                System.out.println("무기가 없어 공격을 할 수 없습니다.");
            } else{
                weaponSlots[i].attack();
            }
        }

    }

    public void useSpecialAbilities(){
        for (Weapon weapon : weaponSlots){
            if(weapon instanceof Sword){
                Sword sword = (Sword) weapon;
                sword.parry();
            } else if(weapon instanceof Staff){
                Staff staff = (Staff) weapon;
                staff.castSpell();
            }else if(weapon instanceof Bow){
                Bow bow = (Bow) weapon;
                bow.snipe();
            } else{
                System.out.println("알 수 없는 무기입니다.");
            }
        }
    }
}