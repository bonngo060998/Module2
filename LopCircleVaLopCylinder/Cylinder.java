package LopCircleVaLopCylinder;
public class Cylinder extends Circle {
    private double height;
    public Cylinder(){
    };
    public Cylinder(double height){
        this.height = height;
    }
    public Cylinder(double height,double radius, String color){
        super(radius,color);
        this.height = height;
    }
    @Override
    public double getRadius() {
        return super.getRadius();
    }
    @Override
    public String getColor() {
        return super.getColor();
    }

    public double getHeight() {
        return height;
    }
    @Override
    public void setColor(String color) {
        super.setColor(color);
    }
    @Override
    public void setRadius(double radius) {
        super.setRadius(radius);
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2*Math.PI*getRadius()*(getRadius()+getHeight());
    }

    public double getVolume() {
        return Math.pow(super.getRadius(),2)*Math.PI*getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder: "
                +"\nColor: "
                +super.getColor()
                +"\nRadius: "
                +super.getRadius()
                +"\nVolume: "
                +getVolume();
    }
    public  static void main(String[] args){
        Cylinder cylinder = new Cylinder(6.0,7.0,"Blue");
        System.out.print(cylinder);
    }
}



