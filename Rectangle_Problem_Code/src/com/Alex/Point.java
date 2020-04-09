package com.Alex;


public class Point implements Comparable<Point>{

    /**
     * Instance variables. Represents the x and y coordinates.
     */
    private int x;
    private int y;

    /**
     * Constructor of the Class
     * @param x
     * @param y
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Getters for the coordinates x and y.
     * @return
     */
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /**
     * Compares the coordinates of the point, first based on "x",
     * then based on "y".
     * @param p
     * @return
     */
    @Override
    public int compareTo(Point p) {
        if(this.getX() == p.getX())
        {
            return Integer.compare(this.getY(), p.getY());
        }

        return Integer.compare(this.getX(),p.getX());
    }

    /**
     * Checks whether a given point is already in the XoY plane or not.
     * @param grid
     * @return
     */
    public boolean exists(Point[] grid) {
        return Validation.contains(grid, this);
    }


    @Override
    public String toString() {
        return "(" + x + "," + y + ')';
    }





}