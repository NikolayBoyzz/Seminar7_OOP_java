package units;

import com.mygdx.game.consoleGame.util.ArrayList;

public interface InGameInterface {
    //void step(ArrayList<Skill> teamProtivnic);
    void step(ArrayList<Skill> teamProtivnic, ArrayList<Skill>team);
    String getInfo();
}
