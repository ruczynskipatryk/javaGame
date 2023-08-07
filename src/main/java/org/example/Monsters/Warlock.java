package org.example.Monsters;

public class Warlock extends Monster {

    String weaponType;

    public Warlock(double healthPoints,double walkSpeed, double attackPoints, String weaponType){
        super(healthPoints, walkSpeed, attackPoints);
        this.weaponType = weaponType;
    }

}