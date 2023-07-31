package com.mygdx.game.consoleGame.units;

public abstract class People extends Skill {
    int armor;

    public People(String name, float hp, int[]damage, int attack, int armor, int x, int y, int nT, int initiative){
        super(name, hp, damage, attack, x, y, initiative);
        this.armor = armor;
    }
    //String getInfo;
}