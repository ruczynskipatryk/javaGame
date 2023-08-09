 package org.example.Monsters;

public class Mage extends Monster {

    String weaponType;

    public Mage(String name, double healthPoints, double walkSpeed, double attackPoints, String weaponType){
        super(name, healthPoints, walkSpeed, attackPoints);
        this.weaponType = weaponType;
    }

}

