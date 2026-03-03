package utils;

/**
 * Contains useful math utility methods
 */
public class Math {

    /**
     * Sum two integers
     *
     * @param a int a
     * @param b int b
     * @return sum of a and b
     */
    public static int Sum(int a, int b) {
        return a + b;
    }

    /**
     * Times method for integers
     *
     * @param a int a
     * @param b int b
     * @return a times b
     */
    public static int times(int a, int b) {
        return a * b;
    }

    /**
     * Divide method for integers
     *
     * @param a int a
     * @param b int b
     * @return a divided by b
     */
    public static int divide(int a, int b) {
        return a / b;
    }

    /**
     * Count area of rectangle
     *
     * @param width  int width
     * @param height int height
     * @return area
     */
    public static int countAreaRectangle(int width, int height) {
        return width * height;
    }

    /**
     * Count area of square
     *
     * @param radius int radius
     * @return area
     */
    public static int counAreaSquare(int radius) {
        return (int) java.lang.Math.PI * radius * radius;
    }

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
