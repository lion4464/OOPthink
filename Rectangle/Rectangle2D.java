package Rectangle;

public class Rectangle2D {
    private double x=0;
    private double y=0;
    private double width=1;
    private double height=1;

    public static void main(String[] args) {
        Rectangle2D r1=new Rectangle2D(6,3.5,8,4.5);
        Rectangle2D r2=new Rectangle2D(9,3.5,4.5,2);
        System.out.println("r1.contains(r2) = " + r1.contains(r2));
        System.out.println("r1.contains(r2) = " + r1.overlaps(r2));
    }
    public Rectangle2D() {
    }

    public Rectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }
    public boolean  contains(double x, double y){
        double maxY=this.y+(height/2);
        double minY=this.y-(height/2);
        double maxX=this.x+(width/2);
        double minX=this.x-(width/2);
        return  (minX<x&&x<maxX)&&(minY<y&&y<maxY)?true:false;
    }
    public boolean contains(Rectangle2D r){
     return contains(r.getX(),r.getY()) & contains(r.getX()+r.getWidth()/2,r.getY()+r.getHeight()/2) & contains(r.getX()-r.getWidth()/2,r.getY()-r.getHeight()/2)?true:false;
    }
    public boolean overlaps(Rectangle2D r){
     return contains(r.getX(),r.getY()) || contains(r.getX()+r.getWidth()/2,r.getY()+r.getHeight()/2) || contains(r.getX()-r.getWidth()/2,r.getY()-r.getHeight()/2)?true:false;
    }



    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
