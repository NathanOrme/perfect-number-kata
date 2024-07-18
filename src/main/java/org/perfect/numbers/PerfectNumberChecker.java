package org.perfect.numbers;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PerfectNumberChecker {

  private static final Logger logger = LoggerFactory.getLogger(PerfectNumberChecker.class);

  public static boolean checkIfPerfectNumber(final int number) {
    if (1 == number) {
      return false;
    }
    int halfOfNumber = number / 2;
    List<Integer> divisors = IntStream.rangeClosed(1, halfOfNumber)
        .boxed()
        .filter(divisor -> number % divisor == 0)
        .toList();
    logger.info("Divisors for number {}: {}", number, divisors);
    int divisorsTotal = divisors.stream().reduce(0, Integer::sum);
    return divisorsTotal == number;
  }

  public static List<Integer> getAllPerfectNumbersInRange(final int number) {
    if (1 == number) {
      return Collections.emptyList();
    }
    return IntStream.rangeClosed(1, number)
        .boxed()
        .filter(PerfectNumberChecker::checkIfPerfectNumber)
        .toList();
  }

}
