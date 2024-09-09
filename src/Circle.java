public class Circle {
    int x, y, radius;
    public Circle(String circleValues) {
        String[] values = circleValues.split(" ");
        x = Integer.parseInt(values[0]);
        y = Integer.parseInt(values[1]);
        radius = Integer.parseInt(values[2]);
    }
}
