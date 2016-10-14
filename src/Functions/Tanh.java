package Functions;

/**
 * A Class representation of the tanh function.
 */
public class Tanh implements ActivationFunction {

  private double compute(double x) {
    return Math.tanh(x);
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
    return 1.0 - Math.pow(Math.tanh(x), 2);
  }
}
