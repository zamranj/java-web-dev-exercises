package excercises.inheritance;

public class SmartPhone extends Computer {

    private double screenSize;


    public SmartPhone(int ram, int storage, boolean hasKeybaord, double screenSize) {
        super(ram, storage, hasKeybaord);

        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "SmartPhone" +
                "type= " + screenSize ;
    }

    @Override
    public void startComputer() {
        System.out.println("Phone startin up.......\n" +
                "System memory: "+ getRam()+
                "\nSystem storage: "+ getStorage()+
                "\n***Welcome***");
    }

    @Override
    public void shutDown() {
        System.out.println("Powering down.......good bye!");
    }
}
