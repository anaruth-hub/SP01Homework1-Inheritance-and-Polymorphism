package sprint01.InheritanceAndPolymorphism01.level01A;

public class PercussionInstrument extends Instrument{
    static {
        System.out.println("Block of initialization static by PercussionInstrument class");
    }

    {
        System.out.println("Non-static initialization block of the PercussionInstrument class");
    }

    public PercussionInstrument(String name, double price) {
        super(name, price);
        System.out.println("PercussionInstrument class builder");
    }

    @Override
    public void tap() {
        System.out.println("A percussion instrument is playing");
    }
}

