package org.example.Monsters;

public class Skeleton extends Monster {

    String weaponType;

    public Skeleton(String name, double healthPoints, double walkSpeed, double attackPoints, String weaponType){
        super(name, healthPoints, walkSpeed, attackPoints);
        this.weaponType = weaponType;
    }

}



