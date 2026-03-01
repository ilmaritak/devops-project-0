/**
 * Utility class that provides comparison methods
 * for primitive numeric types.
 * <p>
 * Includes overloaded methods to determine the larger
 * or smaller value between two numbers.
 */
public class MathUtil {
    /**
     * Returns the greater of two {@code int} values.
     *
     * @param a the first value
     * @param b the second value
     * @return {@code a} if {@code a >= b}, otherwise {@code b}
     */
    public int bigger(int a, int b) {
        return a >= b ? a : b;
    }

     /**
     * Returns the greater of two {@code float} values.
     *
     * @param a the first value
     * @param b the second value
     * @return {@code a} if {@code a >= b}, otherwise {@code b}
     */
    public float bigger(float a, float b) {
        return a >= b ? a : b;
    }

    /**
     * Returns the greater of two {@code double} values.
     *
     * @param a the first value
     * @param b the second value
     * @return {@code a} if {@code a >= b}, otherwise {@code b}
     */
    public double bigger(double a, double b) {
        return a >= b ? a : b;
    }

    /**
     * Returns the smaller of two {@code int} values.
     *
     * @param a the first value
     * @param b the second value
     * @return {@code a} if {@code a <= b}, otherwise {@code b}
     */
    public int smaller(int a, int b) {
        return a <= b ? a : b;
    }

    /**
     * Returns the smaller of two {@code float} values.
     *
     * @param a the first value
     * @param b the second value
     * @return {@code a} if {@code a <= b}, otherwise {@code b}
     */
    public float smaller(float a, float b) {
        return a <= b ? a : b;
    }

    /**
     * Returns the smaller of two {@code double} values.
     *
     * @param a the first value
     * @param b the second value
     * @return {@code a} if {@code a <= b}, otherwise {@code b}
     */
    public double smaller(double a, double b) {
        return a <= b ? a : b;
    }
}
