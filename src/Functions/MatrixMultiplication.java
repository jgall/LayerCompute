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

  /**
   * The matrix multiplication equivalent of matrix1 * transpose(matrix2).
   *
   * Motivation behind method : there is no good way to transpose 2d arrays in java, hence this
   * computes as if the matrix were transposed as not to duplicate memory calls.
   *
   * @param a The left matrix
   * @param b The transpose of the right matrix
   * @return 2d array matrix result of the multiplication
   */
  public static double[][] matMulTranspose(double[][] a, double[][] b) {
    assert (a[0].length == b[0].length);
    double[][] result = new double[a.length][b.length];

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b.length; j++) {
        for (int k = 0; k < b[0].length; k++) {
          result[i][j] += a[i][k] * b[j][k];
        }
      }
    }

    return result;
  }

  /**
   * Matrix multiplication of a * b.
   *
   * @param a The left matrix
   * @param b The right matrix
   * @return 2d array of doubles that is the result of a * b
   */
  public static double[][] matMulRegular(double[][] a, double[][] b) {
    assert (a[0].length == b.length);

    double[][] result = new double[a.length][b[0].length];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b[0].length; j++) {
        for (int k = 0; k < b.length; k++) {
          result[i][k] += a[i][k] * b[k][j];
        }
      }
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
