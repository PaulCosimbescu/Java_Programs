package sample;

public class Point {

    private int x;
    private int y;

    public Point() {


    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        double distance;
        double x = this.x;
        double y = this.y;
        distance = Math.sqrt((0 - x) * (0 - x) + (0 - y) * (0 - y));
        return distance;
    }

    public double distance(int x2, int y2) {
        double distance;
        double x1 = this.x;
        double y1 = this.y;
        distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return distance;
    }

    public double distance(Point point) {
        int x1 = point.getX();
        int y1 = point.getY();
        return distance(x1, y1);
    }
}
