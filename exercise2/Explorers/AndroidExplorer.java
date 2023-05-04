package Explorers;

import Planets.*;

public class AndroidExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("Initializing scanning system... planet Mercury is inhabitable");
    }

    @Override
    public void visit(Venus venus) {
        System.out.println("Initializing scanning system... planet Venus is inhabitable");
    }

    @Override
    public void visit(Earth earth) {
        System.out.println("Initializing scanning system... planet Earth is habitable");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Initializing scanning system... planet Mars is inhabitable");
    }

    @Override
    public void visit(Jupiter jupiter) {
        System.out.println("Initializing scanning system... planet Jupiter is inhabitable");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Initializing scanning system... planet Saturn is inhabitable");
    }

    @Override
    public void visit(Uranus uranus) {
        System.out.println("Initializing scanning system... planet Uranus is inhabitable");
    }

    @Override
    public void visit(Neptune neptune) {
        System.out.println("Initializing scanning system... planet Neptune is inhabitable");
    }

    @Override
    public void visit(Pluto pluto) {
        System.out.println("Initializing scanning system... planet Pluto is inhabitable");
    }
}