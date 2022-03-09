package io.github.rhames07.arithmetic;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Operation class.
 */
public class Operation {
  public static BigDecimal add(BigDecimal x, BigDecimal y) {
    return x.add(y);
  }

  public static BigDecimal subtract(BigDecimal x, BigDecimal y) {
    return x.subtract(y);
  }

  public static BigDecimal multiply(BigDecimal x, BigDecimal y) {
    return x.multiply(y);
  }

  public static BigDecimal divide(BigDecimal x, BigDecimal y) {
    return x.divide(y, RoundingMode.UNNECESSARY);
  }
}