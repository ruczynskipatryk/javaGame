package org.example.Monsters;

public class Warlock extends Monster {

    String weaponType;
    public Warlock() {
        System.out.println("Basic constructor from Warlock class.");
    }

    public Warlock(double healthPoints,double walkSpeed, double attackPoints, String weaponType){
        super(healthPoints, walkSpeed, attackPoints);
        this.weaponType = weaponType;
        System.out.println("Non basic constructor from Warlock class.");
    }

}