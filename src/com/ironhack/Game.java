package com.ironhack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {

    private Warrior[] warriors;
    private Wizard[] wizards;
    private List<Character> party1;
    private List<Character> party2;

    private Random random;

    private static String[] names = {"Tim", "Carla", "Kevin", "Kia", "Felix", "Fiona", "Florian", "Agathe", "Cassiopeia", "Kunigunde", "Rasmus", "Caesar", "Maria", "Lara"};

    public Game(){
        this.random = new Random();

        this.party1 = new ArrayList<Character>();
        this.warriors = new Warrior[random.nextInt(4)+1];
        for (int i = 0; i < warriors.length; i++) {
            party1.add(new Warrior("Warrior " + names[random.nextInt(names.length)]));
        }
        this.wizards = new Wizard[random.nextInt(4)+1];
        for (int i = 0; i < wizards.length; i++) {
            party1.add(new Wizard("Wizard " + names[random.nextInt(names.length)]));
        }

        this.party2 = new ArrayList<Character>();
        this.warriors = new Warrior[random.nextInt(4)+1];
        for (int i = 0; i < warriors.length; i++) {
            party2.add(new Warrior("Warrior " + names[random.nextInt(names.length)]));
        }
        this.wizards = new Wizard[random.nextInt(4)+1];
        for (int i = 0; i < wizards.length; i++) {
            party2.add(new Wizard("Wizard " + names[random.nextInt(names.length)]));
        }


    }

    // show details

    public void gameDetails(){
        String x = "1. Party consists of: ";

        for (Character member: party1) {
            x += member.getName() + " | ";
        }

        String y = "2. Party consists of: ";
        for (Character member: party2) {
            y += member.getName() + " | ";
        }
        System.out.println(x);
        System.out.println(y);
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

}
