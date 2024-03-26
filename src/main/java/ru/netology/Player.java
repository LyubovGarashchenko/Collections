package ru.netology;
public class Player {
    protected int id;

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    protected String name;
    protected int strength;

    public Player(int id, String name, int strength) {
        this.id = id;
        this.name = name;
        this.strength = strength;
    }
}
