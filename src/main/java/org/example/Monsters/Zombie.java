package org.example.Monsters;

public class Zombie extends Monster {

    String weaponType;
    public Zombie() {
        System.out.println("Basic constructor from Zombie class.");
    }

    public Zombie(double healthPoints,double walkSpeed, double attackPoints, String weaponType){
        super(healthPoints, walkSpeed, attackPoints);
        this.weaponType = weaponType;
        System.out.println("Non basic constructor from Zombie class.");
    }

}