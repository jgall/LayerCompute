package Layers;

import Functions.ActivationFunction;

/**
 * Represents an Activation Layer in a feed-forward graph or neural network.
 */
public class ActivationLayer extends Layer {

  private final ActivationFunction f;

  public ActivationLayer(int size, ActivationFunction f) {
    super(size, size);
    this.f = f;
  }

  @Override
  protected double[] internalBackProp(double[] inputs) {
    assert (inputs.length == outputSize);
    double[] result = f.derivative(inputs);
    assert (result.length == inputSize);
    return f.derivative(inputs);
  }

  @Override
  protected double[] internalForwardProp(double[] inputs) {
    assert (inputs.length == inputSize);
    double[] result = f.compute(inputs);
    assert (result.length == outputSize);
    return f.compute(inputs);
  }
}
