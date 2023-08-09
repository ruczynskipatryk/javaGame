package org.example;

import org.example.Monsters.Monster;

public class fightingArena {

    private Monster monster1;
    private int brightSidePoints;
    private Monster monster2;
    private int darkSidePoints;

    public fightingArena(Monster monster1, Monster monster2) {
        this.monster1 = monster1;
        this.monster2 = monster2;
    }

    public void startBattle(String monster1Name, String monster2Name) {
        System.out.println("The battle between " + monster1Name + " and " + monster2Name + " begins!");

        while (monster1.healthPoints > 0 && monster2.healthPoints > 0) {
            monster1.attack(monster2);
            monster2.healthPoints -= monster1.attackPoints;
            System.out.println(monster1Name + " attacks " + monster2Name + " by " + monster1.weaponType + " for " + monster1.attackPoints + " damage!");
            System.out.println(monster2Name + " actual health points is: " + monster2.healthPoints);

            if(monster2.healthPoints <= 0) {
                System.out.println(monster2Name + " has less then zero health points and has been defeated!");
                darkSidePoints++;
                break;
            }

            monster2.attack(monster1);
            monster1.healthPoints -= monster2.attackPoints;
            System.out.println(monster2Name + " attacks " + monster1Name + " for " + monster2.attackPoints + " damage!");
            System.out.println(monster1Name + " actual health points is: " + monster1.healthPoints);
            if(monster1.healthPoints <= 0) {
                System.out.println(monster1Name + " has less then zero health points and has been defeated!");
                brightSidePoints++;
                break;
            }

            System.out.println("_______________________________");
            System.out.println("Bright Side Points: " + brightSidePoints);
            System.out.println("Dark Side Points: " + darkSidePoints);


        }

        System.out.println("The battle between " + monster1Name + " and " + monster2Name + " is over!");
    }
}

