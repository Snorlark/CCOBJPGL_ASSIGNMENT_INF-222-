package Explorers;

import Planets.Planet;

import Planets.Mercury;
import Planets.Venus;
import Planets.Earth;
import Planets.Mars;
import Planets.Jupiter;
import Planets.Saturn;
import Planets.Uranus;
import Planets.Neptune;
import Planets.Pluto;


public interface Explorer {

    void visit(Mercury mercury);

    void visit(Venus venus);

    void visit(Earth earth);

    void visit(Mars mars);

    void visit(Jupiter jupiter);

    void visit(Saturn saturn);

    void visit(Uranus uranus);

    void visit(Neptune neptune);

    void visit(Pluto pluto);

    default void visit(Planet planet) {
        System.out.println("Landed on an unknown planet...");
    }
}