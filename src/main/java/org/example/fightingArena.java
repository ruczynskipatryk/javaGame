package org.example;

import org.example.Monsters.Monster;

public class fightingArena {
    private final Monster monster1;
    private int brightSidePoints;
    private final Monster monster2;
    private int darkSidePoints;
    ScoreManager scoreManager = new ScoreManager();


    // Score manager for saving punctation to separate file and see who's winning now

    public fightingArena(Monster monster1, Monster monster2) {
        this.monster1 = monster1;
        this.monster2 = monster2;
    }

    // Using square root to calculate damage reduction by armor
    public double calculateDamageReduction(double armor) {
        return Math.round(100.0 * Math.sqrt(armor)) / 100.0;
    }

    public void startRealTimeBattle(String monster1Name, String monster2Name) {
        System.out.println("Monsters stepped into fighting arena! The battle between " + monster1Name + " and " + monster2Name + " begins!");
        System.out.println("_______________________________");

        // Delay for monsters fight included attack speed to simulate real time battle
        long monster1DelayMillis = (long) (1000.0 / monster1.getAttackSpeed());
        long monster2DelayMillis = (long) (1000.0 / monster2.getAttackSpeed());

        while (monster1.healthPoints > 0 && monster2.healthPoints > 0) {
            if (monster1.healthPoints > 0) {
                monster1.attack(monster2);
                double damage1 = Math.max(0, monster1.getAttackPoints() - calculateDamageReduction(monster2.getArmor()));
                monster2.receiveDamage(damage1);
                System.out.println(monster1Name + " attacks " + monster2Name + " by " +
                        monster1.weaponType + " for " + damage1 + " damage!");
                System.out.printf("%s actual health points is: %.2f%n", monster2Name, monster2.healthPoints);

            }

            if (monster2.healthPoints <= 0) {
                System.out.println(monster2Name + " has less than zero health points and has been defeated!");
                brightSidePoints++;
                break;
            }

            System.out.println("_______________________________");

            if (monster2.healthPoints > 0) {
                monster2.attack(monster1);
                double damage2 = Math.max(0, monster2.getAttackPoints() - calculateDamageReduction(monster1.getArmor()));
                monster1.receiveDamage(damage2);
                System.out.println(monster2Name + " attacks " + monster1Name + " for " +
                        damage2 + " damage!");
                System.out.printf("%s actual health points is: %.2f%n", monster1Name, monster1.healthPoints);

            }

            if (monster1.healthPoints <= 0) {
                System.out.println(monster1Name + " has less than zero health points and has been defeated!");
                darkSidePoints++;
                break;
            }

            // Thread.sleep is used to create "delays" in combat, without it, each iteration of the loop will be very fast
            try {
                Thread.sleep(Math.min(monster1DelayMillis, monster2DelayMillis));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println("The battle between " + monster1Name + " and " + monster2Name + " is over!");
        System.out.println("_______________________________");
        System.out.println("Bright Side score after the fight: " + brightSidePoints);
        System.out.println("Dark Side score after the fight: " + darkSidePoints);


        if (brightSidePoints > darkSidePoints) {
            // When Bright Side gets a score point
            scoreManager.incrementBrightSidePoints();
            System.out.println("The Bright Side wins this round and got one score point!");
        } else if (darkSidePoints > brightSidePoints) {
            // When Dark Side gets a score point
            scoreManager.incrementDarkSidePoints();
            System.out.println("The Dark Side wins this round and got one score point!");
        } else {
            System.out.println("It's a draw!");
        }

    }
}

