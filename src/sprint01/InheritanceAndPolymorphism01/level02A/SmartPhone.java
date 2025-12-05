package sprint01.InheritanceAndPolymorphism01.level02A;

class SmartPhone extends Phone implements Camera, Clocck {
    public SmartPhone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void photograph() {
        System.out.println("A photograph is being taken");
    }

    @Override
    public void alarm() {
        System.out.println("The alarm is ringing");
    }
}

