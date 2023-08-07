package org.example.Monsters;

public class Warrior extends Monster {

    String weaponType;
    public Warrior(double healthPoints,double walkSpeed, double attackPoints, String weaponType){
        super(healthPoints, walkSpeed, attackPoints);
        this.weaponType = weaponType;
    }

}