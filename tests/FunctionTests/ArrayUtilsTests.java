package FunctionTests;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import Functions.ArrayUtils;

/**
 * Tests for ArrayUtils class in the Functions package
 */
public class ArrayUtilsTests {

  @Test
  public void testAppendDouble() {
    double[] testArray = new double[]{0, 5, 6, 7};
    double[] result = ArrayUtils.appendDouble(testArray, 2);
    double[] expectedResult = new double[]{2, 0, 5, 6, 7};
    Assert.assertEquals(Arrays.toString(result), Arrays.toString(expectedResult));
  }

}
