package net.largepixels.designpatterns.builder;

/**
 * Created by johnminchuk on 3/1/16.
 */
// This is the interface that will be returned from the builder

public interface RobotPlan{

    public void setRobotHead(String head);

    public void setRobotTorso(String torso);

    public void setRobotArms(String arms);

    public void setRobotLegs(String legs);

}