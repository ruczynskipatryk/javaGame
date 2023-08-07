package org.example.Monsters;

public class Assasin extends Monster {

    String weaponType;

    public Assasin(double healthPoints,double walkSpeed, double attackPoints, String weaponType){
        super(healthPoints, walkSpeed, attackPoints);
        this.weaponType = weaponType;
    }

}