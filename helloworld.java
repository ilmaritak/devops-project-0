import utils.Prints;
import java.util.Random;

public class helloworld {
    // main class
    public static void main(String[] args) {
        // main method
        Printtaaja();
    }

    public static void Printtaaja() {
        String name = "Esko";
        Prints.println("Hello, " + name); // what is printed
        Prints.println("Hello, " + Randomizer());
    }

    /**
     * Method that returns one of 10 names randomly.
     *
     * @return returns a random name String.
     */
    public static String Randomizer() {
        Random rand = new Random();
        int n = rand.nextInt(10);

        String[] names = { "Esko", "Pena", "Janne", "Roosa", "Pete", "Kalle", "Johanna", "Julius", "Juuso", "Katja" };
        return names[n];
    }
}
