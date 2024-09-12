package com.csc205.project1;

public class Point {

    private double x;
    private double y;

    // Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Set both coordinates
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Shift x coordinate
    public void shiftX(double n) {
        this.x += n;
    }

    // Shift y coordinate
    public void shiftY(double n) {
        this.y += n;
    }

    // Calculate distance to another point
    public double distance(Point p2) {
        return Math.sqrt(Math.pow(p2.getX() - this.x, 2) + Math.pow(p2.getY() - this.y, 2));
    }

    // Rotate the point around the origin
    public void rotate(double angle) {
        double newX = x * Math.cos(angle) - y * Math.sin(angle);
        double newY = x * Math.sin(angle) + y * Math.cos(angle);
        this.x = newX;
        this.y = newY;
    }

    // toString method
    @Override
    public String toString() {
        return "Point(x=" + x + ", y=" + y + ")";
    }

}
