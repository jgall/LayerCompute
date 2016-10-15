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
  public void testVectorTransform() {
    double[] testVector = new double[]{1, 2};
    double[][] testMatrix = new double[][]{{1, 0}, {0, 1}};
    double[] result = MatrixMultiplication.transform(testVector, testMatrix);
    Assert.assertEquals(Arrays.toString(result), Arrays.toString(testVector));
  }
}
