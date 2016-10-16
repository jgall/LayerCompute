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
    return MatrixMultiplication.transform(inputs, weights);
    // TODO : write tests for this function
  }

  /**
   * deltaThis = deltaNext*this.weights .* next.derivative
   * gradThis = deltaThis
   *
   * @param inputs Inputs to be used for computation
   */
  @Override
  protected double[] internalBackProp(double[] inputs) {
    double[] withBias = MatrixMultiplication.matMulRegular(new double[][]{inputs}, weights)[0];
    return ArrayUtils.removeFirst(withBias);
    // TODO : write tests for this function
  }


  // Haven't tested this yet, there's no way it works in this state.
  public double[] computeDelta(double[] nextDelta, double[] activationDerivatives) {
    double[] result = MatrixMultiplication.matMulRegular(new double[][]{nextDelta}, weights)[0];
    result = ArrayUtils.multiplyEach(result, activationDerivatives);
    return result;
  }
}
