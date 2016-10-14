package Functions;

/**
 * Represents a differentiable activation function of some kind.
 */
public interface ActivationFunction {

  /**
   * Computes this function
   *
   * @param x The array of doubles on which this function will compute
   * @return The computed array of doubles
   */
  double[] compute(double[] x);

  /**
   * Computes the derivative of this function
   *
   * @param x The array of doubles for which this function will compute derivatives
   * @return The computed array of doubles
   */
  double[] derivative(double[] x);
}
