package com.example.calculator

import java.lang.IllegalArgumentException
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CalculatorTest {
    private val calc = Calculator()

    @Test
    fun `add should return sum of two numbers`() {
        assertEquals(5.0, calc.add(2.0, 3.0))
    }

    @Test
    fun `subtract should return difference of two numbers`() {
        assertEquals(4.0, calc.subtract(7.0, 3.0))
    }

    @Test
    fun `multiply should return product of two numbers`() {
        assertEquals(10.0, calc.multiply(2.0, 5.0))
    }

    @Test
    fun `divide should return quotient of two numbers`() {
        assertEquals(2.5, calc.divide(5.0, 2.0))
    }

    @Test
    fun `divide should throw exceptions when dividing by zero`() {
        val exception = assertThrows<IllegalArgumentException> { calc.divide(5.0, 0.0) }
        assertEquals("Divider must not be zero.", exception.message)
    }
}
