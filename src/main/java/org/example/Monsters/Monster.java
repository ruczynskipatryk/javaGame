package org.example.Monsters;

import java.util.Random;

public class Monster {
    public String name;
    public double healthPoints;
    public double walkSpeed;
    public double attackPoints;
    public String weaponType;

    public String getName() {
        return name;
    }
    public Monster(String name, double healthPoints, double walkSpeed, double attackPoints, String weaponType) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.walkSpeed = walkSpeed;
        this.attackPoints = attackPoints;
        this.weaponType = weaponType;
    }

    // Rnadom dodges class, 20% for dodge
    private Random random = new Random();

    public void attack(Monster target) {
        if (random.nextDouble() > 0.2) {
            target.receiveDamage(attackPoints);
        }
        else {
            System.out.println(target.getName() + " has dodged the attack!");
        }
    }
    public void receiveDamage(double attackPoints) {
        healthPoints -= attackPoints;
    }
}
