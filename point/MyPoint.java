package point;

import javax.swing.*;
import java.awt.*;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        this(0,0);
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(double x1,double y1){
        return Math.sqrt(Math.pow(this.x-x1,2)+Math.pow(this.y-y1,2));
    }

    public double distance(MyPoint a){
        return Math.sqrt(Math.pow(this.x-a.getX(),2)+Math.pow(this.y-a.getY(),2));
    }
    public static double distance1(MyPoint a,MyPoint b){
        return Math.sqrt(Math.pow(a.getX()-b.getX(),2)+Math.pow(b.getY()-b.getY(),2));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
