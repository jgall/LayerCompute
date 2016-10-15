package LayersTests;

import org.junit.Test;

import Layers.FullyConnectedLayer;
import Layers.Layer;

/**
 * Tests for the FullyConnectedLayer class
 */
public class TestFullyConnectedLayer {

  @Test
  public void testFullyConnectedLayerCreation() {
    Layer testLayer = new FullyConnectedLayer(1, 2, new double[][]{{0, 0}, {0, 0}});
  }
}
