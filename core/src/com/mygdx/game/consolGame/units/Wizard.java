package com.mygdx.game.consoleGame.units;

import com.mygdx.game.consoleGame.util.ArrayList;
import com.mygdx.game.consoleGame.util.Comparator;

public class Wizard extends Skill {
    public Wizard(float hp, String name, int[]damage, int attack, int initiative, int x, int y, int nT) {
        super(hp, name, damage, attack, initiative, x, y, nT);
        //hp = 60;
        //curHp = 10;
        //int damage = 5;
        //int attack = 5;
        //initiative = 30;
    }

    public void attack() {
        System.out.println("Маг атакует");
    }

    public void defend() {
        System.out.println("Маг защищается");
    }

    public void useAbility() {
        System.out.println("Маг использует способность");
    }

    public int getAttackPower() {
        return initiative;
    }

    // @Override
    public String getInfo() {
        String s = getClass().getName();
        return s;
    }

    //@Override
    public void step(ArrayList<Skill> teamProtivnic, ArrayList<Skill>team) {
        team.sort(new Comparator<Skill>() {
            @Override
            public int compare(Skill o1, Skill o2) {
                return (int) ((o1.hp-o2.curHp)-(o2.hp-o2.curHp));
            }
        //int k = findNearest(teamProtivnic);
    }
    team.get(0).getDamage(damage[0]);
}