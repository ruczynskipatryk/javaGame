package org.example.Monsters;

public class Monster {
    public double healthPoints;
    public double walkSpeed = 10;
    public double attackPoints;

    protected void attack() {

        System.out.println("Attack method check");
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
}
