package com.ironhack;

public class Main {
    public static void main(String[] args) {

        // first Game Setup
        Game g1 = new Game();
        g1.gameDetails();



        // Spiel zwischen einem Warrior und einem Wizard
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
