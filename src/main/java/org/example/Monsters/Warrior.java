package org.example.Monsters;

public class Warrior extends Monster {

    String weaponType;
    public Warrior() {
        System.out.println("Basic constructor from Warrior class.");
    }

    public Warrior(double healthPoints,double walkSpeed, double attackPoints, String weaponType){
        super(healthPoints, walkSpeed, attackPoints);
        this.weaponType = weaponType;
        System.out.println("Non basic constructor from Warrior class.");
    }

}