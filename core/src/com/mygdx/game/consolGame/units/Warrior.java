package com.mygdx.game.consoleGame.units;

import com.mygdx.game.consoleGame.util.ArrayList;

public class Warrior extends Skill {
    public Warrior(float hp, String name, int[]damage, int attack, int initiative, int x, int y, int nT) {
        super(hp, name, damage, attack, initiative, x, y, nT);
        //hp = 100;
        //curHp = 10;
        //int damage = 20;
        //int attack = 5;
        //initiative = 5;
    }

    public void attack() {
        System.out.println("Воин атакует");
    }

    public void defend() {
        System.out.println("Воин защищается");
    }

    public void useAbility() {
        System.out.println("Воин использует способность");
    }

    public int getAttackPower() {
        return attack;
    }

    public void step() {
        System.out.println("Шаг вперёд!");
    }
    public String getInfo() {
        String s = getClass().getName();
        return s;
    }

    public void step(ArrayList<Skill> teamProtivnic) {
        int k = findNearest(teamProtivnic);
    }


}