package org.example.Monsters;

public class Hunter extends Monster {

    String weaponType;
    public Hunter() {
        System.out.println("Basic constructor from Hunter class.");
    }

    public Hunter(double healthPoints,double walkSpeed, double attackPoints, String weaponType){
        super(healthPoints, walkSpeed, attackPoints);
        this.weaponType = weaponType;
        System.out.println("Non basic constructor from Hunter class.");
    }

}