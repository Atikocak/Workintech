package org.example;

public class Point {
    private int x;
    private int y;

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

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(int x1, int y1, int x2, int y2) {
        return (double) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public double distance(Point point) {
        return distance(this.x, this.y, point.x, point.y);
    }

    public double distance() {
        return distance(0, 0, this.x, this.y);
    }

    public double distance(int a, int b) {
        return distance(a, b, this.x, this.y);
    }


}
