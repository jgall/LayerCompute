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
   * @param matrix1 The left matrix
   * @param matrix2 The transpose of the right matrix
   * @return 2d array matrix result of the multiplication
   */
  public static double[][] matrixMul(double[][] matrix1, double[][] matrix2) {
    assert (matrix1[0].length == matrix2[0].length);

    double[][] result = new double[matrix1.length][matrix2.length];

    for (int i = 0; i < matrix1.length; i++) {
      result[i] = transform(matrix1[i], matrix2);
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
