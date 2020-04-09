package com.Alex;

import java.util.Scanner;

public class Main {

    /**
     * Read the points from the keyboard.
     */

    private static Scanner in = new Scanner(System.in);

    public static void readPoints()
    {
        int rowNumber, columnsNumber = 2;
        int i, j;

        in = new Scanner(System.in);
        System.out.println("Enter the number of points in the plane");
        rowNumber = in.nextInt();

        int[][] pointGrid = new int[rowNumber][columnsNumber];

        System.out.println("Enter the coordinates for each point");
        for (i = 0; i < rowNumber; i++)
            for (j = 0; j < columnsNumber; j++)
                pointGrid[i][j] = in.nextInt();

        RectangleNumber noOfRectangles = new RectangleNumber();
        System.out.println("The number of rectangles are: ");
        System.out.println(noOfRectangles.rectangleCount(pointGrid));
    }


    public static void main(String[] args) {

        readPoints();
    }

}
