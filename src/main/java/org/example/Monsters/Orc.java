package org.example.Monsters;

public class Orc extends Monster {

    String weaponType;
    public Orc(String name, double healthPoints, double armour, double walkSpeed, double attackPoints, String weaponType){
        super(name, healthPoints, armour, walkSpeed, attackPoints, weaponType);
    }

}