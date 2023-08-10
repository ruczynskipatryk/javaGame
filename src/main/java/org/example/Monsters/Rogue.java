package org.example.Monsters;

public class Rogue extends Monster {

    String weaponType;
    public Rogue(String name, double healthPoints, double armour, double walkSpeed, double attackPoints, String weaponType){
        super(name, healthPoints, armour, walkSpeed, attackPoints, weaponType);
    }

}