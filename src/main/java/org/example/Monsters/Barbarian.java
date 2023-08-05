package org.example.Monsters;

public class Barbarian extends Monster {

    String weaponType;
    public Barbarian() {
        System.out.println("Basic constructor from Barbarian class.");
    }

    public Barbarian(double healthPoints,double walkSpeed, double attackPoints, String weaponType){
        super(healthPoints, walkSpeed, attackPoints);
        this.weaponType = weaponType;
        System.out.println("Non basic constructor from Barbarian class.");
    }

}