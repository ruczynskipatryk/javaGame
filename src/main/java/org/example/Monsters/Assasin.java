package org.example.Monsters;

public class Assasin extends Monster {

    String weaponType;
    public Assasin() {
        System.out.println("Basic constructor from Assasin class.");
    }

    public Assasin(double healthPoints,double walkSpeed, double attackPoints, String weaponType){
        super(healthPoints, walkSpeed, attackPoints);
        this.weaponType = weaponType;
        System.out.println("Non basic constructor from Assasin class.");
    }

}