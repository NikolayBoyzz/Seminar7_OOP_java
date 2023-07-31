package units;

import com.mygdx.game.consoleGame.util.ArrayList;


public abstract class Infantry extends  Skill {
    int armor;

    public Infantry (String name, float hp, int[] damage, int attack, int armor, int x, int y, int nT, int initiative) {
        super(name, hp, damage, attack, x, y, nT, initiative);
        this.armor = armor;
    }

    @Override
    public void step (ArrayList<Skill> teamProtivnic, ArrayList<Skill> team) {
        if (this.curHp == 0) return;
        int k = super.findNearest(teamProtivnic);
        int[] coordStep = coordinats.coordStep(teamProtivnic.get(k).coordinats);
        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).coordinats.x == coordStep[0] && team.get(i).coordinats.y == coordStep[1]) {
                return;
            }
        }
        if (teamProtivnic.get(k).coordinats.x == coordStep[0] && teamProtivnic.get(k).coordinats.y == coordStep[1]) {
            teamProtivnic.get(k).getDamage((this.damage[1] + this.damage[0]) / 2);
            return;
        }
        this.coordinats.x = coordStep[0];
        this.coordinats.y = coordStep[1];

    }
}
