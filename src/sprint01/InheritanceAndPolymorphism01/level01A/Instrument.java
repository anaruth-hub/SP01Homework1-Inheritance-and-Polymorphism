package sprint01.InheritanceAndPolymorphism01.level01A;

public abstract class Instrument {
    private String name;
    private double price;

    static {
        System.out.println("Static inicialization block of the Instrument class");
    }

    {
        System.out.println("Non-static initialization block of the Instrument class");
    }

    public Instrument(String name, double price) {
        System.out.println("Instrument class builder");
        this.name = name;
        this.price = price;
    }

    public abstract void tap();

    public String getName() {
        return name;

    }

    public double getPrice() {
        return price;
    }
}

