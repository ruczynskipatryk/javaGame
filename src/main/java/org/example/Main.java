package org.example;

import org.example.Monsters.Monster;
import org.example.Monsters.Skeleton;

public class Main {
    public static void main(String[] args) {
        Monster m = new Monster(100, 10, 25);
        System.out.println(m.walkSpeed);

        Skeleton s = new Skeleton(50, 13, 30, "Elbow");
        System.out.println(s.walkSpeed);
        
    }
}