package sprint01.InheritanceAndPolymorphism01.level01A;

public class MainInstrument {
    public static void main(String[] args) {
        System.out.println("Invoking the static attribute or method");
        System.out.println("Before creating the WindInstrument instance");
        WindInstrument quena = new WindInstrument("quena", 300);
        System.out.println("After creating the WindInstrument instance");

        System.out.println("Before creating the StringedInstrument instance");
        StringedInstrument andeanHarp = new StringedInstrument("Andean Harp", 777);
        System.out.println("After creating the StringedInstrument instance");

        System.out.println("Before creating the PercussionInstrument instance");
        PercussionInstrument tinya = new PercussionInstrument("Tinya", 999);
        System.out.println("After creating the PercussionInstrument instance");

        quena.tap();
        andeanHarp.tap();
        tinya.tap();
    }

}

