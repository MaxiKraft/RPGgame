package com.ironhack;

import java.util.Random;

public class Wizard extends Character implements Attacker{

    private int mana;
    private int intelligence;

    public Wizard(String name) {
        super(name);
        setHp(hp);
        setMana(mana);
        setIntelligence(intelligence);
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
        Random rand = new Random();
        this.mana = 10 + rand.nextInt(40);
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        Random rand = new Random();
        this.intelligence = rand.nextInt(50);
    }
}
