package com.github.hcsp.controlflow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    public void test() {
        int n = new java.util.Random().nextInt(1000);
        assertEquals(
                IntStream.range(1, n).filter(Primes::isPrime).count(),
                Main.howManyPrimeNumbers(1000));
    }
}
