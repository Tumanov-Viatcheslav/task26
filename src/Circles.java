import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Circles {
    public static void main(String[] args) {
        boolean isIntersectedOutside, isIntersectedInside;
        int character;
        String buffer = "";
        String[] circlesValues;

        try(FileReader input = new FileReader("input.txt")) {
            while((character = input.read()) != -1) {
                buffer += (char)character;
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        circlesValues = buffer.split("\r\n");
        Circle circle1 = new Circle(circlesValues[0]), circle2 = new Circle(circlesValues[1]);
        isIntersectedOutside = ((circle2.x - circle1.x) * (circle2.x - circle1.x) + (circle2.y - circle1.y) * (circle2.y - circle1.y)) <=
                            (circle1.radius + circle2.radius) * (circle1.radius + circle2.radius);
        isIntersectedInside = ((circle2.x - circle1.x) * (circle2.x - circle1.x) + (circle2.y - circle1.y) * (circle2.y - circle1.y)) >=
                            (circle2.radius - circle1.radius) * (circle2.radius - circle1.radius);

        try(FileWriter output = new FileWriter("output.txt")) {
            if (isIntersectedOutside && isIntersectedInside) {
                output.write("YES");
            }
            else {
                output.write("NO");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
