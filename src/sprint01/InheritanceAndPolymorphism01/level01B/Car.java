package sprint01.InheritanceAndPolymorphism01.level01B;

public class Car {
    private static  final String brand = "Ponny";
    private static String model;
    private final double power;

    static {
        model = "Beautiful";
    }
    public Car(double power) {
        this.power = power;
    }

    public static void curb () {
        System.out.println("The vehicle is braking");
    }

    public void  acelerate() {
        System.out.println("The vehicle is acelerate");



    }
}

