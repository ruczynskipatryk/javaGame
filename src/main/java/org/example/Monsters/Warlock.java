 package org.example.Monsters;

public class Warlock extends Monster {

    String weaponType;

    public Warlock(String name, double healthPoints, double walkSpeed, double attackPoints, String weaponType){
        super(name, healthPoints, walkSpeed, attackPoints);
        this.weaponType = weaponType;
    }

}

