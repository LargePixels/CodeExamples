package net.largepixels.interview.net.largepixels.other.robotmaze;

/**
 * Created by minchuk on 10/1/15.
 */
public class RobotMazeExample {

    public static void main(String[] args) {
        RobotMazeExample robotMazeExample = new RobotMazeExample();
        robotMazeExample.runMe();
    }

    private void runMe() {
        solveProcedurally();
        solveIteratively();
        solveRecursively(new RobotMaze(), 0);
    }

    private void solveRecursively(RobotMaze robotMaze, int turnCounter) {
        if ( robotMaze.isAtEnd()) {
            System.out.println("We made it to the end recursively!!!");
            return;
        }

        if (!robotMaze.moveForward()) {
            robotMaze.rotateRight();
            turnCounter++;
            if (turnCounter == 2 ) {
                robotMaze.rotateRight();
                turnCounter++;
            }
        }
        else {
            turnCounter = 0;
        }

        solveRecursively(robotMaze, turnCounter);
    }

    private void solveIteratively() {
        RobotMaze robotMaze = new RobotMaze();

        int turnCounter = 0;

        while (!robotMaze.isAtEnd()) {
            if (!robotMaze.moveForward()) {
                robotMaze.rotateRight();
                turnCounter++;
                if (turnCounter == 2) {
                    robotMaze.rotateRight();
                    turnCounter++;
                }
            }
            else {
                turnCounter = 0;
            }
        }

        System.out.println("We made it to the end iteratively!!!");
    }

    private void solveProcedurally() {
        RobotMaze robotMaze = new RobotMaze();
        robotMaze.moveForward();
        robotMaze.rotateRight();
        robotMaze.moveForward();
        robotMaze.moveForward();
        robotMaze.rotateRight();
        robotMaze.rotateRight();
        robotMaze.rotateRight();
        robotMaze.moveForward();
        robotMaze.moveForward();
        robotMaze.isAtEnd();

        System.out.println("We made it to the end procedurally!!!");
    }

}
