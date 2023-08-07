package org.example.Monsters;

public class Hunter extends Monster {

    String weaponType;

    public Hunter(double healthPoints,double walkSpeed, double attackPoints, String weaponType){
        super(healthPoints, walkSpeed, attackPoints);
        this.weaponType = weaponType;
    }

}