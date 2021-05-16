package com.ironhack;

import java.util.Random;

public class Warrior extends Character implements Attacker {

    private int stamina;
    private int strength;

    public Warrior(String name) {
        super(name);
        this.hp = randomHP();
        this.stamina = randomStamina();
        this.strength = randomStrength();
    }

    // methods
    public int randomHP(){
        Random rand = new Random();
        int randomHP = 100 + rand.nextInt(100);
        return randomHP;
    }

    public int randomStamina(){
        Random rand = new Random();
        int randomStamina = 10 + rand.nextInt(40);
        return randomStamina;
    }

    public int randomStrength(){
        Random rand = new Random();
        int randomStrength = rand.nextInt(10);
        return randomStrength;
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
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
