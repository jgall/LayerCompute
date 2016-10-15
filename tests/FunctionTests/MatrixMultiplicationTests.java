package FunctionTests;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import Functions.MatrixMultiplication;

/**
 * Tests for the MatrixMultiplication class
 */
public class MatrixMultiplicationTests {

  @Test
  public void test1x2Times2x2() {
    double[] testVector = new double[]{1, 2};
    double[][] testMatrix = new double[][]{{1, 0}, {0, 1}};
    double[] result = MatrixMultiplication.transform(testVector, testMatrix);
    Assert.assertEquals(Arrays.toString(result), Arrays.toString(testVector));
  }

  @Test
  public void test1x2Times2x3() {
    double[] testVector = new double[]{1, 2};
    double[][] testMatrix = new double[][]{{1, 0}, {0, 1}, {0, 0}};
    double[] result = MatrixMultiplication.transform(testVector, testMatrix);
    double[] expectedResult = new double[]{1, 2, 0};
    Assert.assertEquals(Arrays.toString(result), Arrays.toString(expectedResult));
  }

  @Test
  public void test1x2Times2x2MatrixMul() {
    double[][] testMatrix1 = new double[][]{{1, 2}};
    double[][] testMatrix2 = new double[][]{{1, 0}, {0, 1}};
    double[][] result = MatrixMultiplication.matMulTranspose(testMatrix1, testMatrix2);
    Assert.assertEquals(twoDArrayToString(testMatrix1), twoDArrayToString(result));
  }

  @Test
  public void test1x2Times2x1MatrixMul() {
    double[][] testMatrix1 = new double[][]{{1, 2}};
    double[][] testMatrix2 = new double[][]{{1, 1}};
    double[][] result = MatrixMultiplication.matMulTranspose(testMatrix1, testMatrix2);
    Assert.assertEquals(twoDArrayToString(new double[][]{{3}}), twoDArrayToString(result));
  }

  @Test
  public void test2x2Times2x1MatrixMul() {
    double[][] testMatrix1 = new double[][]{{1, 2}, {1, 0}};
    double[][] testMatrix2 = new double[][]{{1, 1}};
    double[][] result = MatrixMultiplication.matMulTranspose(testMatrix1, testMatrix2);
    Assert.assertEquals(twoDArrayToString(new double[][]{{3}, {1}}), twoDArrayToString(result));
  }

  @Test
  public void test2x2Times2x2MatrixMul() {
    double[][] testMatrix1 = new double[][]{{1, 2}, {1, 0}};
    double[][] testMatrix2 = new double[][]{{1, 1}, {1, 1}};
    double[][] result = MatrixMultiplication.matMulTranspose(testMatrix1, testMatrix2);
    Assert.assertEquals(twoDArrayToString(new double[][]{{3, 3}, {1, 1}}), twoDArrayToString(result));
  }

  @Test
  public void test3x2Times2x2MatrixMul() {
    double[][] testMatrix1 = new double[][]{{1, 2}, {1, 0}, {0, 1}};
    double[][] testMatrix2 = new double[][]{{1, 1}, {1, 0}};
    double[][] result = MatrixMultiplication.matMulTranspose(testMatrix1, testMatrix2);
    Assert.assertEquals(twoDArrayToString(new double[][]{{3, 1}, {1, 1}, {1, 0}}), twoDArrayToString(result));
  }

  @Test
  public void test3x2Times2x3MatrixMul() {
    double[][] testMatrix1 = new double[][]{{1, 2}, {1, 0}, {0, 1}};
    double[][] testMatrix2 = new double[][]{{1, 1}, {1, 0}, {0, 0}};
    double[][] result = MatrixMultiplication.matMulTranspose(testMatrix1, testMatrix2);
    Assert.assertEquals(twoDArrayToString(new double[][]{{3, 1, 0}, {1, 1, 0}, {1, 0, 0}}), twoDArrayToString(result));
  }


  private String twoDArrayToString(double[][] arr) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
      builder.append(" ").append(Arrays.toString(arr[i]));
    }

    return builder.toString();
  }
}
