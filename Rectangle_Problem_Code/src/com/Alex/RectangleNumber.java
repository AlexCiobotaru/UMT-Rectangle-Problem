package com.Alex;

import java.util.Arrays;

public class RectangleNumber {

    /**
     * Determine how many rectangles are defined for an
     * arbitrary set of coordinates in the XoY plane
     * @param coordinate
     * @return
     */
    public int rectangleCount(int [][]coordinate) {

        final int MINIMUM_POINTS = 4;

        if(coordinate.length < 1 || coordinate.length > 100)
            return -1;

        if(coordinate.length < MINIMUM_POINTS)
            return 0;

         Point[] pointList = new Point[coordinate.length];

        for(int i = 0; i < coordinate.length; i++) {
            if(coordinate[i].length > 2)
                return -1;

            pointList[i] = new Point(coordinate[i][0], coordinate[i][1]);
        }

        Arrays.sort(pointList);

        int counter = 0;

        for(int i = 0; i < pointList.length; i++) {
            Point leftDown = pointList[i];

            for(int j = i+1; j < pointList.length; j++) {
                Point leftUp = pointList[j];

                if(leftDown.getX() == leftUp.getX()) {

                    for(int k = j+1; k < pointList.length; k++) {
                        Point rightDown = pointList[k];

                        if(leftDown.getY() == rightDown.getY()){
                            Point rightUp = new Point(rightDown.getX(), leftUp.getY());

                            if(rightUp.exists(pointList))
                                counter++;
                        }
                    }
                }
            }
        }
        return counter;
    }

}