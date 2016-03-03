package net.largepixels.designpatterns.builder;

/**
 * Created by johnminchuk on 3/1/16.
 */
// Defines the methods needed for creating parts
// for the robot

public interface RobotBuilder {

    public void buildRobotHead();

    public void buildRobotTorso();

    public void buildRobotArms();

    public void buildRobotLegs();

    public Robot getRobot();

}