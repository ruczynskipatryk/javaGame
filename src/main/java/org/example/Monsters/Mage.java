package org.example.Monsters;

public class Mage extends Monster {

    String weaponType;

    public Mage(double healthPoints,double walkSpeed, double attackPoints, String weaponType){
        super(healthPoints, walkSpeed, attackPoints);
        this.weaponType = weaponType;
    }

}