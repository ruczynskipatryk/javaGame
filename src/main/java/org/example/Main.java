package org.example;

import org.example.Monsters.*;
import org.example.fightingArena;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class Main {
        public static void main(String[] args) {



            List<Monster> availableMonstersBrightSide = new ArrayList<>();
            availableMonstersBrightSide.add(new Hunter("Hunter", 100, 5, 11, 7, 28, "Crossbow"));
            availableMonstersBrightSide.add(new Warrior("Warrior", 180, 10, 4, 6, 23, "Sword"));
            availableMonstersBrightSide.add(new Mage("Mage", 100, 3, 10, 5, 30, "Wand"));
            availableMonstersBrightSide.add(new Priest("Priest", 250, 3, 10, 4, 13, "Lace"));
            availableMonstersBrightSide.add(new Barbarian("Barbarian", 200, 8, 7, 6, 22, "Saber"));
            availableMonstersBrightSide.add(new Rogue("Rogue", 120, 6, 11, 8, 20, "Daggers"));

            List<Monster> availableMonstersDarkSide = new ArrayList<>();
            availableMonstersDarkSide.add(new Skeleton("Skeleton", 100, 1, 17, 7, 23, "Bow"));
            availableMonstersDarkSide.add(new Goblin("Goblin", 90, 7, 6, 7, 29, "Knife"));
            availableMonstersDarkSide.add(new Zombie("Zombie", 300, 1, 4, 3, 10, "Hands"));
            availableMonstersDarkSide.add(new Assasin("Assasin", 120, 6, 11, 8, 20, "Daggers"));
            availableMonstersDarkSide.add(new Warlock("Warlock", 100, 3, 10, 5, 30, "Wand"));
            availableMonstersDarkSide.add(new Orc("Orc", 180, 10, 4, 6, 23, "Sword"));

            Random random = new Random();
            Monster randomMonsterBrightSide = availableMonstersBrightSide.get(random.nextInt(availableMonstersBrightSide.size()));
            System.out.println("Your random Monster from Bright Side is: " + randomMonsterBrightSide.getName());
            Monster randomMonsterDarkSide = availableMonstersDarkSide.get(random.nextInt(availableMonstersDarkSide.size()));
            System.out.println("Your random Monster from Dark Side is: " + randomMonsterDarkSide.getName());

            fightingArena arena = new fightingArena(randomMonsterBrightSide, randomMonsterDarkSide);
            arena.startRealTimeBattle(randomMonsterBrightSide.getName(), randomMonsterDarkSide.getName());

            ScoreManager scoreManager = new ScoreManager();
            scoreManager.resetScoresIfNeeded();

            // Current Score
            System.out.println("_______________________________");
            System.out.println("Score from current day is:");
            System.out.println("Bright Side Points: " + scoreManager.getBrightSidePoints());
            System.out.println("Dark Side Points: " + scoreManager.getDarkSidePoints());
        }
}