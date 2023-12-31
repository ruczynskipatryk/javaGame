package org.example.Monsters;

import java.util.Random;

public class Monster {
    public String name;
    public double healthPoints;
    public double armor;
    public double walkSpeed;
    public double attackSpeed;
    public double attackPoints;
    public String weaponType;

    public String getName() {
        return name;
    }

    public Monster(String name, double healthPoints, double armor, double walkSpeed, double attackSpeed, double attackPoints, String weaponType) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.armor = armor;
        this.walkSpeed = walkSpeed;
        this.attackSpeed = attackSpeed;
        this.attackPoints = attackPoints;
        this.weaponType = weaponType;
    }

    // Rnadom dodges class, 20% for dodge
    private Random random = new Random();

    public Double getArmor() {
        return armor;
    }

    public Double getAttackSpeed() {
        return attackSpeed;
    }

    public double getAttackPoints() {
        return attackPoints;
    }

    public void attack(Monster target) {
        if (random.nextDouble() > 0.2) {
            double damageDealt = Math.max(0, attackPoints - target.getArmor());
            target.receiveDamage(damageDealt);
        }
        else {
            System.out.println(target.getName() + " has dodged the attack!");
        }
    }
    public void receiveDamage(double attackPoints) {
        healthPoints -= attackPoints;
    }
}
