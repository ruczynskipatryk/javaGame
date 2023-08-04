package org.example;

import org.example.Monsters.*;

public class Main {
    public static void main(String[] args) {
        Skeleton s = new Skeleton(50, 13, 30, "Bow");

        Warrior w = new Warrior(120, 8, 30, "Sword");

        Zombie z = new Zombie(200, 5, 25, "Hands");

        Hunter h = new Hunter(70, 11, 27, "Crossbow");



    }
}