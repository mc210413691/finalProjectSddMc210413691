//Subject: ITVM5013 SOFTWARE DESIGN AND DEVELOPMENT
//Student Name: ABDUL HAKIM BIN ABDUL RASHID
//Matric Number: MC210413691
//Course: MASTER OF INFORMATION TECHNOLOGY
//Final Project: Animal Kingdom

// This defines a simple class of critters that infect whenever they can and
// otherwise just spin around, looking for critters to infect.  This simple
// strategy turns out to be surpisingly successful.

import java.awt.*;

public class FlyTrap extends Critter {
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else {
            return Action.LEFT;
        }
    }

    public Color getColor() {
        return Color.RED;
    }

    public String toString() {
        return "T";
    }
}