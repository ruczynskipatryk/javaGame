package org.example;

import org.example.Monsters.Monster;

public class fightingArena {

    private Monster monster1;
    private Monster monster2;

    public fightingArena(Monster monster1, Monster monster2) {
        this.monster1 = monster1;
        this.monster2 = monster2;
    }

    public void startBattle(String monster1Name, String monster2Name) {
        System.out.println("The battle begins between " + monster1Name + " and " + monster2Name + "!");

        while (monster1.healthPoints > 0 && monster2.healthPoints > 0) {
            monster1.attack(monster2);
            monster2.healthPoints -= monster1.attackPoints;
            System.out.println(monster1Name + " attacks " + monster2Name + " for " + monster1.attackPoints + " damage!");

            if (monster2.healthPoints <= 0) {
                System.out.println(monster2Name + " has been defeated!");
                break; // Exit the while loop when Monster2 is defeated
            }

            monster2.attack(monster1);
            monster1.healthPoints -= monster2.attackPoints;
            System.out.println(monster2Name + " attacks " + monster1Name + " for " + monster2.attackPoints + " damage!");

            if (monster1.healthPoints <= 0) {
                System.out.println(monster1Name + " has been defeated!");
                break; // Exit the while loop when Monster1 is defeated
            }
        }

        System.out.println("The battle between " + monster1Name + " and " + monster2Name + " is over!");
    }
}

