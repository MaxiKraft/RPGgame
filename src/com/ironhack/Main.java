package com.ironhack;

import java.util.Random;

public class Main {
    public static void main(String[] args) {


        Game g1 = new Game();
        g1.gameDetails();


        Warrior w1 = new Warrior("Katja");
        Wizard wz1 = new Wizard("Gerhard");
        System.out.println(w1.getHp());
        System.out.println(w1.getStamina());
        System.out.println(w1.getStrength());

        System.out.println(wz1.getHp());
        System.out.println(wz1.getMana());
        System.out.println(wz1.getIntelligence());

        while(w1.isAlive() && wz1.isAlive()){
                wz1.takeDamage(w1.attack());
                w1.takeDamage(wz1.attack());
        }
        if(w1.isAlive()) System.out.println(w1.getName() + " has won!");
        else System.out.println(wz1.getName() + " has won!");

    }
}
