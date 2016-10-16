package Layers;

import Functions.ActivationFunction;

/**
 * Represents an Activation Layer in a feed-forward graph or neural network.
 */
public class ActivationLayer extends Layer {

  private final ActivationFunction f;
  private double[] lastComputed;

  public ActivationLayer(int size, ActivationFunction f) {
    super(size, size);
    this.f = f;
  }

  @Override
  protected double[] internalBackProp(double[] inputs) {
    double[] result = f.derivative(inputs);
    return result;
  }

  @Override
  protected double[] internalForwardProp(double[] inputs) {
    double[] result = f.compute(inputs);
    lastComputed = result;
    return result;
  }
}
