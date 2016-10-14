package Layers;

/**
 * Represents an output layer to a network. This is essentially an "identity" layer as it does
 * no actual computations and it's input will always be the same as its output.
 */
public class OutputLayer extends Layer {

  public OutputLayer(int size) {
    super(size, size);
  }

  @Override
  protected double[] internalBackProp(double[] inputs) {
    return inputs;
  }

  @Override
  protected double[] internalForwardProp(double[] inputs) {
    return inputs;
  }
}
