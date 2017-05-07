package fr.univ_amu.iut.exercice5;

import java.util.List;

public class RobotSimulator {
    Robot robot;
    String instructions;

    public RobotSimulator(Robot robot, String instructions) {
        this.robot = robot;
        this.instructions = instructions;
    }

    public void simulate() {
        throw new RuntimeException("Not yet implemented !");
    }

    public List<Movement> getMovements() {
        throw new RuntimeException("Not yet implemented !");
    }
}
