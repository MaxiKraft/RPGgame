package com.ironhack;

import java.util.Random;

public class Main {
    public static void main(String[] args) {


        Game g1 = new Game();
        Game g2 = new Game();



        Warrior w1 = new Warrior("Katja");
        Wizard wz1 = new Wizard("Gerhard");


        while(w1.isAlive() && wz1.isAlive()){
                wz1.takeDamage(w1.attack());
                w1.takeDamage(wz1.attack());
        }
        if(w1.isAlive()) System.out.println(w1.getName() + " has won!");
        else System.out.println(wz1.getName() + " has won!");

    }
}
