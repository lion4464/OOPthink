package Circle;

public class Circle {
    final double PI=Math.PI;
    private double x=0;
    private double y=0;
    private double radius=1;

    public static void main(String[] args) {
        Circle circle1=new Circle(2, 2, 5.5);
        System.out.println("c1.contains(x="+circle1.x+",y="+circle1.y+") = " + circle1.contains(7,5));
        System.out.println("c1.contains(x=4,y=5,r=10.5) = " + circle1.contains(new Circle(4, 5, 10.5)));
        System.out.println("c1.contains(3, 5, 2.3) = " + circle1.overlaps(new Circle(3, 5, 2.3)));
    }

    public Circle() {
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius=radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return PI*Math.pow(radius,2);
    }
    public double getPerimeter(){
        return 2*PI*radius;
    }
    public boolean contains(double x, double y){
        return (radius>(Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2))))?true:false;
    }
    public boolean contains(Circle circle2){
        return (circle2.getRadius()+Math.sqrt(Math.pow(this.x-circle2.getX(),2)+Math.pow(this.y-circle2.getY(),2))<this.radius)?true:false;
    }
    public boolean overlaps(Circle circle2){
        return (this.radius<circle2.getRadius()+Math.sqrt(Math.pow(this.x-circle2.getX(),2)+Math.pow(this.y-circle2.getY(),2)))?true:false;
    }
}
