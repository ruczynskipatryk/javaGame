package org.example;

import org.example.Monsters.*;

public class Main {
    public static void main(String[] args) {
        // Bright side classes
        Warrior wo = new Warrior(120, 8, 25, "Sword");
        Hunter ht = new Hunter(70, 11, 27, "Crossbow");
        Mage mg = new Mage(65, 10, 35, "Wand");
        Priest pe = new Priest(175, 20, 10, "Lace");
        Barbarian bb = new Barbarian(200, 7, 20, "Saber");

        // Dark side classes
        Skeleton s = new Skeleton(50, 13, 30, "Bow");
        Zombie zb = new Zombie(200, 5, 10, "Hands");
        Assasin aa = new Assasin(60, 13, 30, "Daggers");
        Goblin gl = new Goblin(80, 12, 23, "Knife");
        Warlock wl = new Warlock(65, 11, 35, "Wand");

        fightingArena arena = new fightingArena(Mage, Skeleton);
        arena.startBattle();
    }
}