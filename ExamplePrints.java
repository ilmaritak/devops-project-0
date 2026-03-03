import static utils.Prints.print;
import static utils.Prints.println;

/**
 * Demonstrates the use of static imports in Java.
 *
 * <p>This class imports the static methods {@code print} and {@code println}
 * from the {@code utils.Prints} class, allowing them to be used without
 * qualifying them with the class name.</p>
 *
 * <p>The example illustrates the difference between:
 * <ul>
 *     <li>{@code print(String)} – prints text without appending a newline</li>
 *     <li>{@code println(String)} – prints text and appends a newline</li>
 *     <li>{@code println()} – prints only a newline</li>
 * </ul>
 * </p>
 */
public class ExamplePrints {
    /**
     * Entry point of the program.
     *
     * <p>Execution flow:
     * <ol>
     *     <li>Prints text without a newline.</li>
     *     <li>Prints additional text on the same line, then adds a newline.</li>
     *     <li>Prints an empty line.</li>
     *     <li>Prints a final message on a new line.</li>
     * </ol>
     * </p>
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        print("I want to "); // This print doesn't make newline at the end
        println("eat ice cream"); // So this continues in the same line
        println(); // This prints nothing but makes a newline at the end
        println("What do you want to eat?"); // So this will be seperated from the upper ones
    }
}