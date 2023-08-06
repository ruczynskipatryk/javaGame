package org.example;

import org.example.Monsters.Mage;
import org.example.Monsters.Zombie;

public class fightingArena {
    private Zombie zombieFigher;
    private Mage mageFighter;

    public fightingArena(Zombie zombieFigher, Mage mageFighter) {
        this.zombieFigher = zombieFigher;
        this.mageFighter = mageFighter;
    }

    public void startBattle() {
        System.out.println("The battle beggins!");
    }
}
