package com.mygdx.game.consoleGame.units;

import com.mygdx.game.consoleGame.util.ArrayList;

public class Ranger extends Skill {
    public Ranger(float hp, curHp, String name, int[] damage, int attack, int initiative, int x, int y, int nT) {
        //super(10, curHp, name, damage, attack, initiative, x, y, nT);
        super(name, 20, new int[]{-1, -5}, 5, x, y, nT);
        super(name, 20, new int[]{-1, -5}, 5, x, y, nT, 5);


    //Ranger ranger = new Ranger ();
    //hp = 80;
    curHp =15;
    //int damage = 10;
    //int attack = 20;
    //initiative = 5;

    }

    public void step(ArrayList<Skill> teamProtivnic, ArrayList<Skill>team) {
        if (this.curHp == 0) return;
        status = "Stand";
        //int k = findNearest(teamProtivnic);
    }
    //public void attack() {
        //System.out.println("Рейнджер атакует");
    //}

    //public void defend() {
        //System.out.println("Рейнджер защищается");
    //}

    //public void useAbility() {
        //System.out.println("Рейнджер использует способность");
    //}

    //public int getAttackPower() {
        //return attack;
    //}

    //public void step() {
    //}

    //public String getInfo() {
        //String s = getClass().getName();
        //return s;
    }
}