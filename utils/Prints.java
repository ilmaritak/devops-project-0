package utils;

/**
 * Utility class that provides simplified wrapper methods
 * around {@link System#out} printing operations.
 */
public class Prints {
    /**
     * Prints a newline to the standard output.
     * Equivalent to {@link System#out#println()}.
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
