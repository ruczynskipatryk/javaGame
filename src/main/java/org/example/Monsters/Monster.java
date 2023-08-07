package org.example.Monsters;

public class Monster {
    public String name;
    public double healthPoints;
    public double walkSpeed;
    public double attackPoints;

    public String getName() {
        return name;
    }

    public Monster() {
        System.out.println("Basic constructor from monster class.");
    }

    public Monster(double healthPoints, double walkSpeed, double attackPoints) {
        this.healthPoints = healthPoints;
        this.walkSpeed = walkSpeed;
        this.attackPoints = attackPoints;
        System.out.println("Non basic constructor from monster class.");
    }

    public void attack(Monster target) {
        target.receiveDamage(attackPoints);
        System.out.println(name + " attacks " + target.getName() + " for " + attackPoints + " damage!");
    }

    public void receiveDamage(double attackPoints) {
        healthPoints -= attackPoints;
        if (healthPoints <= 0) {
            System.out.println(name + " has been defeated!");
        }
    }
}
