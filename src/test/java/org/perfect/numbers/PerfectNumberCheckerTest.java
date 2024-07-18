package org.perfect.numbers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class PerfectNumberCheckerTest {

  @Test
  void check_5_returnsFalse() {
    assertFalse(PerfectNumberChecker.checkIfPerfectNumber(5));
  }

  @Test
  void check_6_returnsTrue() {
    assertTrue(PerfectNumberChecker.checkIfPerfectNumber(6));
  }

  @Test
  void getAllPerfectNumbersInRange_WithNumber28_ExpectTwoNumbers() {
    List<Integer> result = PerfectNumberChecker.getAllPerfectNumbersInRange(28);
    assertFalse(result.isEmpty());
    assertEquals(2, result.size());
    assertTrue(result.containsAll(Arrays.asList(6, 28)));
  }

}
