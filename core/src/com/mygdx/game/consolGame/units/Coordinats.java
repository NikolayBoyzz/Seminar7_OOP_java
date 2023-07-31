package units;

import com.mygdx.game.consoleGame.sql.Array;
import com.mygdx.game.consoleGame.util.List;

public class Coordinats {
    int x;
    int y;

    public Coordinats(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //@Override
    public String toString() {
        return "x: " + x + " y: " + y;
    }

    public int[] toArray() {
        return new int[]{x, y};
    }

    public int rastoynie(Coordinats coordProtvnic) {
        return (int) Math.sqrt(Math.pow(x - coordProtvnic.toArray()[0], 2) + Math.pow(y - coordProtvnic.toArray()[1], 2));

    }

    public int [] coordStep(Coordinats coordP) {
        int [] coordStep = {x, y};
        if (Math.abs(this.x-coordP.x)< Math.abs(this.y-coordP.y)){

            if (coordP.y > this.y) coordStep[1] +=1;
            else coordStep[1] -=1;
        }
        else {
            if (coordP.x > this.x) coordStep[0] += 1;
            else coordStep[0] -= 1;
        }

        return coordStep;
    }
}

