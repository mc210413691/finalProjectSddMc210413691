//Subject: ITVM5013 SOFTWARE DESIGN AND DEVELOPMENT
//Student Name: ABDUL HAKIM BIN ABDUL RASHID
//Matric Number: MC210413691
//Course: MASTER OF INFORMATION TECHNOLOGY
//Final Project: Animal Kingdom

import java.awt.Color;

public class Giant extends Critter{
    int count;

    public Giant() {
        super();
        count = 0;
    }

    public Color getColor() {
        return Color.GRAY;
    }

    public String toString() {
        int Remaining = count%24;

        if(Remaining<6) { return "fee"; }
        else if(Remaining >= 6 && Remaining < 12) { return "fie"; }
        else if(Remaining >= 12 && Remaining < 18) { return "fum"; }
        else if(Remaining >= 18 && Remaining < 24) { return "foe"; }
        else return "fee";
    }

    public Action getMove(CritterInfo info) {
        count++;
        if (info.getFront() == Neighbor.OTHER) { return Action.INFECT; }
        else if(info.getFront() == Neighbor.EMPTY) { return Action.HOP;}
        return Action.RIGHT;
    }
}

