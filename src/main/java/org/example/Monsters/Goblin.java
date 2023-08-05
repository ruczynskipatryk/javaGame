package org.example.Monsters;

public class Goblin extends Monster {

    String weaponType;
    public Goblin() {
        System.out.println("Basic constructor from Goblin class.");
    }

    public Goblin(double healthPoints,double walkSpeed, double attackPoints, String weaponType){
        super(healthPoints, walkSpeed, attackPoints);
        this.weaponType = weaponType;
        System.out.println("Non basic constructor from Goblin class.");
    }

}