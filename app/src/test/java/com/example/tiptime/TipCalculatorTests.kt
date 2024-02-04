package com.example.tiptime

import com.example.tipcalculator.calculateTip
import org.junit.Test
import java.text.NumberFormat
import org.junit.Assert.assertEquals

class TipCalculatorTests {
    @Test
    fun calculateTip_20PercentNoRoundup() {
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, roundUp = false)
        assertEquals(expectedTip, actualTip)
    }
}
