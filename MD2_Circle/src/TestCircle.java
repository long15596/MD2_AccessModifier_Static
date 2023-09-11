public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(30);
        Circle circle2 = new Circle(25.8);
        Circle circle3 = new Circle(54.3);

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);

        System.out.println("Max radius: " + Circle.maxRadius + ", Sum Area: " + Circle.sumArea);
    }
}