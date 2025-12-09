package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


class DniCalculatorTest {
    @ParameterizedTest(name = "DNI {0} -> letter {1}")
    @DisplayName("Correct DNI letters")
    @CsvSource({
            "0, T",
            "1, R",
            "2, W",
            "3, A",
            "4, G",
            "5, M",
            "6, Y",
            "7, F",
            "8, P",
            "9, D",
            "10, X",
            "12345678, Z"
    })
    void calculateLetter_shouldReturnExpectedLetter(int dniNumber, String expectedLetter) {
      char actual = DniCalculator.calculateLetter(dniNumber);
      assertEquals(expectedLetter.charAt(0), actual);

    }

    @ParameterizedTest
    @DisplayName("Invalid DNI throws exception")
    @ValueSource(ints = {-1, -50, 100_000_000, Integer.MAX_VALUE})
    void calculateLetter_withInvalidNumber_shouldThrowException(int invalidDni) {
        assertThrows(IllegalArgumentException.class,
                () -> DniCalculator.calculateLetter(invalidDni));
    }

    @Test
    @DisplayName("Edge values are accepted")
    void calculateLetter_edgeValues_shouldBeAccepted() {
        assertDoesNotThrow(() -> DniCalculator.calculateLetter(0));
        assertDoesNotThrow(() -> DniCalculator.calculateLetter(99_999_999));
    }

}
