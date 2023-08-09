package org.example;

import org.example.Monsters.*;
import org.example.fightingArena;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Monster> availableMonstersBrightSide = new ArrayList<>();
        availableMonstersBrightSide.add(new Hunter ("Hunter", 70, 11, 27, "Crossbow"));
        availableMonstersBrightSide.add(new Warrior("Warrior",150, 4, 25, "Sword"));
        availableMonstersBrightSide.add(new Mage("Mage", 65, 10, 35, "Wand"));
        availableMonstersBrightSide.add(new Priest("Priest", 175, 20, 10, "Lace"));
        availableMonstersBrightSide.add(new Barbarian("Barbarian", 200, 7, 20, "Saber"));

        List<Monster> availableMonstersDarkSide = new ArrayList<>();
        availableMonstersDarkSide.add(new Skeleton("Skeleton", 100, 17, 11, "Bow"));
        availableMonstersDarkSide.add(new Goblin("Goblin", 80, 6, 19, "Knife"));
        availableMonstersDarkSide.add(new Zombie("Zombie", 200, 5, 10, "Hands"));
        availableMonstersDarkSide.add(new Assasin("Assasin", 60, 13, 30, "Daggers"));
        availableMonstersDarkSide.add(new Warlock("Warlock", 65, 11, 35, "Wand"));

        Random random = new Random();
        Monster randomMonsterBrightSide = availableMonstersBrightSide.get(random.nextInt(availableMonstersBrightSide.size()));
        Monster randomMonsterDarkSide = availableMonstersDarkSide.get(random.nextInt(availableMonstersDarkSide.size()));

        fightingArena arena = new fightingArena(randomMonsterBrightSide, randomMonsterDarkSide);
        arena.startBattle(randomMonsterBrightSide.getName(), randomMonsterDarkSide.getName());
    /*
        // Bright side classes
        Warrior wo = new Warrior("Warrior",150, 4, 25, "Sword");
        Hunter ht = new Hunter("Hunter", 70, 11, 27, "Crossbow");
        Mage mg = new Mage("Mage", 65, 10, 35, "Wand");
        Priest pe = new Priest("Priest", 175, 20, 10, "Lace");
        Barbarian bb = new Barbarian("Barbarian", 200, 7, 20, "Saber");

        // Dark side classes
        Goblin gl = new Goblin("Goblin", 80, 6, 19, "Knife");
        Skeleton sk = new Skeleton("Skeleton", 100, 17, 11, "Bow");
        Zombie zb = new Zombie("Zombie", 200, 5, 10, "Hands");
        Assasin aa = new Assasin("Assasin", 60, 13, 30, "Daggers");
        Warlock wl = new Warlock("Warlock", 65, 11, 35, "Wand");

        // First fight simulations

        fightingArena arena = new fightingArena(gl, wo);
        arena.startBattle("Goblin", "Warrior");
     */
    }
}