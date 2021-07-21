//Subject: ITVM5013 SOFTWARE DESIGN AND DEVELOPMENT
//Student Name: ABDUL HAKIM BIN ABDUL RASHID
//Matric Number: MC210413691
//Course: MASTER OF INFORMATION TECHNOLOGY
//Final Project: Animal Kingdom

import java.awt.Color;
import java.util.Random;


public class NinjaCat extends Critter{

    int count;
    Action[] RL = {Action.LEFT, Action.RIGHT};
    Random rand;



    public NinjaCat() {
        super();
        count = 0;
        rand = new Random();
    }


    public Color getColor() {
        return Color.YELLOW;
    }


    public String toString() {
        return "Meow";
    }


      public Action getMove(CritterInfo info) {
        if(info.getFront() == Neighbor.OTHER) { return Action.INFECT; }
        else if(info.getFront() == Neighbor.WALL || info.getFront() == Neighbor.SAME) {return RL[rand.nextInt(RL.length)]; }
        return Action.HOP;
    }
}

