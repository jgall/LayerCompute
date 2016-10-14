package Layers;

/**
 * Represents any sort of layer based operation in a feed-forward network of any kind.
 */
public abstract class Layer {
  public final int inputSize;
  public final int outputSize;

  /**
   * Main Constructor.
   *
   * @param inputSize  The input size of this layer
   * @param outputSize The output size of this layer
   */
  public Layer(int inputSize, int outputSize) {
    this.inputSize = inputSize;
    this.outputSize = outputSize;
  }

  /**
   * Computes whatever it is this Layer does.
   *
   * @param inputs The input of size this.inputSize
   * @return The output of size this.outputSize
   */
  public final double[] forwardProp(double[] inputs) {
    assert (this.inputSize == inputs.length);
    double[] result = internalForwardProp(inputs);
    assert (this.outputSize == result.length);
    return result;
  }

  /**
   * Computes the forward propagation of this layer.
   *
   * @param inputs Inputs to be used for computation
   * @return Output of whatever a subclass has implemented as its function
   */
  protected abstract double[] internalForwardProp(double[] inputs);

  /**
   * Computes the derivative of each element in this layer.
   *
   * @param inputs The input of size this.outputSize
   * @return An output of size this.inputSize
   */
  public final double[] backProp(double[] inputs) {
    assert (this.outputSize == inputs.length);
    double[] result = internalBackProp(inputs);
    assert (this.inputSize == result.length);
    return result;
  }

  /**
   * Computes the back propagation of this layer.
   *
   * @param inputs Inputs to be used for computation
   * @return Outputs of whatever a subclass has implemented as its function
   */
  protected abstract double[] internalBackProp(double[] inputs);
}