package org.example.Monsters;

public class Mage extends Monster {

    String weaponType;
    public Mage() {
        System.out.println("Basic constructor from Mage class.");
    }

    public Mage(double healthPoints,double walkSpeed, double attackPoints, String weaponType){
        super(healthPoints, walkSpeed, attackPoints);
        this.weaponType = weaponType;
        System.out.println("Non basic constructor from Mage class.");
    }

}