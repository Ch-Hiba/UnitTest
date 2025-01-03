import com.example.test.Calcul
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

// This is the test class for the Calcul class, following the principles of TDD (Test-Driven Development).
class CalculTDDTest {

    /**
     * Tests the addition functionality of the Calcul class.
     * Ensures that the sum of two integers is calculated correctly.
     */
    @Test
    fun `test addition`() {
        val calcul = Calcul()
        assertEquals(5, calcul.calculAdd(2, 3)) // Expected result: 2 + 3 = 5
    }

    /**
     * Tests the subtraction functionality of the Calcul class.
     * Ensures that the difference between two integers is calculated correctly.
     */
    @Test
    fun `test subtraction`() {
        val calcul = Calcul()
        assertEquals(1, calcul.calculSub(3, 2)) // Expected result: 3 - 2 = 1
    }

    /**
     * Tests the division functionality of the Calcul class.
     * Ensures that division is performed correctly when valid integers are provided.
     */
    @Test
    fun `test division`() {
        val calcul = Calcul()
        assertEquals(2, calcul.calculDiv(6, 3)) // Expected result: 6 / 3 = 2
    }

    /**
     * Tests the multiplication functionality of the Calcul class.
     * Ensures that the product of two integers is calculated correctly.
     */
    @Test
    fun `test multiplication`() {
        val calcul = Calcul()
        assertEquals(6, calcul.calculMultiple(2, 3)) // Expected result: 2 * 3 = 6
    }

    /**
     * Tests the division method for an invalid case: division by zero.
     * Ensures that the method throws an ArithmeticException in this scenario.
     */
    @Test
    fun `test division by zero`() {
        val calcul = Calcul()
        assertThrows<ArithmeticException> {
            calcul.calculDiv(6, 0) // Division by zero should throw an exception.
        }
    }
}
