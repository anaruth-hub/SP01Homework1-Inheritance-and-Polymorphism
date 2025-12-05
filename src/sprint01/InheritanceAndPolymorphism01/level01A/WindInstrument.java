package sprint01.InheritanceAndPolymorphism01.level01A;

public class WindInstrument extends Instrument {
    static {
        System.out.println("Block of initialization static by WindInstrument class ");
    }

    {
        System.out.println("Non-static initialization block of the WindInstrument class ");
    }

    public WindInstrument(String name, double price) {
        super(name, price);
        System.out.println("WindInstrument class builder");
    }

    @Override
    public void tap() {
        System.out.println("A wind instrument is playing");
    }
}

