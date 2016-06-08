package com.kuldeep;

import java.util.LinkedList;

/**
 * Robot movement
 * <p>
 * Created by kuldeep on 07/06/16.
 */
public class RobotMovement {

    /**
     * Check if robot can reach from start point to end
     *
     * @param startX X-coordinate of start point
     * @param startY Y-coordinate of start point
     * @param endX   X-coordinate of end point
     * @param endY   Y-coordinate of end point
     * @return true if robot can reach from start to end
     */
    public boolean canReach(int startX, int startY, int endX, int endY) {

        LinkedList<Point> reachablePoints = new LinkedList<Point>();
        reachablePoints.add(new Point(startX, startY));

        while (!reachablePoints.isEmpty()) {

            Point frontPoint = reachablePoints.removeFirst();
            startX = frontPoint.getX();
            startY = frontPoint.getY();

            if ((startX + startY == endX && startY == endY) || (startX == endX && startX + startY == endY)) {
                return true;
            } else {
                if (startX + startY <= endX) {
                    reachablePoints.add(new Point(startX + startY, startY));
                }
                if (startX + startY <= endY) {
                    reachablePoints.add(new Point(startX, startX + startY));
                }
            }
        }

        return false;
    }

    /**
     * Coordinate in cartesian plane
     */
    public class Point {

        public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

}
