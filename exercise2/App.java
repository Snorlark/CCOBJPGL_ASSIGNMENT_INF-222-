import Explorers.*;
import Planets.*;

public class App {

    public static void main(String[] args) {
        
        //planet objects
        Planet mercury = new Mercury();
        Planet venus = new Venus();
        Planet earth = new Earth();
        Planet mars = new Mars();
        Planet jupiter = new Jupiter();
        Planet saturn = new Saturn();
        Planet uranus = new Uranus();
        Planet neptune = new Neptune();
        Planet pluto = new Pluto();
        
        //explorer objects
        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();
        Explorer android = new AndroidExplorer();
       


        //astronaut object accept method
        mercury.accept(astronaut);
        venus.accept(astronaut);
        earth.accept(astronaut);
        mars.accept(astronaut);
        jupiter.accept(astronaut);
        saturn.accept(astronaut);
        uranus.accept(astronaut);
        neptune.accept(astronaut);
        pluto.accept(astronaut);

        //rover object accept method
        mercury.accept(rover);
        venus.accept(rover);
        earth.accept(rover);
        mars.accept(rover);
        jupiter.accept(rover);
        saturn.accept(rover);
        uranus.accept(rover);
        neptune.accept(rover);
        pluto.accept(rover);
        
        //android object accept method
        mercury.accept(android);
        venus.accept(android);
        earth.accept(android);
        mars.accept(android);
        jupiter.accept(android);
        saturn.accept(android);
        uranus.accept(android);
        neptune.accept(android);
        pluto.accept(android);

    }
}