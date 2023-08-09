package org.example;

import org.example.Monsters.*;
import org.example.fightingArena;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Monster> availableMonsters


        // Bright side classes
        Hunter ht = new Hunter("Hunter", 70, 11, 27, "Crossbow");
        Mage mg = new Mage("Mage", 65, 10, 35, "Wand");
        Priest pe = new Priest("Priest", 175, 20, 10, "Lace");
        Barbarian bb = new Barbarian("Barbarian", 200, 7, 20, "Saber");

        // Dark side classes
        Skeleton sk = new Skeleton("Skeleton", 100, 17, 11, "Bow");
        Zombie zb = new Zombie("Zombie", 200, 5, 10, "Hands");
        Assasin aa = new Assasin("Assasin", 60, 13, 30, "Daggers");
        Warlock wl = new Warlock("Warlock", 65, 11, 35, "Wand");



        Warrior wo = new Warrior("Warrior",150, 4, 25, "Sword");

        Goblin gl = new Goblin("Goblin", 80, 6, 19, "Knife");



        // First fight simulations

        fightingArena arena = new fightingArena(gl, wo);
        arena.startBattle("Goblin", "Warrior");
    }
}