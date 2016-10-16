package Functions;

/**
 * A Utility class for simple operations on arrays
 */
public class ArrayUtils {

  // This is not an instantiable class.
  private ArrayUtils() {
  }

  /**
   * Append a double to the start of an array of doubles.
   *
   * @param array The array to get appended to
   * @param x     The element to append to the array
   * @return A new array with the appended element and the input array
   */
  public static double[] appendDouble(double[] array, double x) {
    double[] result = new double[array.length + 1];
    result[0] = x;
    System.arraycopy(array, 0, result, 1, array.length);
    return result;
  }

  public static double[] removeFirst(double[] array) {
    double[] result = new double[array.length - 1];
    System.arraycopy(array, 1, result, 0, array.length);
    return result;
  }

  public static double[] multiplyEach(double[] a, double[] b) {
    double[] result = new double[a.length];
    for (int i = 0; i < a.length; i++) {
      result[i] = a[i] * b[i];
    }
    return result;
  }


}
