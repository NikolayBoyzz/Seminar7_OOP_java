package com.mygdx.game.consoleGame.units;

import com.mygdx.game.consoleGame.util.ArrayList;
public abstract class Shooter extends Skill {
    int range; // дальность выстрела
    int capacity; // кол-во выстрелов

    public Shooter(String name, float hp, int[]damage, int attack, int range, int capacity, int x, int y, int nT) {
        super(name, hp, damage, attack, x, y, nT, int initiative); {

            super(name, hp, damage, attack, x, y, initiative);
            this.range = range;
            this.capacity = capacity;

            public void step (ArrayList<Skill>teamProtivnic, ArrayList<Skill>team);
            {
                if (this.curHp == 0) return;
                if (this.capacity == 0) return;//вместимость

                int k = super.findNearest(teamProtivnic);
                teamProtivnic.get(k).getDamage -= (this.damage[1] + this.damage[0]) / 2;

                for (int i = 0; i < team.size(); i++) {
                    if (team.get(i).getClass().equals("Ranger")&& team.get(i).status.equals("stand")){
                        team.get(i).status = "busy";
                        return;
                    }

                }
                this.capacity -=1;

            }
        }
    }

}
