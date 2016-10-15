package Functions;

/**
 * A Utility class for doing matrix multiplications
 */
public class MatrixMultiplication {

  public static double[] transform(double[] vector, double[][] matrix) {
    assert (matrix[0].length == vector.length);

    double[] result = new double[matrix.length];
    for (int i = 0; i < result.length; i++) {
      result[i] = innerProduct(vector, matrix[i]);
    }
    return result;
  }

  public static double innerProduct(double[] vector1, double[] vector2) {
    assert (vector1.length == vector2.length);
    double result = 0;
    for (int i = 0; i < vector1.length; i++) {
      result += vector1[i] * vector2[i];
    }
    return result;
  }

}
