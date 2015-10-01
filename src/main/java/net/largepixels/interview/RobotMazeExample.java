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

        private int startX = 3;
        private int startY = 1;
        private int endX = 0;
        private int endY = 3;

        private int currentX = startX;
        private int currentY = startY;

        public boolean isAtEnd() {
            if ( currentX == endX && currentY == endY )
                return true;
            else
                return false;
        }

        public boolean moveFoward() {
            // do something
            return true;
        }

        public void rotateRight() {

        }
    }

    public static void main(String[] args) {
        RobotMazeExample robotMazeExample = new RobotMazeExample();
        robotMazeExample.runMe();
    }

    private void runMe() {
        RobotMaze robotMaze = new RobotMaze();
    }
}
