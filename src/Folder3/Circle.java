package Folder3;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){

    }
    public Circle(double r){
        radius=r;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.pow(Math.PI,2)*getRadius();
    }

}
