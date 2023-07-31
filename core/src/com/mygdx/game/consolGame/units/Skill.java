package com.mygdx.game.consoleGame.units;

import com.mygdx.game.consoleGame.util.ArrayList;
import com.mygdx.game.consoleGame.util.Arrays;
//import map.Coordinates;

public abstract class Skill extends InGameInterface {
    public String name;
    public float hp;
    public float curHp;
    public int damage;
    public int attack;
    public int initiative;
    public int String status;
    public Coordinats coordinats;

    public int numberTeam;

    public Skill(String , float hp, int[]damage, int attack, int Initiative, int x, int y, int numberTeam) {
        this.hp = this.curHp = hp;
        this.name = name;
        this.damage = damage;
        this.attack = attack;
        this.coordinats = new Coordinats(x, y);
        this.numberTeam = numberTeam;
        this.initiative = Initiative;
        this.status = "Stand";

    }
    //public abstract void attack();
    //public abstract void defend();
    //public abstract void useAbility();

    //public void printStats() {
        //System.out.println(getClass().getSimpleName() + ":");
        //System.out.println("Здоровье: " + hp);
        //System.out.println("Здоровье сейчас: " + curHp);
        //System.out.println("Сила: " + damage);
        //System.out.println("Ловкость: " + attack);
        //System.out.println("Интеллект: " + initiative);
    //}

    //public void increaseHp(int amount) {
        //hp += amount;
    //}

    //public void decreasehp(int amount) {
        //hp -= amount;
    //}

    //public void increasecurHp(int amount) { curHp += amount;
    //}

    //public void decreasecurHp(int amount) {
        //curHp -= amount;
    //}

    //public void increaseDamage(int amount) {
        //damage += amount;
    //}

    //public void decreaseDamage(int amount) {
        //damage -= amount;
    //}

    //public void increaseAttack(int amount) {
        //attack += amount;
    //}

    //public void decreaseAttack(int amount) {
        //attack -= amount;
    //}

    //public void increaseinitiative(int amount) {
        //initiative += amount;
    //}

    //public void decreaseinitiative(int amount) {
        //initiative -= amount;
    //}

    //public abstract int getAttackPower();

    //public void attack(Skill target) {
        //int damage = getAttackPower();
        //System.out.println(getClass().getSimpleName() + " атакует " + target.getClass().getSimpleName() + " и наносит " + damage + " урона");
        //target.takeDamage(damage);
    //}
    //@Override
    public int findNearest(ArrayList<Skill>teamProtivnic) {
        //for (int i = 0; i < 10; i++) {
        ArrayList<Skill> notDeadTeam = new ArrayList<Skill>();
        for (Skill s : teamProtivnic) {
            if (!s. isDead()) notDeadTeam.add(s);
        }

            int minR = this.coordinats.rastoynie(notDeadTeam.get(0).coordinats);
            int k = 0;

            for (int i = 1; i < notDeadTeam.size(); i++) {
                int R = this.coordinats.rastoynie(notDeadTeam.get(i).coordinats);

                if (R < minR) {
                    minR = R;
                    k = i;
                }

            }
            //System.out.println(getClass().getName()+" "+name+" "+teamProtivnic.get(k).name+" "+minR);
            return k;

    }

    //public void step (ArrayList<Skill>teamProtivnic) {
    //            findNearest(teamProtivnic);
    //}


    public String getInfo(){

        return String.format(" %s %s %s \u2764: %s \u2661: %s \u2694: %s In: %s  X: %s Y: %s",this.getClass().getSimpleName(),this.name,
                this.status, this.hp, this.curHp, Arrays.toString(this.damage) , this.initiative, this.coordinats.x, this.coordinats.y);

    }
    protected void getDamage(float damage){
        this.curHp -= damage;
        if(this.curHp <= 0){
            this.status = "Dead";
            this.curHp = 0;
        }
        if(this.curHp>this.hp) {
            this.curHp = this.hp;
        }
    }
    public int[] getCoords(){
        int[] coord = new int[2];
        coord[0] = this.coordinats.x;
        coord[1] = this.coordinats.y;

        return coord;
    }
    public float getHp(){
        return this.curHp;
    }

    public boolean isDead(){
        if (this.status == "Dead") return true;
        return false;
    }
}
