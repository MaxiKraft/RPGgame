package com.ironhack;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    private Warrior warrior;
    private Wizard wizard;
    private Warrior[] warriors;
    private Wizard[] wizards;

    private Random random;

    private static String[] names = {"Tim", "Carla", "Kevin", "Kia", "Felix", "Fiona", "Florian", "Agathe", "Cassiopeia", "Kunigunde", "Rasmus", "Caesar", "Maria", "Lara"};

    public Game(){
        this.random = new Random();
        this.warriors = new Warrior[random.nextInt(4)+1];
        for (int i = 0; i < warriors.length; i++) {
            this.warriors[i] = new Warrior("Warrior " + names[random.nextInt(names.length)]);
        }
        this.wizards = new Wizard[random.nextInt(4)+1];
        for (int i = 0; i < wizards.length; i++) {
            this.wizards[i] = new Wizard("Wizard " + names[random.nextInt(names.length)]);
        }
    }

    // show details

    public void gameDetails(){
        String x = "Party consists of: ";
        for (Warrior warrior: warriors) {
            x += warrior.getName() + " | ";
        }
        for (Wizard wizard: wizards) {
            x += wizard.getName() + " | ";
        }
        System.out.println(x);
    }


    // getters + setters


    public Warrior[] getWarriors() {
        return warriors;
    }

    public void setWarriors(Warrior[] warriors) {
        this.warriors = warriors;
    }

    public Wizard[] getWizards() {
        return wizards;
    }

    public void setWizards(Wizard[] wizards) {
        this.wizards = wizards;
    }

    public Warrior getWarrior() {
        return warrior;
    }

    public void setWarrior(Warrior warrior) {
        this.warrior = warrior;
    }

    public Wizard getWizard() {
        return wizard;
    }

    public void setWizard(Wizard wizard) {
        this.wizard = wizard;
    }
}
