package com.ironhack;

import java.util.Random;

public class Wizard extends Character implements Attacker{

    private int mana;
    private int intelligence;

    public Wizard(String name) {
        super(name);
        this.hp = randomHP();
        this.mana = randomMana();
        this.intelligence = randomIntelligence();
    }

    public int randomHP(){
        Random rand = new Random();
        int random = 50 + rand.nextInt(50);
        return random;
    }

    public int randomMana(){
        Random rand = new Random();
        int randomMana = 10 + rand.nextInt(40);
        return randomMana;
    }

    public int randomIntelligence(){
        Random rand = new Random();
        int randomIntelligence = rand.nextInt(50);
        return randomIntelligence;
    }

    @Override
    public int attack() {
        int damage;
        if(mana >= 5) {
            damage = intelligence;
            mana -= 5;
            System.out.println(name + " attacks you with a Fireball for " + damage + " of damage!");
        } else {
            damage = 2;
            mana += 1;
            System.out.println(name + " attacks you with a Staff Hit for " + damage + " of damage!");
        }
        return damage;
    }



    @Override
    public void takeDamage(int damage){
        hp -= damage;
        if(hp <= 0) {
            alive = false;
            System.out.println(name + " has been slaughtered!");
        }
    }

    //setters + getters

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
}
