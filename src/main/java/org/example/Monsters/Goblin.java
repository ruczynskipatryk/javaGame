package org.example.Monsters;

public class Goblin extends Monster {

    String weaponType;

    public Goblin(String name, double healthPoints, double walkSpeed, double attackPoints, String weaponType){
        super(name, healthPoints, walkSpeed, attackPoints);
        this.weaponType = weaponType;
    }

}