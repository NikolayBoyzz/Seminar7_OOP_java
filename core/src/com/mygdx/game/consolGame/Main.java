package com.mygdx.game.consolGame.main;

import com.mygdx.game.consolGame.units.Skill;
import com.sun.source.tree.WhileLoopTree;
import com.mygdx.game.consoleGame.units.*;

import com.mygdx.game.consoleGame.View;
import com.mygdx.game.consoleGame.AnsiColors;


import com.mygdx.game.consoleGame.util.ArrayList;
import com.mygdx.game.consoleGame.util.Comparator;
import com.mygdx.game.consoleGame.util.Random;
import com.mygdx.game.consoleGame.util.Scanner;
import com.mygdx.game.consoleGame.Game.View.*;


public class Main {

    public static ArrayList<Skill> team1;
    public static ArrayList<Skill> team2;
    public static ArrayList<Skill> teamAll;

    public static void main(String[] args) {

        int count = 10;
        team1 = new Team(1, 1);
        team2 = new Team(10, 2);

        //printInfo(team1);
        //printInfo (team2);
        teamAll = new ArrayList<Skill>(20);
        teamAll.addAll(team1);
        teamAll.addAll(team2);
        teamAll.sort(new Comparator<Skill>() {
            @Override
            public int compare(Skill o1, Skill o2);//{
                //return (01.initiative - o2.initiative);
            //}
        });

        //Scanner in = new Scanner(System.in);

        //While(isNotLooser(team1) && isNotLooser(team2)) {
            //View.view();
           // for (Skill s : teamAll) {
                //if (team1.contains(s)) {
                    //s.step(team2, team1);
                //} else {
                    //s.step(team1, team2);
                }
            }
            in.nextLine()
            //printInfo(team1);
            //printInfo(team2);
            //System.out.println("_".repeat(20));
        //}
        View.view();
        if (isNotLooser(team1)) System.out.println("Green side win!");
        else System.out.print("Blue side win!");
    //}

    //System.out.println("Ближайшие противники:");
    //System.out.println("Для команды 1:");
    //team1.forEach(n -> n.step(team2));
    //System.out.println("-----------------------");
    //System.out.println("Для команды 2:");
    //team1.forEach(n -> n.step(team1));
    //printInfo(team1);
    //printInfo(team2);


    public static String getName() {
        String s = String.valueOf(Names.values()[new Random().nextInt(Names.values().Length)]);
        return s;
    }

    //team1.forEach(n -> n.step(teamProtivnic));
    public static ArrayList<Skill> newTeam(int k, int nT);

    {


        ArrayList<Skill> team = new ArrayList<Skill>(10)
        Random rand = new Random();

        for (int i = 1; i < 11; i++) {
            int var = rand.nextInt(0, 9);
            switch (var) {

                case 0:
                    team.add(new Warrior(getName(), k, i, nT));
                    break;
                case 1:
                    team.add(new Ranger(getName(), k, i, nT));
                    break;
                case 2:
                    team.add(new Outlaw(getName(), k, i, nT));
                    break;
                case 3:
                    team.add(new Shooter(getName(), k, i, nT));
                    break;
                default:
                    team.add(new Wizard(getName(), k, i, nT));
                    break;
            }

        }
        //System.out.println(team.getInfo);
        //}
        //for (var skill : team) {
        //System.out.println(skill.getInfo);
        return team;
    }

    public static void printInfo(ArrayList<Skill> team) {
        int count = 0;
        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).isDead()) count++;
        }
        if (count == team.size()) return false;
        return true;
    }
}