package sprint01.Exceptions01.level02A;

public class MainEntrance {
    public static void main(String[] args) {
        byte age = Entrance.readByte("Please enter your age: ");
        int number = Entrance.readInt("Please enter a whole number: ");
        float height = Entrance.readFloat("Please enter your height: ");
        double weight = Entrance.readDouble("Please enter your weight: ");
        char initial = Entrance.readChar("Please enter the initial of your name: ");
        String name = Entrance.readString("Please enter your name: ");
        boolean shouldContinue = Entrance.readYesNo("Please tell me if you wish to continue? ");

        System.out.println("\n--- RESULTS ---");
        System.out.println("Age: " + age);
        System.out.println("Number: " + number);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Initial: " + initial);
        System.out.println("Name: " + name);
        System.out.println("Continue: " + shouldContinue);
    }
}
