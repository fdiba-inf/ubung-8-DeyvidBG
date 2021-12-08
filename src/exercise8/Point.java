package exercise8;
import java.util.Scanner;

public class Point {
    // Define attributes
    double x, y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point otherPoint) {
        this.x = otherPoint.x;
        this.y = otherPoint.y;
    }

    public void initialize() {
        Scanner reader = new Scanner(System.in);
        System.out.println("X-cordinates: ");
        this.x = reader.nextDouble();
        System.out.println("Y-cordinates: ");
        this.y = reader.nextDouble();
    }

    public void translate(double xDelta, double yDelta) {
        this.x += xDelta;
        this.y += yDelta;
    }

    public Point createNewTranslatedPoint(double xDelta, double yDelta) {
        return new Point(this.x + xDelta, this.y + yDelta);
    }

    public boolean equals(Point otherPoint) {
        if(this.x == otherPoint.x && this.y == otherPoint.y) {
          return true;
        } else {
          return false;
        }
    }

    public String toString() {
        String res = "(";
        res += String.valueOf(this.x);
        res += ", ";
        res += String.valueOf(this.y);
        res += ")";
        return res;
    }
}
