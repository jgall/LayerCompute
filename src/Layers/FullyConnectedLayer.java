package Layers;

import Functions.ArrayUtils;
import Functions.MatrixMultiplication;

/**
 * represents a fully connected layer from R^n -> R^m (it's a matrix multiplication lets be real
 */
public class FullyConnectedLayer extends Layer {

  private double[][] weights;

  public FullyConnectedLayer(int inputSize, int outputSize, double[][] initialWeights) {
    super(inputSize, outputSize);
    // add one to account for bias weights
    assert (initialWeights.length == this.outputSize);
    assert (initialWeights[0].length == this.inputSize + 1);
    this.weights = initialWeights;
  }

  @Override
  protected double[] internalForwardProp(double[] inputs) {
    double[] withBias = ArrayUtils.appendDouble(inputs, 1);
    MatrixMultiplication.transform(inputs, weights);
    return new double[0];
    // TODO : write tests for this function
  }

  @Override
  protected double[] internalBackProp(double[] inputs) {
    // TODO : finish this function
    return new double[0];
  }
}
