package org.example;

import org.example.Monsters.*;

public class Main {
    public static void main(String[] args) {
        // Bright side classes
        Warrior wo = new Warrior("Warrior",120, 8, 25, "Sword");
        Hunter ht = new Hunter("Hunter", 70, 11, 27, "Crossbow");
        Mage mg = new Mage("Mage", 65, 10, 35, "Wand");
        Priest pe = new Priest("Priest", 175, 20, 10, "Lace");
        Barbarian bb = new Barbarian("Barbarian", 200, 7, 20, "Saber");

        // Dark side classes
        Skeleton s = new Skeleton("Skeleton", 50, 13, 30, "Bow");
        Zombie zb = new Zombie("Zombie", 200, 5, 10, "Hands");
        Assasin aa = new Assasin("Assasin", 60, 13, 30, "Daggers");
        Goblin gl = new Goblin("Goblin", 80, 12, 23, "Knife");
        Warlock wl = new Warlock("Warlock", 65, 11, 35, "Wand");


        // First fight simulations
        Skeleton monster1 = new Skeleton("Skeleton", 100, 5, 20, "bow");
        Mage monster2 = new Mage("Mage", 120, 4, 15, "wand");

        fightingArena arena = new fightingArena(s, mg);
        arena.startBattle();
    }
}