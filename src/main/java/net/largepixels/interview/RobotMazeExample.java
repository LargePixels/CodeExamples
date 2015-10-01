package net.largepixels.interview;

/**
 * Created by minchuk on 10/1/15.
 */
public class RobotMazeExample {

    private class RobotMaze {

        private String mazeArray[][] = {
                {" ", " ", "x", ""},
                {" ", " ", "x", ""},
                {"x", "x", "x", ""},
                {"x", " ", " ", ""}
        };

        // 0 = N
        // 1 = E
        // 2 = S
        // 3 = 3
        private int currentDirection = 0;

        private int startX = 0;
        private int startY = 3;
        private int endX = 2;
        private int endY = 0;

        private int currentX = startX;
        private int currentY = startY;

        public boolean isAtEnd() {
            if ( currentX == endX && currentY == endY )
                return true;
            else
                return false;
        }

        public boolean moveFoward() {
            String nextPosition = "";
            int newPositionY = currentY;
            int newPositionX = currentX;

            if ( currentDirection == 0 ) {
                newPositionY--;
                nextPosition = mazeArray[newPositionY][newPositionX];
            }
            else if ( currentDirection == 1) {
                newPositionX++;
                nextPosition = mazeArray[newPositionY][newPositionX];
            }
            else if ( currentDirection == 2) {
                newPositionY++;
                nextPosition = mazeArray[newPositionY][newPositionX];
            }
            else if ( currentDirection == 3) {
                newPositionX--;
                nextPosition = mazeArray[newPositionY][newPositionX];
            }

            if (nextPosition.equals("x")) {
                currentX = newPositionX;
                currentY = newPositionY;
                return true;
            }

            return false;
        }

        public void rotateRight() {
            currentDirection++;
            if ( currentDirection > 3 )
                currentDirection = 0;
        }
    }

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

        if (!robotMaze.moveFoward()) {
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
            if (!robotMaze.moveFoward()) {
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
        robotMaze.moveFoward();
        robotMaze.rotateRight();
        robotMaze.moveFoward();
        robotMaze.moveFoward();
        robotMaze.rotateRight();
        robotMaze.rotateRight();
        robotMaze.rotateRight();
        robotMaze.moveFoward();
        robotMaze.moveFoward();
        robotMaze.isAtEnd();

        System.out.println("We made it to the end procedurally!!!");
    }

}
