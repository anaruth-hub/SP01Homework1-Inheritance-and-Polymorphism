package sprint01.InheritanceAndPolymorphism01.level01A;

public class StringedInstrument extends Instrument{
    static {
        System.out.println("Block of initialization static by StringedInstrument class");
    }

    {
        System.out.println("Block of initialization static by StringedInstrument class");
    }

    {
        System.out.println("Non-static initialization block of the StringedInstrument class");
    }

    public StringedInstrument(String name, double price) {
        super(name, price);
        System.out.println("StringedInstrument class builder");

    }

    @Override
    public void tap() {
        System.out.println("A stringed instrument is playing");
    }
}

