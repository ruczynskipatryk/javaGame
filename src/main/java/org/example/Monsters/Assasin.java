package org.example.Monsters;

public class Assasin extends Monster {

    String weaponType;

    public Assasin(String name, double healthPoints, double walkSpeed, double attackPoints, String weaponType){
        super(name, healthPoints, walkSpeed, attackPoints);
        this.weaponType = weaponType;
    }

}