//Subject: ITVM5013 SOFTWARE DESIGN AND DEVELOPMENT
//Student Name: ABDUL HAKIM BIN ABDUL RASHID
//Matric Number: MC210413691
//Course: MASTER OF INFORMATION TECHNOLOGY
//Final Project: Animal Kingdom

import java.awt.*;

public class Bear extends Critter{
    boolean polar;
    int count;

    public Bear(boolean polar) {
        super();
        this.polar = polar;
        count = 0;
    }


    public Color getColor() {
        if (polar==false) {return Color.BLACK;}
        return Color.WHITE;
    }


    public String toString() {
        if (count%2==0) {return "/";}
        return "\\";
    }

    public Action getMove(CritterInfo info) {
        count++;
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        }
        else if(info.getFront() == Neighbor.EMPTY) { return Action.HOP;}

        return Action.LEFT;
    }
}

