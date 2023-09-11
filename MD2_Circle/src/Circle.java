public class Circle {
    private int id;
    private double radius = 1.0;
    static final double pi = 3.14;
    private int count;
    static double maxRadius;

    static double sumArea;

    public Circle(){
    }

    public Circle(double radius) {
        this.id = count++;
        this.radius = radius;

        if (maxRadius < radius) {
            maxRadius = radius;
        }

        sumArea += area();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return (radius * radius) * pi;
    }

    public double perimeter() {
        return (radius * 2) * pi;
    }

    @Override
    public String toString() {
        return "Circle{"
                + "id: " + id
                + ", radius: " + radius
                + ", area: " + area()
                + ", perimeter: " + perimeter()
                + '}';
    }
}
