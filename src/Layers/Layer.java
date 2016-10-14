package Layers;

/**
 * Layers.Layer represents any sort of layer based operation in a feed-forward network of any kind.
 */
public abstract class Layer {
  public final int inputSize;
  public final int outputSize;

  public Layer(int inputSize, int outputSize) {
    this.inputSize = inputSize;
    this.outputSize = outputSize;
  }

  public abstract double[] backProp(double[] inputs);

  public abstract double[] forwardProp(double[] inputs);
}