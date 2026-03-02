package utils;

/**
 * Utility class providing simplified wrapper methods for
 * standard output operations via {@link System#out}.
 *
 * <p>This class exposes static helper methods that delegate to
 * {@link System#out#print(String)} and
 * {@link System#out#println()} methods. It is designed to be
 * used with static imports for cleaner and more readable code.</p>
 *
 * <p>Example usage with static import:</p>
 * <pre>
 * import static utils.Prints.*;
 *
 * print("Hello ");
 * println("World");
 * </pre>
 *
 * <p>This class cannot be instantiated.</p>
 */
public final class Prints {
    private Prints() {
    }

    /**
     * Private constructor to prevent instantiation.
     *
     * <p>Since this class only contains static utility methods,
     * creating instances is not allowed.</p>
     */
    public static void println() {
        System.out.println();
    }

    /**
     * Prints the specified string followed by a newline
     * to the standard output.
     *
     * @param s the string to be printed
     */
    public static void println(String s) {
        System.out.println(s);
    }

    /**
     * Prints the specified string to the standard output
     * without appending a newline.
     *
     * @param s the string to be printed
     */
    public static void print(String s) {
        System.out.print(s);
    }
}
