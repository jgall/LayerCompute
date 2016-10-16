import java.util.ArrayList;

import Layers.InputLayer;
import Layers.Layer;

/**
 * Represents a sequence of Layers that will be computed,
 * and then back-propagated for improved results.
 */
public class Network {
  ArrayList<Layer> layers = new ArrayList<>();

  public Network(int inputSize) {
    layers.add(new InputLayer(inputSize));
  }

  public double[] run(double[] input) {
    double[] result = input;
    for (int i = 0; i < layers.size(); i++) {
      result = layers.get(i).forwardProp(result);
    }
    return result;
  }

  public void addLayer(Layer layer) {
    assert (layers.get(layers.size() - 1).outputSize == layer.inputSize);
    this.layers.add(layer);
  }




}
