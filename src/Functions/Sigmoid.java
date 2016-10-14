package Functions;

/**
 * A Class representation of the Sigmoid Function.
 */
public class Sigmoid implements ActivationFunction {
  private double compute(double x) {
    return 1.0 / (1.0 + Math.pow(Math.E, -x));
  }

  public double[] compute(double[] x) {
    double[] result = new double[x.length];
    for (int i = 0; i < x.length; i++) {
      result[i] = compute(x[i]);
    }
    return result;
  }

  public double[] derivative(double[] x) {
    double[] result = new double[x.length];
    for (int i = 0; i < x.length; i++) {
      result[i] = derivative(x[i]);
    }
    return result;
  }

  private double derivative(double x) {
    return compute(x) * (1 - compute(x));
  }
}
