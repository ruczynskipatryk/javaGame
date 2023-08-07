package org.example.Monsters;

public class Priest extends Monster {

    String weaponType;

    public Priest(double healthPoints,double walkSpeed, double attackPoints, String weaponType){
        super(healthPoints, walkSpeed, attackPoints);
        this.weaponType = weaponType;
    }

}