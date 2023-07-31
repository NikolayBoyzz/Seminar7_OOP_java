package com.mygdx.game.consoleGame.units;

import com.mygdx.game.consoleGame.util.ArrayList;

public class Outlaw extends Skill {
    public Outlaw(String name, int x, int y, int nT) {
        super(name, 10, new int[]{3, 5}, x, y, nT);

        //hp = 70;
        //curHp = 20;
        //int damage = 10;
        //int attack = 15;
        //initiative = 5;
    }

    //public void attack() {
        //System.out.println("Разбойник атакует");
    //}

    //public void defend() {
        //System.out.println("Разбойник защищается");
    //}

    //public void useAbility() {
        //System.out.println("Разбойник использует способность");
    //}

    //public int getAttackPower() {
        //return damage + attack;
    //}

    //public void step(ArrayList<Skill>teamProtivnic) {
        //int k = findNearest(teamProtivnic);
    //}

    //public String getInfo() {
        //String s = getClass().getName();
        //return s;
    //}
}