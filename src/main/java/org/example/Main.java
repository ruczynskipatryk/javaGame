package org.example;

import org.example.Monsters.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Monster> availableMonstersBrightSide = new ArrayList<>();
        availableMonstersBrightSide.add(new Hunter ("Hunter", 100, 5, 11, 0.1, 28, "Crossbow"));
        availableMonstersBrightSide.add(new Warrior("Warrior",180, 10, 4, 0.1, 23, "Sword"));
        availableMonstersBrightSide.add(new Mage("Mage", 100, 3, 10, 0.1,30, "Wand"));
        availableMonstersBrightSide.add(new Priest("Priest", 250, 3, 10, 0.1, 13, "Lace"));
        availableMonstersBrightSide.add(new Barbarian("Barbarian", 200, 8, 7, 0.1, 22, "Saber"));
        availableMonstersBrightSide.add(new Rogue("Rogue", 120, 6, 11, 0.1,20, "Daggers"));

        List<Monster> availableMonstersDarkSide = new ArrayList<>();
        availableMonstersDarkSide.add(new Skeleton("Skeleton", 100, 1, 17, 0.9, 23, "Bow"));
        availableMonstersDarkSide.add(new Goblin("Goblin", 90, 7, 6, 0.9, 29, "Knife"));
        availableMonstersDarkSide.add(new Zombie("Zombie", 300,1, 4, 0.9, 10, "Hands"));
        availableMonstersDarkSide.add(new Assasin("Assasin", 120, 6, 11, 0.9, 20, "Daggers"));
        availableMonstersDarkSide.add(new Warlock("Warlock", 100, 3, 10, 0.9, 30, "Wand"));
        availableMonstersDarkSide.add(new Orc("Orc", 180, 10, 4, 0.9, 23, "Sword"));

        Random random = new Random();
        Monster randomMonsterBrightSide = availableMonstersBrightSide.get(random.nextInt(availableMonstersBrightSide.size()));
        System.out.println("Your random Monster from Bright Side is: " + randomMonsterBrightSide.getName());
        Monster randomMonsterDarkSide = availableMonstersDarkSide.get(random.nextInt(availableMonstersDarkSide.size()));
        System.out.println("Your random Monster from Dark Side is: " + randomMonsterDarkSide.getName());

        fightingArena arena = new fightingArena(randomMonsterBrightSide, randomMonsterDarkSide);
        arena.startRealTimeBattle(randomMonsterBrightSide.getName(), randomMonsterDarkSide.getName());

    }
}