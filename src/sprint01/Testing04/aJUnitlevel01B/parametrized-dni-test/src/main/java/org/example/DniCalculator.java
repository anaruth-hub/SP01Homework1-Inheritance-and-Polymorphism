package org.example;

public final class DniCalculator {

    private static final String LETTERS = "TRWAGMYFPDXBNJZSQVHLCKE";
    private DniCalculator() {}

    public static char calculateLetter(int dniNumber) {
        if (dniNumber < 0 || dniNumber > 99_999_999 ) {
            throw new IllegalArgumentException("DNI number must be between 0 and 99,999,999");

        }

        int index = dniNumber % 23;
        return LETTERS.charAt(index);
    }
}
