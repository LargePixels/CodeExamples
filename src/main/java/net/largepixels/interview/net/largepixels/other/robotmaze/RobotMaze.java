package net.largepixels.interview.net.largepixels.other.robotmaze;

public class RobotMaze implements RobotMazeInterface {

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

    public boolean moveForward() {
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
