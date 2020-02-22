package sample;

public class Wall {

    private double height;
    private double width;

    public Wall() {
    }

    public Wall(double width, double height) {
        if(width < 0) {
            this.width = 0.0;
        } else {
            this.width = width;
        }

        if(height < 0) {
            this.height = 0.0;
        } else {
            this.height = height;
        }
    }

    public void setHeight(double height) {
        if(height < 0) {
            this.height = 0.0;
        } else {
            this.height = height;
        }
    }

    public void setWidth(double width) {
        if(width < 0) {
            this.width = 0.0;
        } else {
            this.width = width;
        }
    }

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getArea() {
        double area;
        area = this.height * this.width;
        return area;
    }
}
