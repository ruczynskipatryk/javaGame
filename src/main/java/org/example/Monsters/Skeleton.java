package org.example.Monsters;

public class Skeleton extends Monster {

    String weaponType;

    public Skeleton(double healthPoints,double walkSpeed, double attackPoints, String weaponType){
        super(healthPoints, walkSpeed, attackPoints);
        this.weaponType = weaponType;
    }

}
