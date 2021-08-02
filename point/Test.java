package point;

public class Test {

    public static void main(String[] args) {
        MyPoint a=new MyPoint();
        MyPoint b=new MyPoint (10, 30.5);
        System.out.println("a.distance(4,3) = " + a.distance(4,3));
        System.out.println("MyPoint.distance(4,3) = " + MyPoint.distance1(a,b));
    }
}
