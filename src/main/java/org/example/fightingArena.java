package org.example;

import org.example.Monsters.Monster;

public class fightingArena {
    private Monster monster1;
    private int brightSidePoints;
    private Monster monster2;
    private int darkSidePoints;

    // Square function to calculate damage reduction by armor
    public double calculateDamageReduction(double armor) {
        return 0.01 * armor * armor;
    }

    public fightingArena(Monster monster1, Monster monster2) {
        this.monster1 = monster1;
        this.monster2 = monster2;
    }


    public void startBattle(String monster1Name, String monster2Name) {
        System.out.println("Monsters stepped into fighting arena! The battle between " + monster1Name + " and " + monster2Name + " begins!");
        System.out.println("_______________________________");

        long currentTime = System.currentTimeMillis();
        long monster1NextAttackTime = currentTime;
        long monster2NextAttackTime = currentTime;

        // Based on attack speed of a monster, time of delay is shorter

        while (monster1.healthPoints > 0 && monster2.healthPoints > 0) {
            currentTime = System.currentTimeMillis();

            if (currentTime >= monster1NextAttackTime) {
                monster1.attack(monster2);
                double damage1 = Math.max(0, monster1.getAttackPoints() - calculateDamageReduction(monster2.getArmor()));
                monster2.receiveDamage(damage1);
                System.out.println(monster1Name + " attacks " + monster2Name + " by " +
                        monster1.weaponType + " for " + damage1 + " damage!");
                System.out.println(monster2Name + " actual health points is: " + monster2.healthPoints);

                monster1NextAttackTime = currentTime + (long) (1000.0 / monster1.getAttackSpeed());
            }

            if(monster2.healthPoints <= 0) {
                System.out.println(monster2Name + " has less than zero health points and has been defeated!");
                brightSidePoints++;
                break;
            }

            if (currentTime >= monster2NextAttackTime) {
                monster2.attack(monster1);
                double damage2 = Math.max(0, monster2.getAttackPoints() - calculateDamageReduction(monster1.getArmor()));
                monster1.receiveDamage(damage2);
                System.out.println(monster2Name + " attacks " + monster1Name + " for " +
                        damage2 + " damage!");
                System.out.println(monster1Name + " actual health points is: " + monster1.healthPoints);

                monster2NextAttackTime = currentTime + (long) (1000.0 / monster2.getAttackSpeed());
            };


            if(monster1.healthPoints <= 0) {
                System.out.println(monster1Name + " has less than zero health points and has been defeated!");
                darkSidePoints++;
                break;
            }

            try {
                Thread.sleep(100); // Optional delay to simulate real-time battle
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println("The battle between " + monster1Name + " and " + monster2Name + " is over!");
        System.out.println("_______________________________");
        System.out.println("Bright Side Points: " + brightSidePoints);
        System.out.println("Dark Side Points: " + darkSidePoints);

        if (brightSidePoints > darkSidePoints) {
            System.out.println("The Bright Side wins!");
        } else if (darkSidePoints > brightSidePoints) {
            System.out.println("The Dark Side wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}

