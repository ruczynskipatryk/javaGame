package org.example.Monsters;

public class Goblin extends Monster {

    String weaponType;

    public Goblin(double healthPoints,double walkSpeed, double attackPoints, String weaponType){
        super(healthPoints, walkSpeed, attackPoints);
        this.weaponType = weaponType;
    }

}