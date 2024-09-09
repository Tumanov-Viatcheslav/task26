import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Circles {
    public static void main(String[] args) {
        int character;
        String buffer = "";
        String[] banditScores;
        try(FileReader input = new FileReader("input.txt")) {
            while((character = input.read()) != -1) {
                buffer += (char)character;
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        banditScores = buffer.split(" ");
        try(FileWriter output = new FileWriter("output.txt")) {
            //Т.к. в конце бандиты выстрелили в одну банку, то количество банок, в которые они не выстрелили, равно количеству банок противника минус одна общая
            output.write((Integer.parseInt(banditScores[1]) - 1) + " " + (Integer.parseInt(banditScores[0]) - 1));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}