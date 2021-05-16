package com.ironhack;

import java.util.Random;

public class Warrior extends Character implements Attacker {

    private int stamina;
    private int strength;
    private Random rand;

    public Warrior(String name) {
        super(name);
        setHp(hp);
        setStamina(stamina);
        setStrength(strength);
    }

    // attack methods

    @Override
    public int attack() {
        int damage;
        if(stamina >= 5) {
            damage = strength;
            stamina -= 5;
            System.out.println(name + " attacks you with a Heavy Attack for " + damage + " of damage!");
        } else {
            damage = strength/2;
            System.out.println(name + " attacks you with a Weak Attack for " + damage + " of damage!");
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

    // setters + getters


    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.rand = new Random();
        this.stamina = 10 + rand.nextInt(40);
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.rand = new Random();
        this.strength = rand.nextInt(10);
    }

    public void setHp(int hp) {
        this.rand = new Random();
        this.hp = 100 + rand.nextInt(100);
    }

}
