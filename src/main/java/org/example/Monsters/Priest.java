package org.example.Monsters;

public class Priest extends Monster {

    String weaponType;
    public Priest() {
        System.out.println("Basic constructor from Priest class.");
    }

    public Priest(double healthPoints,double walkSpeed, double attackPoints, String weaponType){
        super(healthPoints, walkSpeed, attackPoints);
        this.weaponType = weaponType;
        System.out.println("Non basic constructor from Priest class.");
    }

}