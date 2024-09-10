public class Circle {
    int x, y, radius;
    public Circle(String circleValues) {
        String[] values = circleValues.split(" ");
        this.x = Integer.parseInt(values[0]);
        this.y = Integer.parseInt(values[1]);
        this.radius = Integer.parseInt(values[2]);
    }
}
