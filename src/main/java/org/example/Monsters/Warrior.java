package org.example.Monsters;

public class Warrior extends Monster {
    String weaponType;
    public Warrior(String name, double healthPoints, double walkSpeed, double attackPoints, String weaponType){
        super(name, healthPoints, walkSpeed, attackPoints);
        this.weaponType = weaponType;
    }

}