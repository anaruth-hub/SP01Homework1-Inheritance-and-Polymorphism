package sprint01.Exceptions01.level02A;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class Entrance {

    private static final Scanner scanner = new Scanner(System.in);

    private Entrance() {
        throw new AssertionError("The Input class should not be instantiated. ");
    }

     public static byte readByte(String message) {
         while (true) {
             System.out.println(message + " ");
             try {
                 byte value = scanner.nextByte();
                 scanner.nextLine();
                         return value;
             } catch (InputMismatchException e) {
                 System.out.println("Format error. You must enter an integer (byte).");
                 scanner.nextLine();
             }
         }
     }
    public static int readInt(String message) {
        while (true) {
            System.out.println(message + " ");
            try {
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Formatting error. You must enter an integer (int).");
                scanner.nextLine();
            }
        }
    }
    public static float readFloat(String message) {
        while (true) {
            System.out.println(message + " ");
            try {
                float value = scanner.nextFloat();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Format error. You must enter a decimal (float) number.");
                System.out.println("If you used a period, try a comma, or vice versa depending on your regional settings.");
                scanner.nextLine();
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            System.out.println(message + " ");
            try {
                double value = scanner.nextDouble();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Format error. You must enter a decimal (double) number.");
                scanner.nextLine();
            }
        }
    }

    public static char readChar(String message) {
        while (true) {
            System.out.println(message + " ");
            String entrance = scanner.nextLine();

            try {
                return validateChar(entrance);
            } catch (EntranceException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static char validateChar(String entrance) throws EntranceException {
        if (entrance.length() == 1) {
            return entrance.charAt(0);
        }
        throw new  EntranceException("Please enter a single character");
    }

    public static String readString(String message) {
        while (true) {
            System.out.println(message + " ");
            String entrance = scanner.nextLine();

            try {
                return validateString(entrance);
            } catch (EntranceException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static String validateString(String entrance) throws EntranceException {
        if (!entrance.isBlank()) {
            return entrance;
        }
        throw new EntranceException("The chain cannot be empty.");

    }

    public static boolean readYesNo(String message) {
        while (true) {
            System.out.print(message + " (y/n): ");
            String input = scanner.nextLine().trim().toLowerCase();

            try {
                return validateYesNo(input);
            } catch (EntranceException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static boolean validateYesNo(String entrance) throws EntranceException {
        if (entrance.equals("y")) return true;
        if (entrance.equals("n")) return false;
        throw new EntranceException("The answer is invalid, please enter 'y' or 'n'. ");
    }
}
