package LopCircleVaLopCylinder;

public class Circle {
    private double radius;
    private String color;
    public  Circle(){};
    public Circle( double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }
    public String toString(){
        return "Circle: "
                +"\nColor: "
                + getColor()
                + "\nRadius: "
                + getRadius()
                + "\nArea: "
                + getArea();
    }
    public  static void main(String[] args){
       Circle circle = new Circle(5.0,"Red");
       System.out.print(circle);
    }
}
