package org.example.Monsters;

public class Barbarian extends Monster {

    String weaponType;

    public Barbarian(double healthPoints,double walkSpeed, double attackPoints, String weaponType){
        super(healthPoints, walkSpeed, attackPoints);
        this.weaponType = weaponType;
    }

}