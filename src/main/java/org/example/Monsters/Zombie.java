package org.example.Monsters;

public class Zombie extends Monster {

    String weaponType;

    public Zombie(double healthPoints,double walkSpeed, double attackPoints, String weaponType){
        super(healthPoints, walkSpeed, attackPoints);
        this.weaponType = weaponType;
    }

}