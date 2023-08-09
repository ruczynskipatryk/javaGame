 package org.example.Monsters;

public class Barbarian extends Monster {

    String weaponType;

    public Barbarian(String name, double healthPoints, double walkSpeed, double attackPoints, String weaponType){
        super(name, healthPoints, walkSpeed, attackPoints);
        this.weaponType = weaponType;
    }

}
