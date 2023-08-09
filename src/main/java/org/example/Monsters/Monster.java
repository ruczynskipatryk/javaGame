package org.example.Monsters;

public class Monster {
    public String name;
    public double healthPoints;
    public double walkSpeed;
    public double attackPoints;

    public String getName() {
        return name;
    }

    public Monster(String name, double healthPoints, double walkSpeed, double attackPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.walkSpeed = walkSpeed;
        this.attackPoints = attackPoints;
    }

    public void attack(Monster target) {
        target.receiveDamage(attackPoints);
    }

    public void receiveDamage(double attackPoints) {
        healthPoints -= attackPoints;
        if (healthPoints <= 0) {
            System.out.println(name + " has been defeated!");
        }
    }
}
