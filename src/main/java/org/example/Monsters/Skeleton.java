package org.example.Monsters;

public class Skeleton extends Monster {

    String weaponType;
    public Skeleton() {
        System.out.println("Basic constructor from Skeleton class.");
    }

    public Skeleton(double healthPoints,double walkSpeed, double attackPoints, String weaponType){
        super(healthPoints, walkSpeed, attackPoints);
        this.weaponType = weaponType;
        System.out.println("Non basic constructor from Skeleton class.");
    }

}
