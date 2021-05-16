package com.ironhack;

import java.util.Random;
import java.util.UUID;

abstract class Character {
    private String id = UUID.randomUUID().toString();
    protected String name;
    protected int hp;
    protected boolean alive;

    public Character(String name) {
        this.alive = true;
        this.name = name;
    }

    // methods

//    public String randomName(){
//        String[] nameArray = {"Tim", "Carla", "Kevin", "Kia", "Felix", "Fiona", "Florian", "Agathe", "Cassiopeia", "Kunigunde", "Rasmus", "Caesar", "Maria", "Lara"};
//        Random rand = new Random();
//        int random = rand.nextInt(nameArray.length);
//        return nameArray[random];
//    }


    // setters + getters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
