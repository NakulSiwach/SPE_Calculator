// package com.example.calculator;

// // import static org.junit.Assert.*;
// // import org.junit.Test;
// import java.math.BigInteger;

// public class CalculatorTest {

//     @Test
//     public void testSquareRoot() {
//         assertEquals(4.0, Calculator.squareRoot(16), 0.0001);
//     }

//     @Test(expected = IllegalArgumentException.class)
//     public void testSquareRootNegative() {
//         Calculator.squareRoot(-4);
//     }

//     @Test
//     public void testFactorial() {
//         assertEquals(BigInteger.valueOf(120), Calculator.factorial(5));
//     }

//     @Test(expected = IllegalArgumentException.class)
//     public void testFactorialNegative() {
//         Calculator.factorial(-3);
//     }

//     @Test
//     public void testNaturalLog() {
//         assertEquals(0.0, Calculator.naturalLog(1), 0.0001);
//     }

//     @Test(expected = IllegalArgumentException.class)
//     public void testNaturalLogNonPositive() {
//         Calculator.naturalLog(0);
//     }

//     @Test
//     public void testPower() {
//         assertEquals(8.0, Calculator.power(2, 3), 0.0001);
//     }
// }
