package ch99_practice.ch14_casting.game;


import ch99_practice.ch14_casting.game.items.Sword;
import ch99_practice.ch14_casting.game.items.Weapon;
import ch99_practice.ch14_casting.game.system.Inventory;

public class GameMain {
    public static void main(String[] args) {
        Inventory inventory1 = new Inventory(new Weapon[5]);
        inventory1.addWeapon(new Sword());
        inventory1.addWeapon(new Sword());
        inventory1.addWeapon(new Sword());

    }
}
