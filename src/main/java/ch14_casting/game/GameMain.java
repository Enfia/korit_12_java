package ch14_casting.game;

import ch14_casting.game.items.*;
import ch14_casting.game.system.Inventory;

public class GameMain {
    public static void main(String[] args) {
        Bow bow1 = new Bow();
        Staff staff1 = new Staff();
        Sword sword1 = new Sword();
        Inventory inventory1 = new Inventory(new Weapon[3]);
        Weapon[] weapons = {new Bow(), new Sword(), new Staff()};
        inventory1.addWeapon(bow1);
        inventory1.addWeapon(staff1);
        inventory1.addWeapon(sword1);
        inventory1.attackAll();
        inventory1.useSpecialAbilities();
    }
}
