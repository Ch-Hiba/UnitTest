package com.example.test

// This class provides basic arithmetic operations: addition, subtraction, multiplication, and division.
class Calcul {

    /**
     * Performs addition of two integers.
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of the two integers.
     */
    fun calculAdd(a: Int, b: Int): Int {
        return a + b
    }

    /**
     * Performs subtraction of two integers.
     * @param a The first integer.
     * @param b The second integer.
     * @return The result of subtracting the second integer from the first.
     */
    fun calculSub(a: Int, b: Int): Int {
        return a - b
    }

    /**
     * Performs division of two integers.
     * @param a The dividend.
     * @param b The divisor.
     * @return The quotient of the division.
     * @throws ArithmeticException If the divisor is zero.
     */
    fun calculDiv(a: Int, b: Int): Int {
        if (b == 0) {
            throw ArithmeticException("Division by zero is not allowed.")
        }
        return a / b
    }

    /**
     * Performs multiplication of two integers.
     * @param a The first integer.
     * @param b The second integer.
     * @return The product of the two integers.
     */
    fun calculMultiple(a: Int, b: Int): Int {
        return a * b
    }
}
