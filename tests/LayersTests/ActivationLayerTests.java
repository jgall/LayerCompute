package LayersTests;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import Functions.ActivationFunction;
import Layers.ActivationLayer;

/**
 * Tests the ActivationLayer class.
 */
public class ActivationLayerTests {

  @Test
  public void testForwardProp() {
    ActivationLayer testLayer = new ActivationLayer(3, new MockActivationFunction());
    double[] result = testLayer.forwardProp(new double[]{1, 3, 5});
    double[] expected = new double[]{2, 4, 6};
    Assert.assertEquals(Arrays.toString(result), Arrays.toString(expected));

  }

  @Test
  public void testBackProp() {
    ActivationLayer testLayer = new ActivationLayer(3, new MockActivationFunction());
    double[] result = testLayer.backProp(new double[]{1, 3, 5});
    double[] expected = new double[]{0, 2, 4};
    Assert.assertEquals(Arrays.toString(result), Arrays.toString(expected));

  }

  private class MockActivationFunction implements ActivationFunction {

    @Override
    public double[] compute(double[] x) {
      double[] result = new double[x.length];
      for (int i = 0; i < x.length; i++) {
        result[i] = 1 + x[i];
      }
      return result;
    }

    @Override
    public double[] derivative(double[] x) {
      double[] result = new double[x.length];
      for (int i = 0; i < x.length; i++) {
        result[i] = x[i] - 1;
      }
      return result;
    }
  }

}
