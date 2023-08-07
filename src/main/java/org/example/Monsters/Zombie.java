package org.example.Monsters;

public class Zombie extends Monster {

    String weaponType;

    public Zombie(String name, double healthPoints, double walkSpeed, double attackPoints, String weaponType){
        super(name, healthPoints, walkSpeed, attackPoints);
        this.weaponType = weaponType;
    }

}