public class TestCircle {
    public static void main(String[] args) {
        Circle redCircle = new Circle();
        redCircle.setColor("red");
        Circle blueCircle = new Circle(5.0);
        blueCircle.setColor("blue");
        System.out.println(redCircle.getColor() + " has a radius of " + redCircle.getRadius() + " and an area of " + redCircle.getArea());
        System.out.println(blueCircle.getColor() + " has a radius of " + blueCircle.getRadius() + " and an area of " + blueCircle.getArea());

    }
}
